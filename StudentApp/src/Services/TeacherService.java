package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher>{
    /**
     * @param count - Количество людей в списке
     */
    private int count;
    /**
     * @param teachers - Список учителей
     */
    private List<Teacher> teachers;

    /**
     * Создание списка учителей
     */
    public TeacherService(){
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "Docent");
        count++;
        teachers.add(teach);

    }

    /**
     * Сортировка списка по именам
     */
    public void sortedByFIO() {
        PersonComparator<Teacher> teachCorp = new PersonComparator<Teacher>();
        teachers.sort(teachCorp);
    }

    /**
     * Вывод списка учителей
     */
    public void getTeachers() {
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }
}
