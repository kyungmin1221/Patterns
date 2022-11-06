package CommadPattern;

// 커맨드 패턴에서 클라이언트에 해당이 되는 부분
public class RemoteControlTest {
    public static void main(String[] args) {

        // 필요한 적업을 요청할 때 사용한 커맨드 객체를 인자로 전달
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();

        // 커맨드 객첼르 생성하고 리시버를 전달
        LightOnCommand lighton = new LightOnCommand(light);

        // 커맨드 객체를 인보커에세 전달
        remote.setCommand(lighton);
        // 실제 리모컨 버튼을 누름
        remote.buttonPressed();
    }
}
