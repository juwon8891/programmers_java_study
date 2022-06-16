import java.io.*;

public class CharIO {
    public static void main(String[] args) {
        String line = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            line = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(line);
    }
}