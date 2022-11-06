package patternbuilder;

public class TestBuilderPattern {

    public static void main(String[] args) {

        ComputerBuilder com = new ComputerBuilder();
        com.setRAM("3");
        com.setGrhCardEnabled(true);
        com.setBlueEnabled(true);
        Computer c1 = com.build();

        System.out.println(c1);


    }
}
