public class StringExam2 {
    public static void main(String[] args) {
        long startTime1 = System.currentTimeMillis();
        String str1 ="";
        for(int i=0; i<=1000; i++){
            str1 += "*"; // str1 = new StringBuffer().append("*").toString();
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println(str1);

        long startTime2 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer(); // 이렇게 사용
        for(int i=0; i<=1000; i++){
            sb.append("*");
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println(sb.toString());
        long duration1 = endTime1-startTime1;
        long duration2 = endTime2-startTime2;
        System.out.println("String의 +연산을 이용한 경우 : "+ duration1);
        System.out.println("StringBuffer의 append()을 이용한 경우 : "+ duration2);
    }
}