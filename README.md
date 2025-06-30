# TaskService
Sistema de registro de tareas

# Clases principales:

Task: representa una tarea individual tarea.

Project: agrupa varias tareas.

User: representa a un usuario del sistema.

TaskManager: Creación y gestión de tareas.

# Interfaces principales:

ITaskRepository: operaciones de almacenamiento/consulta de tareas.

INotificationService: servicio de notificación.

# principios solid

S - Single Responsibility

Cada clase debe tener una responsabilidad única.

Task: representa el modelo de una tarea.

TaskManager: gestiona tareas (crear, asignar, mostrar).

TaskRepository:  guarda tareas de memoria o BD.de momenyto solo memoria.

O - Open/Closed

Las clases deben estar abiertas a extensión, pero cerradas a modificación.

interfaz ITaskRepository, y clases como InMemoryTaskRepository la implementan. en caso de agregar una BD solo se crea InDatabaseRepository e implementa la interfaz.

L - Liskov Substitution
Una subclase debe poder reemplazar a su superclase sin matar el programa.

ITaskRepository repo = new InMemoryTaskRepository(); o new InDatabaseRepository();, debe comportarse igual, sin errores.

Interface Segregation
 muchas interfaces pequeñas que una grande.

INotificationService solo notifica.

ITaskRepository solo almacenamiento.

D - Dependency Inversion
Depender de interfaces, no de clases concretas.

TaskManager usa ITaskRepository y INotificationService, no sabe si están en memoria o base.

# Funcionalidad.

Se puedan asignar tareas a proyectos.

Se puedan asignar tareas a usuarios.

El sistema permite al usuario ver tareas por proyecto y por usuario o todos.

al ingresar selecciona una opcion del menu 1 crear titulo tarea, descripcion, usuario, proyecto -- guardar
 mostrar por usuario -- lista por usuario
mostrar por proyecto -- lista por proyecto
mostrar todo -- lista en detalle cada tarea incluyendo usuario y proyecto asignado.







