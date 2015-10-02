package edu.upc.eetac.dsa.riverola.DAO;

/**
 * Created by Guillermo on 02/10/2015.
 */
public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();

        //print all students
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }


        //update student
        Student student = studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //get the student
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
