package section03.increment;

public class Application {
    public static void main(String[] args) {

        // 증강 연산자
        // '++X' , 'X++' : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가 시킨다.
        // '--X' , 'X--' : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 뺀다.

        int num = 10;
        int num2 = 20;
        int result = 0;

        result = result * ++num; // num = num + 1
        System.out.println(result);
        System.out.println(num); // 연산결과와 상관없이 num을 1 증가시킴

        result = 1;
        result = result * num++;
        System.out.println(result);
        System.out.println(num);

        System.out.println("------------------");
        result = 1;
        result = result * ++num;
        System.out.println(result);
        System.out.println(num);






    }
}
