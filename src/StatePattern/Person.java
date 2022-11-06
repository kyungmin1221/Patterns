package StatePattern;

public class Person {
    private HandState handState;

    public Person() {
        handState = new Rock();
    }

    public String getState() {
        return handState.getState();
    }

    public void setState(HandState handState) {
        this.handState = handState;
    }
}
