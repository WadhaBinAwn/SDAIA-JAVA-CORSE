package HomeWork.HW2;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;


    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;

    }


    public ArrayList<Student> getAllStudents() {
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

