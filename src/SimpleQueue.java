import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public void add(T item) {
        arrayList.add(item);
    }

    @Override
    public void remove() {
        arrayList.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public String toString() {
        return arrayList.toString();
    }
}
