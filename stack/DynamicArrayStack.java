package stack;

public class DynamicArrayStack<T> implements Stack<T> {
    private int top;
    private T[] stackArray;

    public DynamicArrayStack() {
        this.stackArray = (T[]) new Object[10];
        this.top = -1;
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            resize(stackArray.length * 2);
        }
        stackArray[++top] = item;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        T item = stackArray[top--];
        if (top > 0 && top == stackArray.length / 4) {
            resize(stackArray.length / 2);
        }
        return item;
    }

    @Override
    public void clear() {
        top = -1;
        resize(10);
    }

    @Override
    public boolean isFull() {
        return top == stackArray.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    private void resize(int newSize) {
        T[] newArray = (T[]) new Object[newSize];
        for (int i = 0; i <= top; i++) {
            newArray[i] = stackArray[i];
        }
        stackArray = newArray;
    }
    
    public int checkSize() {
        return top + 1;
    }
    
}