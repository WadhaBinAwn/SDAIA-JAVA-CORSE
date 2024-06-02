package HomeWork.HW2;

public class Main {
    public static void main(String[] args) {




        Student student1 = new Student("Wadha", 1234);
        Student student2 = new Student("Ali", 5678);
        Student student3 = new Student("Rand", 9101);


        StudentManager m = new StudentManager();

        m.addStudent(student1);
        m.addStudent(student2);
        m.addStudent(student3);


        int id = 1234;
        Student retrieved = m.getStudentById(id);
        if (retrieved != null) {
            System.out.println("Student with ID " + id + ": " + retrieved.getName());
        } else {
            System.out.println("No student found with ID " + id);
        }

        System.out.println("All students:");
        for (Student student : m.getAllStudents()) {
            System.out.println(student.getName() + " - " + student.getId());
        }


        int removeID = 9101;
        boolean removed = m.removeStudentById(removeID);
        System.out.println("Removing student with ID " + removeID );

        System.out.println("All students after remove:");
        for (Student student : m.getAllStudents()) {
            System.out.println(student.getName() + " - " + student.getId());
        }



    }}


