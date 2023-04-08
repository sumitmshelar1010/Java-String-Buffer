package MainPackage.stringbuffer;

public class Append { //TO ADD STRING AT LAST
    public static void main(String[] args) {
        String a = "Happy New";
        String b = "Year";
        StringBuffer sb = new StringBuffer(a); // CONVERT STRING TO STRING BUFFER
        System.out.println(sb.append( " " + b));// APPEND TO ADD STRING AT LAST
        StringBuffer sb1 = new StringBuffer(b);
        System.out.println(sb1.append(" "+2023));

//===================================================================================================================
// APPEND METHOD FOR STRING BUILDER

        String s1 = "Two plus Two";
        String s2 = "is equal to Four";
        StringBuilder sb3 = new StringBuilder(s1);
        System.out.println(sb3.append(" "+s2));
    }
}
