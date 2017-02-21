import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {

  private final List<T> myList;
  private int index;


  public MyIterator(ArrayList<T> list) {
    myList = list;
    index = 0;
  }

  public T next() {
    if (hasNext()) return myList.get(index++);
    else throw new NoSuchElementException("No more elements!");

  }

  public boolean hasNext() {
    return myList.size() != index; 
  }
}