import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        List<String> list = Arrays.asList("A","B","C");
        for (String i: list){
            System.out.println(i);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}