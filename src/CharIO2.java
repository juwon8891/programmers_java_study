import java.io.*;

public class CharIO2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new FileReader("src/CharIO2.java"));
            pw = new PrintWriter(new FileWriter("test.txt"));
            String line = null;
            while((line = br.readLine()) != null){
                pw.println(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally{
            pw.close();
        }
    }
}