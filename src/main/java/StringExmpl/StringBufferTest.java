package StringExmpl;

import java.util.StringTokenizer;

public class StringBufferTest {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Java StringBuffer class is used to create mutable");
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());

        StringTokenizer st=new StringTokenizer(sb.toString()," ");
        System.out.println(st.countTokens());

    }
}
