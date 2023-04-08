package MainPackage.stringbuffer;

public class Replace {
    public static void main(String[] args) {
        String s1 = " It is open source";
        StringBuffer sb = new StringBuffer(s1);// NEW OBJECT CREATED IN TERMS OF STRING BUFFER
        System.out.println(sb.replace(7,11,"non open"));

 //=====================================================================================================
    //REPLACE FOR STRING BUFFER
        String s2 = "I have car and bike";
        StringBuilder sb2 = new StringBuilder(s2);
        System.out.println(sb2.replace(7,10,"cycle"));
    }
}
