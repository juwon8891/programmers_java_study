import java.util.*;

public class calendar{
    public String hundredDaysAfter(){
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        int y = cal.get(Calendar.YEAR);
        int M = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DATE);
        String result = String.format("%d년%d월%d일",y,M,d);
        return result;
    }
    public static void main(String[] args){
        calendar ex = new calendar();
        String a = ex.hundredDaysAfter();
        System.out.println(a);
    }
}