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

  public int getID() {
    return ID;
  }

  public String getFName() {
    return fName;
  }

  public String getLName() {
    return lName;
  }

  public MyIterator<Course> getCourseIterator() {
    return new MyIterator<Course>(courseList);
  }

  public boolean equals(Student s) {
    if (s == this) return true;
    if (!(s instanceof Student)) return false;

    return ID == s.ID;
  }

  public int hashCode() {
    int result = 17;
    result = 31 * result + ID;
    return result;
  } 

}