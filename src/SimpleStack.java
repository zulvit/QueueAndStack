import java.util.ArrayList;

public class SimpleStack<T> implements Stack<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    @Override
    public void push(T item) {
        arrayList.add(0, item);
    }

    @Override
    public void pop() {
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
