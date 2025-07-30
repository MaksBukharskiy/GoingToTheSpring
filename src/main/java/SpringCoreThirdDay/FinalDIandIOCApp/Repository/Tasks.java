package SpringCoreThirdDay.FinalDIandIOCApp.Repository;

public class Tasks {
    String taskName;

    public Tasks(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String toString() {
        return "Tasks - [taskName: " + taskName + "]";
    }

}
