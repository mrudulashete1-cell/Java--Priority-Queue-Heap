# Priority Queue Using Heap in Java

## Objective
Build a simple Priority Queue using Heap in Java.

## Features
- Uses Java PriorityQueue (Min Heap)
- Add elements
- Remove highest-priority element
- Display queue elements
- Menu-driven program
- Handles empty queue conditions

## Software Required
- Java JDK 8 or above
- Eclipse / IntelliJ IDEA / VS Code

## How to Run

1. Save the file as `PriorityQueueHeap.java`.
2. Compile:
   javac PriorityQueueHeap.java
3. Run:
   java PriorityQueueHeap

## Implementation Steps

1. Create a Java class representing a Priority Queue.
2. Use a Heap (`PriorityQueue`) to store elements.
3. Implement methods to add, remove, and display elements.
4. Test the queue with different inputs.
5. Display the elements to the user.

## Sample Input
25
10
50

## Sample Output
Elements:
10 25 50

Removed Element:
10

Remaining Elements:
25 50

## Time Complexity

| Operation | Complexity |
|-----------|------------|
| Add       | O(log n)   |
| Remove    | O(log n)   |
| Peek      | O(1)       |
| Display   | O(n)       |

## Conclusion
This project demonstrates the implementation of a Priority Queue using a Heap in Java. 
It efficiently supports insertion, deletion, and display operations while maintaining heap order.
