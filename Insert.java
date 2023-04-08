package MainPackage.stringbuffer;

public class Insert {
    public static void main(String[] args) {
        String s1 = "happy new year";
        StringBuffer sb = new StringBuffer(s1);
        //System.out.println(sb.insert(6,2023+" "));
        System.out.println(sb.insert(14," "+2023));

//================================================================================
    //INSERT FOR STRING BUILDER
        String s2 = "Mumbai, Pune, Nagpur are main cities in Maharashtra";

        StringBuilder sb2=new StringBuilder(s2);
        System.out.println(sb2.insert(20,","+" nashik" ));

    }
}
