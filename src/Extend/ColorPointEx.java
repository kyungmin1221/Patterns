package Extend;

import java.awt.*;
import java.nio.channels.Pipe;

class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("기본 생성자");
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void showPoint(){
        System.out.println(x + ",,," + y);
    }
}
class ColorPoint extends Point {
    private String color;

    public ColorPoint(String color) {
      //  super(1,1);
        this.color =color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }

}


public class ColorPointEx {
    public static void main(String[] args) {

        Point p =new Point(1,2);
        p.showPoint();
        ColorPoint cp = new ColorPoint("red");
        cp.showColorPoint();
    }

}
