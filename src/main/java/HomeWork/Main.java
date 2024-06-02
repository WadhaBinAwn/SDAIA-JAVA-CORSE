package HomeWork;

public class Main {
    public static void main(String[] args) {




        Students student1 = new Students("Wadha", 1234);
        Students student2 = new Students("Ali", 5678);
        Students student3 = new Students("Rand", 9101);


        StudentManager m = new StudentManager();

        m.addStudent(student1);
        m.addStudent(student2);
        m.addStudent(student3);


        int id = 1234;
        Students retrieved = m.getStudentById(id);
        if (retrieved != null) {
            System.out.println("Student with ID " + id + ": " + retrieved.getName());
        } else {
            System.out.println("No student found with ID " + id);
        }

        System.out.println("All students:");
        for (Students student : m.getAllStudents()) {
            System.out.println(student.getName() + " - " + student.getId());
        }


        int removeID = 9101;
        boolean removed = m.removeStudentById(removeID);
        System.out.println("Removing student with ID " + removeID );

        System.out.println("All students after remove:");
        for (Students student : m.getAllStudents()) {
            System.out.println(student.getName() + " - " + student.getId());
        }



    }}


