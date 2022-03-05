public class Main {
    public static void main(String[] args) {
        //Create queue
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>();
        //Create stack
        SimpleStack<Integer> simpleStack = new SimpleStack<>();

        //Write is empty queue and stack
        System.out.println("Queue is empty: " + simpleQueue.isEmpty());
        System.out.println("Stack is empty: " + simpleStack.isEmpty());

        //Added element in queue and stack
        for (int i = 0; i < 5; i++) {
            simpleQueue.add(i);
            simpleStack.push(i);
        }

        //Write to console queue and stack before added element
        System.out.println(simpleQueue);
        System.out.println(simpleStack);

        //Delete 1 element
        simpleQueue.remove();
        simpleStack.pop();

        //Write to console queue and stack before deleted element
        System.out.println(simpleQueue);
        System.out.println(simpleStack);
    }
}
