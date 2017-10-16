package Domain;

import java.io.Serializable;


public class Admin implements Serializable {
    private String AdminId;
    private String name;
    private String surname;


    public String getAdminId() {
        return AdminId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private Admin() {
    }

    public Admin(Builder builder) {
        this.AdminId = builder.AdminId;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static class Builder {

        private String name;
        private String surname;
        private String AdminId;

        public Builder AdminId(String value) {
            this.AdminId = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Admin admin = (Admin) o;

        return AdminId.equals(admin.AdminId);
    }

    @Override
    public int hashCode() {
        return AdminId.hashCode();
    }
}



