import java.util.Date;

public class TaskBuilder {

  //  private final long id;
    private String summary = "";
    private String decription = "";
    private boolean done = false;
    private Date dueDate;

    // 생성자
//    public TaskBuilder(long id, String summary, String decription, boolean done, Date dueDate) {
//        this.id = id;
//        this.summary = summary;
//        this.decription = decription;
//        this.done = done;
//        this.dueDate = dueDate;
//    }

//    public TaskBuilder(long id) {
//        this.id = id;
//    }

    // 세터 구현
    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Task build() {

      //  옵셔널한 값들에 대해서는 각각의 속성마다 메소드로 제공하며, 이때 중요한 것은 메소드의 리턴 값이 빌더 객체 자신이어야 합니다.
        return new Task(summary,decription,done,dueDate);
    }

}











