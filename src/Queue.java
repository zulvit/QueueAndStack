public interface Queue<T> {
    void add(T item);
    void remove();

    boolean isEmpty();
}
