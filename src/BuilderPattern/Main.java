package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        TaskBuilder taskb = new TaskBuilder();
        taskb.setName("박경민");
        taskb.setId(2071477);

        Task task1 = taskb.build();
        System.out.println(task1);
    }
}
