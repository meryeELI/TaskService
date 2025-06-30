package Menu;
import Model.Proyect;
import Model.User;

import Service.TaskManager;


import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private TaskManager manager;

    public Menu(TaskManager manager) {
        this.manager = manager;
    }

    public void mostrarMenu() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n=== GESTIÓN DE TAREAS ===");
            System.out.println("1. Crear tarea");
            System.out.println("2. Ver tareas por usuario");
            System.out.println("3. Ver tareas por proyecto");
            System.out.println("4. ver todo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar

            switch (opcion) {
                case 1:
                    crearTarea();
                    break;
                case 2:
                    mostrarTareasUsuario();
                    break;
                case 3:
                    mostrarTareasProyecto();
                    break;
                case 4:
                    mostrarTodo();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    private void crearTarea() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descripción: ");
        String descripcion = scanner.nextLine();
        System.out.print("Nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();
        System.out.print("Nombre del proyecto: ");
        String nombreProyecto = scanner.nextLine();

        User user = new User(nombreUsuario);
        Proyect project = new Proyect(nombreProyecto);
        manager.createTask(titulo, descripcion, user, project);
    }

    private void mostrarTareasUsuario() {
        System.out.print("Nombre del usuario: ");
        String nombre = scanner.nextLine();
        User user = new User(nombre);
        manager.showTasksByUser(user);
    }

    private void mostrarTareasProyecto() {
        System.out.print("Nombre del proyecto: ");
        String nombre = scanner.nextLine();
        Proyect project = new Proyect(nombre);
        manager.showTasksByProject(project);
    }

    private  void mostrarTodo(){
        manager.showTasks();
    }
}
