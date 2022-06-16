import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO4 {
    public static void main(String[] args) {
        try(
                DataInputStream in = new DataInputStream(new FileInputStream("data.txt"));
                ){
            int i = in.readInt();
            boolean b = in.readBoolean();
            double d = in.readDouble();
            System.out.println("int : " + i);
            System.out.println("boolean : " + b);
            System.out.println("double : " + d);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}