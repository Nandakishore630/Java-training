package Strings;
public class String_Builder {

    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert()
        sb.insert(4," Language");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(0,4,"Python");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(0,6);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // length()
        System.out.println("Length: " + sb.length());

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // charAt()
        System.out.println("CharAt(3): " + sb.charAt(3));

        // setCharAt()
        sb.setCharAt(0,'X');
        System.out.println("After setCharAt: " + sb);
    }
}