package queue;

public class StaticQueue<T> {
    private int top = 0;
    private int base = 0;
    private T[] data;
    private int size;

    public StaticQueue(int size) {
        this.size = size;
        this.data = (T[]) new Object[size];
    }

    

    public void add(T data) {
        if (isFull()) {
            return;
        }
        this.data[top] = data;
        this.top += 1;
    }

    public T remove(){
        if(isEmpty()){
            throw new IllegalStateException("Fila Vazia");
        }
        T dataPop = this.data[this.base];
        this.data[this.base] = null;
        this.base++;
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

    public boolean isFull() {
        return this.top == this.size;
    }

    public boolean isEmpty() {
        return this.top == this.base;
    }
}