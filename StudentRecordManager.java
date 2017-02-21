import java.util.ArrayList;

public class StudentRecordManager implements Iterable<Student> {
  private static ArrayList<Student> studentList;

  public void addStudent(Student s) {
    studentList.add(s);
  }

  public void removeStudent(Student s) {
    try {
      studentList.remove(s);
    } catch(NullPointerException e) {
      System.out.println("No such student exists!");
    }
  }

  public Student searchStudentById(int id) {

  }

  public ArrayList<Student> searchStudentByName(String fName, String lName) {
    
  }

  public MyIterator<Student> iterator() {
    return new MyIterator<Student>(studentList);
  } 

}