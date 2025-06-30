package Repository;

import Model.Task;

import java.util.List;
//operaciones de almacenamiento/consulta de tareas.
public interface ItaskRepository
{
    void addTask(Task task);
    List<Task> getAllTasks();
}
