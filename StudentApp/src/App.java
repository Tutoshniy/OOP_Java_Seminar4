import Controlers.AccountController;
import Services.EmployeeService;
import Services.StudentService;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        // Создание списка учителей и нахождение среднего возраста в нём
        TeacherService tserv = new TeacherService();
        tserv.create("Аркадий", 40);
        tserv.create("Евгений", 48);
        tserv.create("Богдан", 33);
        System.out.println(AccountController.averageAge(tserv.getAll()));
        tserv.sortedByFIO();
        tserv.getTeachers();

        // Создание списка студентов и нахождение среднего возраста в нём
        StudentService studServ = new StudentService();
        studServ.create("Иван", 25);
        studServ.create("Игорь", 23);
        studServ.create("Иван", 22);
        studServ.create("Игорь", 23);
        studServ.create("Даша", 23);
        studServ.create("Лена", 23);
        System.out.println(AccountController.averageAge(studServ.getAll()));

        // Создание списка работников и нахождение среднего возраста в нём
        EmployeeService emplServ = new EmployeeService();
        emplServ.create("Григорий", 37);
        emplServ.create("Михаил", 49);
        emplServ.create("Геннадий", 46);
        System.out.println(AccountController.averageAge(emplServ.getAll()));

    }
}
