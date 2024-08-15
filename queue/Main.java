package queue;

public class Main {
    public static void main(String[] args) {
        StaticQueue<Integer> queue = new StaticQueue<>(5);

        // Test add method
        System.out.println("Adicionando elementos na fila:");
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
            System.out.println("Add: " + i);
        }

        System.out.println("A fila está cheia? " + queue.isFull());

        System.out.println("Removendo elementos na fila: ");
        for (int i = 1; i <= 5; i++) {
            int removed = queue.remove();
            System.out.println(removed + " removido");
        }

        System.out.println("A fila está vazia? " + queue.isEmpty());

        System.out.println("Adicionando elementos na fila novamente: ");
        for (int i = 1; i <= 3; i++) {
            queue.add(i);
            System.out.println("Add: " + i);
        }
        System.out.println("Limpando a fila: ");
        queue.clear();
        System.out.println("A fila está vazia após limpar? " + queue.isEmpty());
    }
}