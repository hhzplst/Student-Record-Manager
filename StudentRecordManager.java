import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StudentRecordManager {
  private ArrayList<Student> studentList;
  private ArrayList<Integer> studentIDList;

  public StudentRecordManager() {
    studentList = new ArrayList<>();
    studentIDList = new ArrayList<>();  
  }

  public void addStudent(Student s) {
    if (studentIDList.contains(s.getID()))
      System.out.println("Student already exists!");
    else {
      studentList.add(new Student(s));
      studentIDList.add(s.getID());
    }
  }

  public void removeStudent(Student s) {
    studentList.remove(findStudentById(s.getID()));
    studentIDList.remove(new Integer(s.getID()));
  }

  public Student searchStudentById(int id) {
    Student result = findStudentById(id);
    return new Student(result);
  }

  public ArrayList<Student> searchStudentByName(String searchStr) {
    ArrayList<Student> results = new ArrayList<>();
    for (Student s : studentList) {
      if (s.getFName().contains(searchStr) || s.getLName().contains(searchStr))
        results.add(s);
    }
    return new ArrayList<Student>(results);
  }

  public Iterator<Student> getStudentIterator() {
    return new Iterator<Student>() {
      int index = 0;

      public Student getNext() {
        if (!hasNext())
          throw new NoSuchElementException();
        return studentList.get(index++);
      } 

      public boolean hasNext() {
        return index != studentList.size();
      }
    };
  }

  public void addCourse(int id, Student.Course c) {
      Student s = findStudentById(id);
      s.getCourseList().add(c);
  }

  public void removeCourse(int id, Student.Course c) {
      Student s = findStudentById(id);
      s.getCourseList().remove(c);
  } 

  private Student findStudentById(int id) {
    return studentList.get(studentIDList.indexOf(id));
  }
}