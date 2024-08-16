package queue;

public class CircularQueue<T> {
    private int top = 0;
    private int base = 0;
    private T[] data;
    private int size;

    public CircularQueue(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    public void add(T data) {
        if (isFull()) {
            throw new IllegalStateException("Fila Cheia");
        }
        this.data[top] = data;
        this.top = move(top);
    }

    public T remove(){
        if(isEmpty()){
            throw new IllegalStateException("Fila Vazia");
        }
        T dataPop = data[base];
        data[base] = null;
        base = move(base);
        return dataPop;
    }
    
    public void clear() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            for (int i = 0; i < this.size; i++) {
                this.data[i] = null;
            }
            this.top = 0;
            this.base = 0;
        }
    }

    public int move(int pos) {
        return (pos + 1) % data.length;
    }

    public boolean isFull() {
        return !isEmpty() && move(top) == base;
    }

    public boolean isEmpty() {
        return top == base;
    }
}