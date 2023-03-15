package helloworld;

public class StringLiberalVsObject {
    public static void main(String[] args) {
        // String liberal
        String str1 = "Practice java";
        String str2 = "Practice java";
        // String Object
        String str3 = new String("Practice java");
        // String liberal & String objects are different & stored in diff locations
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        // To get the value = : use equals() method
        System.out.println(str1.equals(str3));

    }
}
