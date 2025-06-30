package Repository;

import Model.Task;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements ItaskRepository  {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
