package BuilderPattern;

public class TaskBuilder {
    private int Id;
    private String name;

//    public TaskBuilder(int Id, String name) {
//        this.Id = Id;
//        this.name = name;
//    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Task build() {
        return new Task(Id,name);
    }
}
