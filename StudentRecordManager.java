import java.util.ArrayList;

public class StudentRecordManager implements Iterable<Student> {
  private static ArrayList<Student> studentList;

  public MyIterator<Student> iterator() {
    return new MyIterator<Student>(studentList);
  } 

}