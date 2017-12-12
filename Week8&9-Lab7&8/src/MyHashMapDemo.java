public class MyHashMapDemo {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        map.put("aaa", 10);
        map.put("bbb", 20);
        map.put("ccc", 30);
        map.put("ddd", 40);
        System.out.println(map.get("ccc"));
        map.remove("ccc");
        map.put("ccc", 50);
        map.remove("aaa");
        System.out.println(map.get("aaa"));
        System.out.println(map.get("bbb"));
        System.out.println(map.get("eee"));
        map.printMyHashMap();
    }
}