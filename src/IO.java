import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
            try {
                fis = new FileInputStream("src/IO.java");
                fos = new FileOutputStream("byte.txt");
                int readData = -1;
                while((readData = fis.read()) != -1 ){
                    fos.write(readData);
                }
            } catch (Exception e) {
                    throw new RuntimeException(e);
            }finally{
                try{
                    fos.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
        }
        long endTime = System.currentTimeMillis();
        long result = endTime - startTime;
        System.out.println(result);
    }
}