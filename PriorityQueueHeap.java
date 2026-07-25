import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueHeap {

    // Create a Priority Queue (Min Heap)
    private PriorityQueue<Integer> heap;

    public PriorityQueueHeap() {
        heap = new PriorityQueue<>();
    }

    // Add element
    public void addElement(int value) {
        heap.offer(value);
        System.out.println(value + " added successfully.");
    }

    // Remove highest priority element
    public void removeElement() {
        if (heap.isEmpty()) {
            System.out.println("Priority Queue is empty.");
        } else {
            System.out.println("Removed Element: " + heap.poll());
        }
    }

    // Display elements
    public void displayElements() {
        if (heap.isEmpty()) {
            System.out.println("Priority Queue is empty.");
        } else {
            System.out.println("Elements in Priority Queue:");
            for (int value : heap) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueueHeap pq = new PriorityQueueHeap();

        int choice;

        do {
            System.out.println("\n===== Priority Queue Using Heap =====");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Display Elements");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    pq.addElement(value);
                    break;

                case 2:
                    pq.removeElement();
                    break;

                case 3:
                    pq.displayElements();
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}