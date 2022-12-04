package CommadPattern;

// 커맨드 패턴에서 클라이언트에 해당이 되는 부분
public class RemoteControlTest {
    public static void main(String[] args) {

        // 필요한 적업을 요청할 때 사용한 커맨드 객체를 인자로 전달
        SimpleRemoteControl remote = new SimpleRemoteControl();    // 램프
        SimpleRemoteControl remote2 = new SimpleRemoteControl();   // 일림
        Light light = new Light();
        Alarm alarm = new Alarm();

        // 커맨드 객첼르 생성하고 리시버를 전달
        LightOnCommand lighton = new LightOnCommand(light);   // 램프
        AlarmOnCommand alarmon = new AlarmOnCommand(alarm);   // 알람
        // 커맨드 객체를 인보커에세 전달
        remote.setCommand(lighton);

        remote2.setCommand(alarmon);
        // 실제 리모컨 버튼을 누름
        remote.buttonPressed();

        remote2.buttonPressed();

    }
}
