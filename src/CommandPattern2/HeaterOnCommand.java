package CommandPattern2;

public class HeaterOnCommand implements Command{
    private Heater heater;

    public HeaterOnCommand(Heater heater)
    {
        this.heater = heater;
    }

    @Override
    // 히터의 메소드 구현
    public void run() {
        heater.powerOn();
    }
}
