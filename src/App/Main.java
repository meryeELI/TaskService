package App;

import Menu.Menu;
import Notification.ConsoleNotificacionService;
import Notification.INotificacionService;
import Repository.InMemoryTaskRepository;
import Repository.ItaskRepository;
import Service.TaskManager;

public class Main {
    public static void main(String[] args) {
        ItaskRepository repository = new InMemoryTaskRepository();
        INotificacionService notifier = new ConsoleNotificacionService();
        TaskManager manager = new TaskManager(repository, notifier);

        Menu menu = new Menu(manager);
        menu.mostrarMenu();
    }
}
