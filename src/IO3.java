import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;

public class IO3 {
    public static void main(String[] args) {
        try(
                DataOutputStream out = new DataOutputStream(new FileOutputStream("data.txt"));
                ){
            out.writeInt(100); // 4byte
            out.writeBoolean(true); // 1byte
            out.writeDouble(50.5); // 8byte
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}