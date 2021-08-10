package stack.and.queue;

import java.util.Locale;

public class AnimalShelter {
    Queue queue = new Queue();

    public void enqueue(Animal animal) {
        if (animal instanceof Dog || animal instanceof Cat) {
            queue.enqueue(animal);
        } else {
            return;
        }
    }

    public Object dequeue(String pref) {
        System.out.println("ffff");
        if (pref.toLowerCase(Locale.ROOT) == "cat"|| pref.toLowerCase(Locale.ROOT) == "dog") {

           return queue.dequeue();
        }
        return null ;
        }

    public String toString() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue+"d";
    }
    }

