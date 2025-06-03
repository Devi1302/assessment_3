import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
       
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");
        System.out.println("LinkedList: " + linkedList);

        
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Guitar");
        hashSet.add("Harp");
        hashSet.add("Guitar");  
        System.out.println("HashSet: " + hashSet);

       
        System.out.println("\nDifferences:");
        System.out.println("ArrayList: Maintains insertion order, allows duplicates, good for fast access.");
        System.out.println("LinkedList: Maintains insertion order, allows duplicates, better for frequent insertions/removals.");
        System.out.println("HashSet: Does NOT maintain order, does NOT allow duplicates, good for quick lookup.");
    }
}