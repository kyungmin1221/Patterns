package StatePattern;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getState());

        person.setState( new Scissors());
        System.out.println(person.getState());

        person.setState(new Paper());
        System.out.println(person.getState());
    }
}
