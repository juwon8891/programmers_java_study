import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class MyHelloExam {
    @Count100
    public static void main(String[] args) {
        MyHello hello = new MyHello();
        Method method = null;
        try {
            method = hello.getClass().getDeclaredMethod("hello");
            if(method.isAnnotationPresent(Count100.class)){
                for(int i=0; i<=100; i++){
                    hello.hello();
                }
            }else{
                hello.hello();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}