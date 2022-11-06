import javax.swing.plaf.nimbus.State;
import java.util.Date;

public class Task {

  //  private final long id;
    private String summary = "";
    private String decription = "";
    private boolean done = false;
    private Date dueDate;

 //   public State state;

    public Task( String summary, String decription, boolean done, Date dueDate) {
    //    this.id = id;
        this.summary = summary;
        this.decription = decription;
        this.done = done;
        this.dueDate = dueDate;
    }
//
//    public long getId() {
//        return id;
//    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return ", summary='" + summary + '\'' + ", decription='" + decription + '\'' +
                ", done=" + done +
                ", dueDate=" + dueDate +
                '}';
    }
}
