package Domain;

import java.io.Serializable;


public class Property implements Serializable {
    private String id;
    private int apartmntno;
    private int nbedroom;
    private int nbathroom;


    public String getId() {
        return id;
    }

    public int getApartmntno() {
        return apartmntno;
    }

    public int getNbedroom() {
        return nbedroom;
    }

    public int getNbathroom() {
        return nbathroom;
    }

    private Property() {
    }

    public Property(Builder builder) {
        this.id = builder.id;
        this.apartmntno = builder.apartmntno;
        this.nbedroom = builder.nbedroom;
        this.nbathroom = builder.nbathroom;
    }

    public static class Builder {

        private String id;
        private int apartmntno;
        private int nbedroom;
        private int nbathroom;

        public Builder id(String value) {
            this.id = value;
            return this;
        }

        public Builder apatmntno(int value) {
            this.apartmntno = value;
            return this;
        }

        public Builder nbedroom(int value) {
            this.nbedroom = value;
            return this;
        }

        public Builder nbathroom(int value) {
            this.nbathroom = value;
            return this;
        }


        public Property build() {
            return new Property(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Property property = (Property) o;

        return id == property.id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}