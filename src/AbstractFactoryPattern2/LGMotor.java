package AbstractFactoryPattern2;

import com.sun.javafx.scene.traversal.Direction;

public class LGMotor extends Motor {
    protected void moveMotor(Direction direction) {
        System.out.println("move LG motor");
    }
}
