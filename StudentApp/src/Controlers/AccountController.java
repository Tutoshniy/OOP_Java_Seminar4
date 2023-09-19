package Controlers;

import java.util.List;

import Domen.Person;
import Domen.Teacher;

public class AccountController {
    private static double res;
    public <T extends Teacher> void paySalary(T person, int salary){
        System.out.println(person.getName() + " выплачена зарплата " + salary + "р. ");
    }

    public static <T extends Person> double averageAge(List<T> persons) {
        for (T pers : persons) {
            res += pers.getAge();
        }
        return res/persons.size();
    }
}
