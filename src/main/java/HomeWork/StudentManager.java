package HomeWork;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Students> students;


    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public Students getStudentById(int id) {
        for (Students student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;

    }


    public ArrayList<Students> getAllStudents() {
        return students;
    }

    public boolean removeStudentById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }




}

