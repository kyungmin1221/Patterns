package CommadPattern;

public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // on 버튼을 연결
        light.on();

        // off 버튼을 연결하고 싶다면 ?
        //  light.off();
    }
}
