package Interface;
import java.util.ArrayList;

public interface Action {
    public Object add();
    public boolean edit(ArrayList<Object> list);
    public boolean delete(ArrayList<Object> list);
    public void show(ArrayList<Object> list);
    public void search(ArrayList<Object> list);
    public void sort(ArrayList<Object> list);
    public void print(ArrayList<Object> list);
}
