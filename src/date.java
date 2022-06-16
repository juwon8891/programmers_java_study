import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;

public class date {
    LocalDateTime timePoint = LocalDateTime.now();  // 현재의 날짜와 시간
    //LocalDate theDate = timePoint.toLocalDate();
    Month month = timePoint.getMonth();             // 현재 날짜의 달을 Month형으로 나타냅니다.
    //int hour = timePoint.getHour();                 // 현재 시
    //int minute = timePoint.getMinute();             // 현재 분
    //int second = timePoint.getSecond();             // 현재 초
    public static void main(String[] args){
        date d = new date();
        System.out.println(d.month);
    }
}