import java.util.ArrayList;

public class Student {
  private int ID;
  private String fName, lName, email;
  private static int count = 1000;
  private ArrayList<Course> courseList;

  public Student(String firstName, String lastName, String emailAddress) {
    ID = ++count;
    fName = firstName;
    lName = lastName;
    email = emailAddress;
    courseList = new ArrayList<>();
  }

  public MyIterator<Course> getCourseIterator() {
    return new MyIterator<Course>(courseList);
  }

}