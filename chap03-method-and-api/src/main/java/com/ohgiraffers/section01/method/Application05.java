package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {


        /*
        * return?
        * 모든 메소드 내부에는 return 이 존재한다.
        * void 메소드의 경우 return 을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가 해준다.
        * return 은 현재 메소드를 강제 종료하고 호출한 구문으로 다시 돌아가는 명령어 이다.
        * // void 외 다른 매개변수는 return을 가지고 있어야함!
        * */

        System.out.println("main() 메소드 시작함..");
        Application05 app5 = new Application05();
        app5.testmethod();

        System.out.println("main() 메소드 종료됨..");

    }

    public void testmethod(){

        System.out.println("testmethod() 동작 확인");

        return;

        // System.out.println("test");
        // return 은 메소드의 가장 마지막에 작성해야 한다.




    }

}
