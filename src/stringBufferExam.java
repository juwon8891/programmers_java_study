import java.util.Arrays;
import java.util.List;

public class stringBufferExam {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello ");
        sb.append("world");
        String str = sb.toString();
        System.out.println(str);
        String firstName = "h";
        String lastName = " w";
        sb.append(firstName).append(" ").append(lastName).toString();
        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello");
        if(sb2 == sb3){
            System.out.println("sb2 == sb3");
        }
        String str2 = new StringBuffer().append("hello").append(" world").toString();
        System.out.println(str2);
    }
}