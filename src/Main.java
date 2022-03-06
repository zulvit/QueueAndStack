public class Main {
    public static void main(String[] args) {
        //Create queue
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>();
        //Create stack
        SimpleStack<Integer> simpleStack = new SimpleStack<>();

        System.out.println("  *-Creating-*");

        //Write is empty queue and stack
        System.out.println("Queue is empty: " + simpleQueue.isEmpty());
        System.out.println("Stack is empty: " + simpleStack.isEmpty());

        //Write to console queue and stack before created
        System.out.println("Queue: " + simpleQueue);
        System.out.println("Stack: " + simpleStack);

        System.out.println("\n  *-Filling-*");

        //Added element in queue and stack
        for (int i = 0; i < 5; i++) {
            simpleQueue.add(i);
            simpleStack.push(i);
        }

        //Write is empty queue and stack
        System.out.println("Queue is empty: " + simpleQueue.isEmpty());
        System.out.println("Stack is empty: " + simpleStack.isEmpty());

        //Write to console queue and stack before added element
        System.out.println("Queue: " + simpleQueue);
        System.out.println("Stack: " + simpleStack);


        //Delete 1 element
        simpleQueue.remove();
        simpleStack.pop();

        System.out.println("\n  *-Delete 1 element-*");

        //Write to console queue and stack before deleted element
        System.out.println("Queue: " + simpleQueue);
        System.out.println("Stack: " + simpleStack);

        System.out.println("\n  *-Delete all elements-*");


        //Delete all elements
        while (!simpleQueue.isEmpty()) {
            simpleQueue.remove();
        }

        while (!simpleStack.isEmpty()) {
            simpleStack.pop();
        }

        //Write is empty queue and stack
        System.out.println("Queue is empty: " + simpleQueue.isEmpty());
        System.out.println("Stack is empty: " + simpleStack.isEmpty());

        //Write to console queue and stack before created
        System.out.println("Queue: " + simpleQueue);
        System.out.println("Stack: " + simpleStack);

    }
}
