package Service;

import Model.Proyect;
import Model.Task;
import Model.User;
import Notification.INotificacionService;
import Repository.ItaskRepository;

// TaskManager.java  orquesta la creación y gestión de tareas.
public class TaskManager {
    private ItaskRepository repository;
    private INotificacionService notifier;

    public TaskManager(ItaskRepository repository, INotificacionService notifier) {
        this.repository = repository;
        this.notifier = notifier;
    }

    public void createTask(String title, String description, User user, Proyect project) {
        Task task = new Task(title, description);
        task.assignUser(user);
        task.assignProject(project);
        repository.addTask(task);
        notifier.notify("Tarea creada: " + title + " para " + user.getName() + " en el proyecto " + project.getName());
    }

    public void showTasks() {
        for (Task task : repository.getAllTasks()) {
            System.out.println("titulo - " + task.title() +" Proyecto: "+task.getProject().getName()+" Descripcion:"+task.description()+ " usuario asignado: "+task.getAssignedUser().getName());
        }
    }
    public void showTasksByUser(User user) {
        System.out.println("Tareas asignadas a " + user.getName() + ":");
        for (Task task : repository.getAllTasks()) {
            if (task.getAssignedUser() != null && task.getAssignedUser().getName().equals(user.getName())) {
                System.out.println("- " + task.title() + " Descripcion: "+ task.description());
            }
        }
    }
    public void showTasksByProject(Proyect project) {
        System.out.println("Tareas del proyecto " + project.getName() + ":");
        for (Task task : repository.getAllTasks()) {
            if (task.getProject() != null && task.getProject().getName().equals(project.getName())) {
                System.out.println("- " + task.title()+ " Descripcion: "+task.description()+ " usuario asignado: "+task.getAssignedUser().getName());
            }
        }
    }
}
