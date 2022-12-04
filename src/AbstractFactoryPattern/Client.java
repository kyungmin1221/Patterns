package AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
//        ComputerFactory cFactory = new ComputerFactory();
//        cFactory.createComputer("Samsung");

        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("Samsung");
    }
}
