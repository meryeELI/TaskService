package Notification;

public class ConsoleNotificacionService implements INotificacionService {
    public void notify(String message) {
        System.out.println("NOTIFICACIÓN: " + message);
    }
}
