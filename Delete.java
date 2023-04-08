package MainPackage.stringbuffer;

public class Delete {
    public static void main(String[] args) {
        String s1 = "I have two bikes";

        System.out.println(s1.length());
        StringBuffer sb = new StringBuffer(s1);
        System.out.println(sb.delete(7,11));

 //====================================================================
 //DELETE FOR STRING BUILDER
        String s2 = "I can read, talk, eat, walk ";
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(sb2.delete(11,17));
    }
}
