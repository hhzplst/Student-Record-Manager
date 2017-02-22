import java.util.ArrayList;

public class StudentRecordManager implements Iterable<Student> {
  private ArrayList<Student> studentList;
  private ArrayList<Integer> studentIDList;

  public StudentRecordManager() {
    studentList = new ArrayList<>();
    studentIDList = new ArrayList<>();  
  }

  public void addStudent(Student s) {
    if (studentList.contains(s))
      System.out.println("Student already exists!");
    else {
      studentList.add(s);
      studentIDList.add(s.getID());
    }
  }

  public void removeStudent(Student s) {
    try {
      studentList.remove(s);
    } catch(NullPointerException e) {
      System.out.println("No such student exists!");
    }
  }

  public Student searchStudentById(int id) {
    return studentList.get(studentIDList.indexOf(id));
  }

  public ArrayList<Student> searchStudentByName(String searchStr) {
    ArrayList<Student> result = new ArrayList<>();
    for (Student s : studentList) {
      if (s.getFName().contains(searchStr) || s.getLName().contains(searchStr))
        result.add(s);
    }
    return result;
  }

  public MyIterator<Student> iterator() {
    return new MyIterator<Student>(studentList);
  }

  public void addCourse(Student s, Student.Course c) {
    if (s.getCourseList().contains(c))
      System.out.printf("Course already exists for student %n", s.getID());
    else
      s.getCourseList().add(c);
  }

  public void removeCourse(Student s, Student.Course c) {
    try {
      s.getCourseList().remove(c);
    } catch(NullPointerException e) {
      System.out.printf("No such course for student %n", s.getID());
    }
  } 

}