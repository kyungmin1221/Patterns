package JavaPractice;

import java.util.Scanner;

class Day {
    private String work;

    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if(work == null){
            System.out.println("없습니다. ");
        }
        else {
            System.out.println(work + "입니다");
        }
    }
}

public class MonthSchedule {

    Scanner scanner = new Scanner(System.in);
    private int y;
    private Day day[];

    public MonthSchedule(int y) {
        this.y = y;
        day = new Day[y];
        for(int i=0; i<day.length; i++) {
            day[i] = new Day();
        }
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while(true) {
            System.out.print("할일(입력 : 1, 보기 : 2 , 끝내기 : 3) >> ");
            int num = scanner.nextInt();

            if (num == 1) {
                input();

            } else if (num == 2) {
                view();

            } else if (num == 3) {
                finish();
                break;
            }
        }
    }
    public void input() {
        System.out.print("날짜(1~30)? >> ");
        int a = scanner.nextInt();   // 날짜 입력
        System.out.print("할 일(빈칸 없이 입력) >> " );
        String work = scanner.next();
        day[a-1].set(work);
        System.out.println();
    }

    public void view(){
        System.out.print("날짜(1~30)? >> ");
        int a = scanner.nextInt();   // 날짜 입력
        System.out.print(a + "일 할 일은 ");
        day[a-1].show();





    }
    public void finish(){
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }

    public static void main(String[] args) {

        MonthSchedule april = new MonthSchedule(30);
        april.run();
        Day day2 = new Day();



    }

}
