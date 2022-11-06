package CommandPattern2;

public class Client {
    public static void main(String[] args) {
        Heater heater = new Heater();
        Lamp lamp = new Lamp();
        TV tv = new TV();

        Command heaterOnCommand = new HeaterOnCommand(heater);
        Command lampOnCommand = new LampOnCommand(lamp);
        Command tvOnCommand = new  TVOnCommand(tv);

        OKGoogle okGoogle = new OKGoogle();

        okGoogle.setCommand(heaterOnCommand);
        okGoogle.talk();

        okGoogle.setCommand(lampOnCommand);
        okGoogle.talk();

        // 티비를 켜는 기능을 구현하고 싶다면 ?
        okGoogle.setCommand(tvOnCommand);
        okGoogle.talk();



    }
}
