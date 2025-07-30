package SpringCoreThirdDay.FinalDIandIOCApp.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskRepository {
    private final List<Tasks> tasksList = new ArrayList<>();

    public void addTask(Tasks task) {
        tasksList.add(task);
    }

    public List<Tasks> getTasksList() {
        return tasksList;
    }

    public Tasks findTask(String name) {
        for (Tasks task : tasksList) {
            if (task.getTaskName().equals(name)) {
                return task;
            }
            else {
                System.out.println("No such task found");
            }
        }
        return null;
    }

}
