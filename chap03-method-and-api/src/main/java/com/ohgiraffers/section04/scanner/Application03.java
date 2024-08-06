package main.java.com.ohgiraffers.section04.scanner;

public class Application03 {

    public static String printStr (int num)
    {
        String str = num>0 ? (num%2==0 ? "양수면 짝수 입니다" : "양수면서 홀수 입니다") : (num%2==1 ? "음수면 홀수 입니다" : "음수면서 짝수 입니다");
        return str;



    }

    public String printStr2 (int num) {
        String str = num>0 ? (num%2==0 ? "양수면 짝수 입니다" : "양수면서 홀수 입니다") : (num%2==1 ? "음수면 홀수 입니다" : "음수면서 짝수 입니다");
        return str;
    }

}
