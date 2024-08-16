package queue;

public class Main {
    public static void main(String[] args) {
        StaticQueue<Integer> statics = new StaticQueue<>(5);

        // Test add method
        System.out.println("Adicionando elementos na fila estática:");
        for (int i = 1; i <= 4; i++) {
            statics.add(i);
            System.out.println("Add: " + i);
        }

        System.out.println("A fila estática está cheia? " + statics.isFull());

        System.out.println("Removendo elementos na fila estática: ");
        for (int i = 1; i <= 4; i++) {
            int removed = statics.remove();
            System.out.println(removed + " removido da fila estática");
        }

        System.out.println("A fila estática está vazia? " + statics.isEmpty());

        System.out.println("Adicionando elementos na fila estática novamente: ");
        for (int i = 1; i <= 3; i++) {
            statics.add(i);
            System.out.println("Add: " + i);
        }
        System.out.println("Limpando a fila estática: ");
        statics.clear();
        System.out.println("A fila estática está vazia após limpar? " + statics.isEmpty());

        System.out.println("==============================================");

        CircularQueue<Integer> circular = new CircularQueue<>(5);

        // Test add method
        System.out.println("Adicionando elementos na fila circular:");
        for (int  i = 0; i < 5; i++) {
            circular.add(i);
            System.out.println("Add: " + i);
        }

        System.out.println("A fila circular está cheia? " + circular.isFull());

        System.out.println("Removendo elementos da fila circular: ");
        for (int i = 0; i < 5; i++) {
            int removed = circular.remove();
            System.out.println(removed + " removido da fila circular");
        }

        System.out.println("A fila circular está vazia? " + circular.isEmpty());

        System.out.println("Adicionando elementos na fila circular novamente: ");
        for (int i = 1; i <= 3; i++) {
            circular.add(i);
            System.out.println("Add: " + i);
        }
        System.out.println("Limpando a fila circular: ");
        circular.clear();
        System.out.println("A fila circular está vazia após limpar? " + circular.isEmpty());
    }
}