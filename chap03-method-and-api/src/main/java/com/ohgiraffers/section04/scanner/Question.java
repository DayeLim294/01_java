package main.java.com.ohgiraffers.section04.scanner;

import java.util.Random;
import static main.java.com.ohgiraffers.section04.scanner.Application03.printStr;

public class Question {
    public static void main(String[] args) {

        // 계산기 만들기
        // 계산기에 필요한 기능은 + , - , * , / , % 총 5가지 연산자다.
        // (예시)
        // 첫 번 째 숫자를 입력하세요 :
        // 2
        // 연산할 기호를 쓰세요 :
        // +
        // 두 번 째 숫자를 입력하세요 :
        // 결과는 4입니다



        /*
        * -100 ~ 100 사이의 난수를 발생 시켜서 인자로 전달하면
        * 매개변수가 양수면서 짝수면 X는 양수면서 짝수 입니다. 양수면서 홀수면 X는 양수면서 홀수 입니다.
        *          음수면서 짝수면 X는 음수면서 짝수 입니다. 음수면서 홀수면 X는 음수면서 홀수 입니다.
        * 를 반환하는 메소드를 다른 클래스에 생성해 메인메소드에 호출한 후 화면에 출력해보자!
        * (static / non-static 한번씩)
        * */

        Random random = new Random();
        Application03 app3 = new Application03();

        int randomNumber2 = random.nextInt(200)-100;
        System.out.println(randomNumber2);


        // Stactic
        String str = printStr(randomNumber2);
        System.out.println(str);

        // non-Static
        String str2 = app3.printStr2(randomNumber2);
        System.out.println(str2);









    }
}
