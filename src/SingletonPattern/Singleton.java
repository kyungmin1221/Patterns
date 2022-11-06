package SingletonPattern;

// 1번
// 인스턴스가 필요하기 전까진 인스턴스를 아예 생성하지 않음 -> 게으른 인스턴스 생성
public class Singleton {
    private static Singleton Instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(Instance == null)
           Instance = new Singleton();


        return Instance;
    }
}

// 2번
// 1번 코드는 멀티 스레딩 방식에서 동기화가 되지 않음
// 만약 a가 if문에 들어가서 객체를 하나 만들고, b가 if문에 들어가 또 객체를 하나 만들기 때문에 총 2개의 객체가 생김
// synchronized 키워드를 통해 동기화를 해줌
// BUT, 100배정도 느려짐 ....
// 다른 방법 ?
//public class Singleton {
//    private static Singleton Instance;
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if(Instance == null)
//            Instance = new Singleton();
//
//
//        return Instance;
//    }
//}

// 3번
// 미리 객체를 생성하는 패턴
// 2번보다 안전할 수 는 있지만 , 객체가 사용되지 않을시 메모리 낭비
// 그럼..?
//public class Singleton {
//    private static Singleton Instance = new Singleton();
//
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        return Instance;
//    }
//}

//4번
// DCL - Double-Checking Locking 이중검사 방법
// 인스턴스를 한번 확인하고 동기화를 내부해서 해줌
// 메서드에서 동기화 역활을 해주고 있으므로 synchronized 비용 절감

//public class Singleton {
//    private volatile static Singleton Instance;
//
//    private Singleton() {}
//
//    public static Singleton getInstance() { // 메서드에서 동기화 역활을 해주고 있으므로 synchronized 비용 절감
//        if(Instance == null)
//            synchronized (Singleton.class){
//                if(Instance == null)
//                    Instance = new Singleton();
//        }
//        return Instance;
//    }
//}


