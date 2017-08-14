package Domain;

import java.io.Serializable;

public class Tenant {


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
            this.age = builder.age;
            this.id = builder.id;
            this.firstname = builder.firstname;
            this.lastname = builder.lastname;
        }

        public static class Builder{
            private String id;
            private String firstname;
            private String lastname;
            private int age;

            public Builder id(String value){
                this.id = value;
                return this;
            }

            public Builder firstname(String value){
                this.firstname = value;
                return this;
            }

            public Builder lastname(String value){
                this.lastname = value;
                return this;
            }

            public Builder age(int value){
                this.age = value;
                return this;
            }

            public Person build(){
                return new Person(this);
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            return id.equals(person.id);
        }

        @Override
        public int hashCode() {
            return id.hashCode();
        }
    }

}
