package stack;

public class StaticArrayStack<T> implements Stack<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public StaticArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            System.out.println("Stack is full");
        }
        stackArray[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return stackArray[top--];
    }

    @Override
    public void clear() {
        top = -1;
    }

    @Override
    public boolean isFull() {
        return top == maxSize - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}