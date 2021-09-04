package Hashtable;

import java.util.LinkedList;

public class Hashtable {

    LinkedList<Object>[] bucket;


    public Hashtable(int size){
        this.bucket = new LinkedList[size];
        for(int i = 0; i < bucket.length; i ++){
            bucket[i] = new LinkedList<>();
        }
    }

    public void add(Object key, Object value){
        int index = hash(key);
        bucket[index].add(value);
    }

    public LinkedList<Object> get(Object key){
        int index = hash(key);
        return bucket[index];
    }

    public int hash(Object value){
        String valueAsAString = value.toString();
        int hash = 0;
        for(int i = 0; i < valueAsAString.length(); i ++) {
            char character = valueAsAString.charAt(i);
            int num = character;
            System.out.println(num);
            hash += num;
            hash = hash * 27 ;
            System.out.println(hash);
        }
        hash = hash % bucket.length;
        return hash;

    }
    public boolean contains(Object key){
        int index = hash(key);
        System.out.println("index = " + index);
        if(bucket[index].isEmpty()) return false;
        return true;
    }

   
}
