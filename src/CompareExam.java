public class CompareExam{
    public static void exce(Compare compare){
        int k = 10;
        int m = 20;
        int value = compare.compareTo(k,m);
        System.out.println(value);
    }
    public static void main(String[] args) {
        exce((i,j)->{
            return i-j;
        });
    }

}