import java.util.ArrayList;
import java.util.NoSuchElementException;

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

  public ArrayList<Course> getCourseList() {
    return courseList;
  }

  public Iterator<Course> getCourseIterator() {
    return new Iterator<Course>() {
      int index = 0;

      public Course getNext() {
        if (!hasNext())
          throw new NoSuchElementException();
        return courseList.get(index++);
      } 

      public boolean hasNext() {
        return index != courseList.size();
      }
    };
  }

  public boolean equals(Student s) {
    if (s == this) return true;
    if (!(s instanceof Student)) return false;

    return ID == s.ID;
  }

  public class Course {
    private String title, description;
    private char grade; 

    public Course(String title, String description) {
      this.title = title;
      this.description = description;
    }

    public String toString() {
      return title + " : " + grade;
    }
  }
}