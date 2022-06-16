import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO2_buffer {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;
            try {
                fis = new FileInputStream("src/IO.java");
                fos = new FileOutputStream("byte.txt");
                int readCount = -1;
                byte[] buffer =  new byte[512];
                while((readCount = fis.read(buffer)) != -1 ){
                    fos.write(buffer,0,readCount);
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