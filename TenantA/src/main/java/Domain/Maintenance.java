package Domain;


import java.io.Serializable;


    public class Maintenance implements Serializable {
        private String electrical;
        private String plumbing;
        private String general;
        private int apartmntno;

        public String getElectrical() {
            return getElectrical();
        }

        public String getPlumbing() {
            return plumbing;
        }

        public String getGeneral() {
            return general;
        }

        public int getApartmntno() {
            return apartmntno;
        }

        private Maintenance() {
        }

        public Maintenance(Builder builder) {
            this.apartmntno = builder.apartmntno;
            this.electrical = builder.electrical;
            this.plumbing = builder.plumbing;
            this.general = builder.general;
        }

        public static class Builder {
            private String electrical;
            private String plumbing;
            private String general;
            private int apartmntno;

            public Builder electrical(String value) {
                this.electrical = value;
                return this;
            }

            public Builder plumbing (String value) {
                this.plumbing = value;
                return this;
            }

            public Builder general(String value) {
                this.general = value;
                return this;
            }

            public Builder apartmntno(int value) {
                this.apartmntno = value;
                return this;
            }

            public Maintenance build() {
                return new Maintenance(this);
            }

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Maintenance maintenance = (Maintenance) o;

            return apartmntno == maintenance.apartmntno;
        }

    }

