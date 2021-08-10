package stack.and.queue;

import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> front;
    Node<T> rear;

    public Queue(){
        this.front = null;
        this.rear = null;
    }
    // **********************************************************//

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value);
        if (this.isEmpty()){
            this.front = newNode;
        }else{
            this.rear.next = newNode;
        }
        this.rear = newNode;
    }
    // **********************************************************//

    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        T data = this.front.value;
        if(rear == front){
            rear = null;
        }
        this.front = this.front.next;
        return data;
    }
    // **********************************************************//

    public T peek(){
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }else{
            return this.front.value;
        }
    }
    // **********************************************************//

    public boolean isEmpty(){
        return this.front == null;
    }
    @Override
    public String toString() {
        return front.toString();
    }


    public void enquque(T dog) {
    }


}
