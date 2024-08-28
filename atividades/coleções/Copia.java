import java.util.LinkedList;

public class Copia {
    public static void main(String[] args) {
        LinkedList<Character> originalList = new LinkedList<>();
        originalList.add('A');
        originalList.add('B');
        originalList.add('C');
        originalList.add('D');
        originalList.add('E');
        originalList.add('F');
        originalList.add('G');
        originalList.add('H');
        originalList.add('I');
        originalList.add('J');

        LinkedList<Character> reversedList = new LinkedList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        // Exibição das listas
        System.out.println("Lista Original: " + originalList);
        System.out.println("Lista Invertida: " + reversedList);
    }
}
