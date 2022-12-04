package TempletMethodPattern;

public class Main {
    public static void main(String[] args) {

        Tea myTea = new Tea();
        myTea.prepareRecipe();
        System.out.println("----------------------");
        myTea.brew();


    }
}
