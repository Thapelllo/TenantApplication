package Domain;


import java.io.Serializable;
import java.util.Date;


public class Lease implements Serializable {
    private String id;
    private String firstname;
    private String lastname;
    private int apartmntno;
    private Date startdate;
    private Date enddate;
    private boolean securitydeposit;


    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getApartmntno() {
        return apartmntno;
    }

    public Date getStartdate() {
        return startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public Boolean securitydeposit() {
        return true;
    }

    private Lease() {
    }

    public Lease(Builder builder) {
        this.apartmntno = builder.apartmntno;
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.startdate = builder.startdate;
        this.enddate = builder.enddate;
        this.securitydeposit = builder.securitydeposit;
    }

    public static class Builder {
        private String id;
        private String firstname;
        private String lastname;
        private int apartmntno;
        private Date startdate;
        private Date enddate;
        private boolean securitydeposit;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder firstname(String value) {
            this.firstname = value;
            return this;
        }

        public Builder lastname(String value) {
            this.lastname = value;
            return this;
        }

        public Builder apartmntno(int value) {
            this.apartmntno = value;
            return this;
        }

        public Builder startdate(Date value) {
            this.startdate = value;
            return this;
        }

        public Builder enddate(Date value) {
            this.enddate = value;
            return this;
        }


        public Lease build() {
            return new Lease(this);
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lease lease = (Lease) o;

        return id.equals(lease.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}


