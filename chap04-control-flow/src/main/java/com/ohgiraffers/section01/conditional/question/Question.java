package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
        * a,b,c 세 과목의 점수를 스캐너로 입력 받고
        * 세 과목의 점수를 메소드를 생성해 매개변수로 전달해 평균을 계산하고,
        *
        * 평균과 점수를 이용하여 합격 / 불합격 처리하는 기능을 구현 해주세요.
        *
        * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서, 평균이 60점을 넘어야함.)
        * 합격 했을 경우에는 평균 점수와 "합격 입니다" 를 출력하고,
        * 불합격의 경우에는 "불합격 입니다" 라고 출력 해주세요.
        *
        * */

        Scanner scr = new Scanner(System.in);
        System.out.println("a 과목의 점수를 입력해주세요 : ");
        int point1 = scr.nextInt();
        System.out.println("b 과목의 점수를 입력해주세요 : ");
        int point2 = scr.nextInt();
        System.out.println("c 과목의 점수를 입력해주세요 : ");
        int point3 = scr.nextInt();

        Question question = new Question();
        double avg = question.addTwoNumbers(point1,point2,point3);

        if (point1 >= 40 && point2 >= 40 && point3 >= 40 && avg >= 60){
            System.out.println("합격 입니다");
        }
else{
            System.out.println("불합격 입니다");
        }
    }

    public double addTwoNumbers (int point1, int point2, int point3)
    {
        return (point1 + point2 + point3) / 3.0;
    }
    // return 밑에 코드 입력하면 에러 발생!!
    // static은 이미 공간이 있어서 해줄 필요가 없음!!
    // non-static은 new로 공간을 만들어줌!!
}

