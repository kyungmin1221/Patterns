package AbstractFactoryPattern;

public class LGComputerFactory implements ComputerFactory {
    public LGKeyboard createKeyboard() {
        return new LGKeyboard();
    }

//    @Override
//    public Mouse creteMouse() {
//        return null;
//    }

    public LGMouse createMouse() {
        return new LGMouse();
    }
}
