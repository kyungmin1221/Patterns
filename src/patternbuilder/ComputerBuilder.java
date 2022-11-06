package patternbuilder;

public class ComputerBuilder {

        private String HDD="";
        private String RAM="";

        private boolean isGrhCardEnabled = false;
        private boolean isBlueEnabled = false;

//        public ComputerBuilder(String HDD, String RAM) {
//            this.HDD = HDD;
//            this.RAM = RAM;
//        }


    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public void setGrhCardEnabled(boolean grhCardEnabled) {
            isGrhCardEnabled = grhCardEnabled;
        }

        public void setBlueEnabled(boolean blueEnabled) {
            isBlueEnabled = blueEnabled;
        }

        public Computer build() {
            return new Computer(HDD,RAM,isGrhCardEnabled,isBlueEnabled);
        }

    }


