package WorkingWithAbstractionsLab.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private final Map<String, Student> repo;

    public StudentSystem() {
        this.repo = new HashMap<>();
    }

    public void createStudent(String name, int age, double grade) {
        //качествен код - в началото изписваме граничните случаи
        if (repo.containsKey(name)) { return; }

        Student student = new Student(name, age, grade);
        repo.put(name, student);
    }

    public String showStudent(String name) {
        //FIXME: missing student
        //TODO: we have a tab down where we can see all to do
        Student student = this.repo.get(name);

        if (student == null){
            return null;
        }

        return student.toString();
    }
}
