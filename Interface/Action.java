package Interface;
import java.util.ArrayList;

public interface Action<T> {
    public Object add();
    public boolean edit(ArrayList<T> list);
    public boolean delete(ArrayList<T> list);
    public void show(ArrayList<T> list);
    public void search(ArrayList<T> list);
    public void sort(ArrayList<T> list);
}
