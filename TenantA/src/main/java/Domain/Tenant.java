package Domain;

import java.io.Serializable;


    public class Tenant implements Serializable {
        private String id;
        private String firstname;
        private String lastname;
        private int apartmntno;

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

        private Tenant() {
        }

        public Tenant(Builder builder) {
            this.id = builder.id;
            this.firstname = builder.firstname;
            this.lastname = builder.lastname;
        }

        public static class Builder {
            private String id;
            private String firstname;
            private String lastname;
            private int apartmntno;

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

            public Tenant build() {
                return new Tenant(this);
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Tenant tenant = (Tenant) o;

            return id.equals(tenant.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }

    }