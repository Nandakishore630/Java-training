package Strings;
public class String_Buffer {

    public static void main(String[] args) {

        // Creating StringBuffer
        StringBuffer sb = new StringBuffer("Java");

        // append() → adds text at end
        sb.append(" Programming");
        System.out.println("Append: " + sb);

        // insert(index, value)
        sb.insert(4, " Language");
        System.out.println("Insert: " + sb);

        // replace(start,end,string)
        sb.replace(0,4,"C++");
        System.out.println("Replace: " + sb);

        // delete(start,end)
        sb.delete(0,4);
        System.out.println("Delete: " + sb);

        // reverse()
        sb.reverse();
        System.out.println("Reverse: " + sb);

        // capacity()
        System.out.println("Capacity: " + sb.capacity());

        // length()
        System.out.println("Length: " + sb.length());

        // charAt()
        System.out.println("CharAt(2): " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(0,'X');
        System.out.println("After setCharAt: " + sb);
    }
}