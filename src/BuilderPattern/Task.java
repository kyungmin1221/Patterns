package BuilderPattern;

public class Task {
    private int Id;
    private String name;

    public Task(int Id, String name) {
        this.Id =Id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Task{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
