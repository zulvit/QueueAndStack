public class Main {
    public static void main(String[] args) {
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>();

        for (int i = 0; i < 5; i++) {
            simpleQueue.add(i);
        }

        System.out.println(simpleQueue);
        simpleQueue.remove();
        System.out.println(simpleQueue);
    }
}
