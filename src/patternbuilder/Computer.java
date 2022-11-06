package patternbuilder;


public class Computer {

    private String HDD="";
    private String RAM="";

    private boolean isGrhCardEnabled = false;
    private boolean isBlueEnabled = false ;

    // 생성자
    public Computer(String HDD, String RAM, boolean isGrhCardEnabled, boolean isBlueEnabled) {
        this.HDD=HDD;
        this.RAM=RAM;
        this.isGrhCardEnabled=isGrhCardEnabled;
        this.isBlueEnabled=isBlueEnabled;
    }

// 게터 세터
    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGrhCardEnabled() {
        return isGrhCardEnabled;
    }

    public boolean isBlueEnabled() {
        return isBlueEnabled;
    }

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

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isGrhCardEnabled=" + isGrhCardEnabled +
                ", isBlueEnabled=" + isBlueEnabled +
                '}';
    }

}

