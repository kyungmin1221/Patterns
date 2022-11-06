package ObservePattern;

import java.util.ArrayList;
import java.util.List;

public class News {

    private List<Observe> observers = new ArrayList<Observe>();

    // 1. 옵저브 리스트에 추가
    public void attach(Observe observe) {
        observers.add(observe);
    }

    // 2. 옵저버 리스트에서 제거
    public void detach(Observe observe) {
        observers.remove(observe);
    }

    // 3. 옵저버들에세 알림
    public void notifyObservers(String news_contents) {
        for(int i=0; i<observers.size(); i++)
        {
            Observe o = observers.get(i);
            o.receive(news_contents);
        }
    }
}
