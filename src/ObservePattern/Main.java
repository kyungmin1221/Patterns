package ObservePattern;

public class Main {
    public static void main(String[] args) {
            News news = new News();

            Subscriber1 sub1 = new Subscriber1("박경민");
            Subscriber2 sub2 = new Subscriber2("윤가연");

            news.attach(sub1);
            news.attach(sub2);

            String news_contents = "레시아 -우크라이나 관련 뉴스입니다 ";
            news.notifyObservers(news_contents);

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

            news.detach(sub1);
            news.notifyObservers(news_contents);

    }
}
