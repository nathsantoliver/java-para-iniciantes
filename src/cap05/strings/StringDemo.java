package cap05.strings;

// Introduz String
public class StringDemo {
    public static void main(String[] args) {
        // declara strings de várias maneiras
        String str1 = new String("Java strings are objects.");
        String str2 = "They are constructed various ways.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
