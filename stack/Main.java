package stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> staticStack = new StaticArrayStack<>(5);
        DynamicArrayStack<Integer> dynamicStack = new DynamicArrayStack<>();

        System.out.println("Static Stack Operations:");
        staticStack.push(1);
        staticStack.push(2);
        staticStack.push(3);
        System.out.println("Popped from static stack: " + staticStack.pop());
        staticStack.clear();
        System.out.println("Is static stack empty? " + staticStack.isEmpty());

        System.out.println("\nDynamic Stack Operations:");
        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        System.out.println("Current size of dynamic stack: " + dynamicStack.checkSize());
        System.out.println("Popped from dynamic stack: " + dynamicStack.pop());
        System.out.println("Current size of dynamic: " + dynamicStack.checkSize());
        dynamicStack.clear();
        System.out.println("Is dynamic stack empty? " + dynamicStack.isEmpty());
        System.out.println("Current size of dynamic stack after clear: " + dynamicStack.checkSize());
    }
}