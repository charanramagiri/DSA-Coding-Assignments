//Implementation of Queue using Arrays


package Queues;

class QueueUsingArray {
    int[] arr;
    int front, rear, capacity;

    QueueUsingArray(int size) {
        arr = new int[size];
        front = 0;
        rear = 0;
        capacity = size;
    }

    void enqueue(int data) {
        if (rear == capacity) {
            System.out.println("Queue is Full");
            return;
        }
        arr[rear++] = data;
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Dequeued: " + arr[front++]);
    }

    int peek() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    boolean isEmpty() {
        return front == rear;
    }

    int size() {
        return rear - front;
    }
}

public class QueueUsingArrays {
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Front: " + q.peek());
        q.dequeue();
        System.out.println("Size: " + q.size());
    }
}

