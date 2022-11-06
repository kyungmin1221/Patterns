package CommandPattern2;


// 티비를 켜는 기능을 구현하고 싶다면 ?
public class TVOnCommand implements Command{
    private TV tv;

    public TVOnCommand(TV tv)
    {
        this.tv = tv;

    }

    @Override
    public void run() {
        tv.On();
    }
}
