package Strings;
public class string_methods {

    public static void main(String[] args) {

        // Creating Strings
        String str1 = "Java Programming";
        String str2 = "java programming";
        String str3 = "  Hello World  ";

        System.out.println("Original String: " + str1);

        // 1. length() → returns number of characters
        System.out.println("Length: " + str1.length());

        // 2. charAt(index) → returns character at specific index
        System.out.println("Character at index 2: " + str1.charAt(2));

        // 3. substring(start) → returns substring from index
        System.out.println("Substring from index 5: " + str1.substring(5));

        // 4. substring(start,end) → returns substring between indexes
        System.out.println("Substring (0,4): " + str1.substring(0, 4));

        // 5. toUpperCase() → converts string to uppercase
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 6. toLowerCase() → converts string to lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // 7. trim() → removes leading and trailing spaces
        System.out.println("Trimmed string: " + str3.trim());

        // 8. equals() → compares string values
        System.out.println("Equals: " + str1.equals(str2));

        // 9. equalsIgnoreCase() → compares ignoring case
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

        // 10. contains() → checks if string contains substring
        System.out.println("Contains 'Java': " + str1.contains("Java"));

        // 11. startsWith() → checks beginning of string
        System.out.println("Starts with Java: " + str1.startsWith("Java"));

        // 12. endsWith() → checks ending of string
        System.out.println("Ends with ming: " + str1.endsWith("ming"));

        // 13. indexOf() → returns first occurrence index
        System.out.println("Index of 'a': " + str1.indexOf('a'));

        // 14. lastIndexOf() → returns last occurrence index
        System.out.println("Last index of 'a': " + str1.lastIndexOf('a'));

        // 15. replace(old,new) → replaces characters
        System.out.println("Replace a with o: " + str1.replace('a', 'o'));

        // 16. replaceAll(regex,replacement)
        System.out.println("Replace all 'a': " + str1.replaceAll("a", "@"));

        // 17. concat() → joins two strings
        String joined = str1.concat(" Language");
        System.out.println("Concat result: " + joined);

        // 18. isEmpty() → checks if string is empty
        String emptyStr = "";
        System.out.println("Is Empty: " + emptyStr.isEmpty());

        // 19. split() → splits string into array
        String sentence = "Java is powerful language";
        String[] words = sentence.split(" ");

        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 20. compareTo() → compares strings lexicographically
        System.out.println("CompareTo result: " + str1.compareTo(str2));

        // 21. valueOf() → converts other data types to string
        int number = 100;
        String numStr = String.valueOf(number);
        System.out.println("ValueOf: " + numStr);

        // 22. join() → joins multiple strings
        String result = String.join("-", "Java", "Python", "C++");
        System.out.println("Join result: " + result);

        // 23. toCharArray() → converts string to char array
        char[] chars = str1.toCharArray();
        System.out.println("Characters in string:");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        System.out.println();

        // 24. matches() → checks regex pattern
        String email = "test@gmail.com";
        System.out.println("Matches email pattern: " + email.matches(".+@gmail\\.com"));

        // 25. intern() → moves string to string pool
        String s1 = new String("Java");
        String s2 = s1.intern();

        System.out.println("Intern example: " + (s1 == s2));

    }
}
