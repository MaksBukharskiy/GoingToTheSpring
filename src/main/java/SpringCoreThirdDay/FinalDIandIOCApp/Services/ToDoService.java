package SpringCoreThirdDay.FinalDIandIOCApp.Services;

import SpringCoreThirdDay.FinalDIandIOCApp.Repository.TaskRepository;
import SpringCoreThirdDay.FinalDIandIOCApp.Repository.Tasks;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
    private final TaskRepository store;

    public ToDoService(TaskRepository store) {
        this.store = store;
    }

    public void addTask(String taskName) {
        store.addTask(new Tasks(taskName));
    }

    public Tasks findTask(String taskName) {
        return store.findTask(taskName);
    }

    public void showAllTaks(){
        store.getTasksList().forEach(t -> System.out.println(t));
    }

}
