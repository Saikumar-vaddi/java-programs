import java.util.Locale;

public class string1 {
    static void main(String[] args) {
        String name="sai nithin ";
        String branch = "CSE";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.replace("nithin","kumar"));
        System.out.println(name.equals(branch));
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.startsWith("s"));
        System.out.println(name.endsWith("n"));
        System.out.println(name.substring(1,4));
        System.out.println(name.charAt(2));
        System.out.println(name.contains("nithin"));
        System.out.println(branch.isEmpty());
        System.out.println(name.toString());
        System.out.println(name.equalsIgnoreCase("ramu"));

    }
}
