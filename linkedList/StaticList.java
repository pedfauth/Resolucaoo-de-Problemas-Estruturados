package linkedList;

public class StaticList {
    private int[] data;
    private int size;

    public StaticList(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    public void clear() {
        size = 0;
    }

    //Add info no final da lista
    public void add(int data) {
        if (isFull()) {
            throw new IllegalStateException("List is full");
        }
        this.data[size++] = data;
    }

    // Add info em uma posição específica
    public void add(int data, int pos) {
        // Verifica se a lista está cheia
        if (isFull()) {
            throw new IllegalStateException("List is full");
        }
        // Verifica se a posição é válida
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        // Move os elementos para a direita para abrir espaço para o novo elemento
        for (int i = size; i > pos; i--) {
            this.data[i] = this.data[i - 1];
        }
        // Adiciona o novo elemento na posição especificada
        this.data[pos] = data;
        // Incrementa o tamanho da lista
        size++;
    }

    // Remove o elemento de uma posição específica
    public int remove(int pos) {
        // Verifica se a lista está vazia
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        // Verifica se a posição é válida
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        // Armazena o elemento a ser removido
        int removedData = this.data[pos];
        // Move os elementos para a esquerda para preencher o espaço do elemento removido
        for (int i = pos; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        // Decrementa o tamanho da lista
        size--;
        // Retorna o elemento removido
        return removedData;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void setData(int data, int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        this.data[pos] = data;
    }

    public int getData(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }
        return this.data[pos];
    }

    public int getSize() {
        return size;
    }

    public int find(int data) {
        for (int i = 0; i < size; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }
}