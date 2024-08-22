package linkedList;

public class Main {
    public static void main(String[] args) {
        StaticList list = new StaticList(4);

        // Adiciona elementos na lista
        list.add(5);
        list.add(10);
        list.add(15);

        // Adiciona um elemento na posição 1
        list.add(20, 1);

        System.out.println("A lista está cheia? " + list.isFull());

        // Remove o elemento da posição 2
        int removedElement = list.remove(2);
        System.out.println("Elemento removido: " + removedElement);

        System.out.println("A lista está vazia? " + list.isEmpty());

        System.out.println("A lista está cheia? " + list.isFull());

        // Define o valor do elemento na posição 1
        list.setData(25, 1);

        // Obtém o valor do elemento na posição 1
        int data = list.getData(1);
        System.out.println("Elemento na posição 1: " + data);

        // Obtém o tamanho da lista
        int size = list.getSize();
        System.out.println("Tamanho da lista: " + size);

        // Encontra a posição do elemento 25
        int position = list.find(25);
        System.out.println("Posição do elemento 25: " + position);
    }
}