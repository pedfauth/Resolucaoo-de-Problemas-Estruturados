package stack;
// Stack.java
public interface Stack<T> {
    public void push(T item);
    public T pop();
    public void clear();
    public boolean isFull();
    public boolean isEmpty();
}
