package Arrays;
    import java.util.*;
public class JavaUtil {


 

    public static void main(String[] args) {

        // =============================
        // ARRAYS CLASS METHODS
        // =============================

        int[] arr = {5,2,8,1,3};

        Arrays.sort(arr);  // sort array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int[] arr2 = {1,2,3,4,5};

        System.out.println("Arrays equal: " + Arrays.equals(arr, arr2));

        Arrays.fill(arr2,10); // fill array
        System.out.println("Filled Array: " + Arrays.toString(arr2));

        int[] copy = Arrays.copyOf(arr,3);
        System.out.println("Copied Array: " + Arrays.toString(copy));


        // =============================
        // ARRAYLIST METHODS
        // =============================

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("ArrayList: " + list);

        list.add(1,"SQL");  // insert
        System.out.println("After Insert: " + list);

        list.remove("C++");  // remove
        System.out.println("After Remove: " + list);

        System.out.println("Get Element: " + list.get(1));

        System.out.println("Size: " + list.size());

        System.out.println("Contains Java: " + list.contains("Java"));

        Collections.sort(list); // sort list
        System.out.println("Sorted List: " + list);


        // =============================
        // HASHSET METHODS
        // =============================

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate ignored

        System.out.println("HashSet: " + set);

        System.out.println("Contains 10: " + set.contains(10));

        set.remove(30);

        System.out.println("After Remove: " + set);


        // =============================
        // HASHMAP METHODS
        // =============================

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Java");
        map.put(2,"Python");
        map.put(3,"SQL");

        System.out.println("HashMap: " + map);

        System.out.println("Value for key 2: " + map.get(2));

        map.remove(3);

        System.out.println("After Remove: " + map);

        System.out.println("Keys: " + map.keySet());

        System.out.println("Values: " + map.values());


        // =============================
        // LINKEDLIST METHODS
        // =============================

        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);

        ll.addFirst(5);
        ll.addLast(40);

        System.out.println("LinkedList: " + ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("After Removal: " + ll);


        // =============================
        // STACK METHODS
        // =============================

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());

        stack.pop();

        System.out.println("After Pop: " + stack);


        // =============================
        // QUEUE METHODS
        // =============================

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        System.out.println("Peek: " + queue.peek());

        queue.poll();

        System.out.println("After Poll: " + queue);


        // =============================
        // PRIORITY QUEUE METHODS
        // =============================

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(10);
        pq.add(30);

        System.out.println("PriorityQueue: " + pq);

        System.out.println("Peek: " + pq.peek());

        pq.poll();

        System.out.println("After Poll: " + pq);


        // =============================
        // SCANNER METHODS
        // =============================

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");

        int number = sc.nextInt();

        System.out.println("You entered: " + number);

        sc.close();

    }
}
    
