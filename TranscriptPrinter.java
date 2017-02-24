import java.util.ArrayList;

public class TranscriptPrinter {
  private StudentRecordManager rm;

  public TranscriptPrinter(StudentRecordManager rm) {
    this.rm = rm;
  }

  public void printTranscript(int id) {
    Student s = rm.searchStudentById(id);
    Iterator<Student.Course> it = s.getCourseIterator();
    printTranscriptHeader(s);

    while (it.hasNext()) {
      System.out.println(it.getNext());
    }
  } 
  
  public void printTranscript(ArrayList<Integer> ids) {
    for (int id : ids) {
      printTranscript(id);
      System.out.println();
    }
  } 

  private void printTranscriptHeader(Student s) {
    System.out.printf("\nPrinting transcript for %s %s...\n", 
                                      s.getFName(), s.getLName());
  }
}