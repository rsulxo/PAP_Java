// Exercise 3
// Given a complete implementation of a HashMap by adding the missing methods in the class MyHashMap

import java.util.*;

public class MyHashMap {
    private Container c = new Container();
    private List<Container> saveList;
    public MyHashMap(){
        this.saveList=new ArrayList<Container>();
    }

    public void put(Object k, Object v){        // put element in ‘MyHashMap
        Container a = new Container();
        if(saveList.contains(a)) {
            System.out.println("found it");
        }else {
            a.insert(k, v);
            saveList.add(a);
        }
    }
    public boolean remove(Object k){           // remove element of which the key is k
        Container a = new Container();
        for(int i = 0; i < saveList.size(); i++) {
            a = saveList.get(i);
            if(a.getKey() == k) {
                saveList.remove(i);
                return true;
            }
        }   return false;
    }
    public String toString() {
        return saveList.toString();
    }           // reflects the correct output
    public void printMyHashMap() {
        System.out.println(toString());
    }     // print MyHashMap
    public Object get(Object k){                                        // get a value of the key k

        Container a = new Container();
        for(int i = 0; i < saveList.size(); i++) {
            a = saveList.get(i);
            if(a.getKey() == k) {
                return a.getValue();
            }
        }   return null;
    }
}