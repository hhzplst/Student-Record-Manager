import java.util.ArrayList;

public class TranscriptPrinter {
  public void printTranscript(MyIterator<Student> it, int id) {
    System.out.printf("\nTranscript for student %d\n", id);
    while(it.hasNext()) {
      Student currentStudent = it.next();
      if (currentStudent.getID() == id) {
        MyIterator<Student.Course> courseIt = currentStudent.getCourseIterator();
        while(courseIt.hasNext()) {
          System.out.println(courseIt.next());
        }
      }
    }
  } 
  
  public void printTranscript(MyIterator<Student> it, ArrayList<Integer> ids) {

  } 
}