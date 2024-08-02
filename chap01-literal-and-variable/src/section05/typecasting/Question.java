package section05.typecasting;

public class Question {
    public static void main(String[] args) {

        /*
        * 5명의 반 학생이 있으며 키는 각각
        * 178.5 / 178.3 / 198.7 / 188.67 / 168.8 이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.
        * 소수자리는 절식한다.
        *
        * */

        double tall1 = 178.5;
        double tall2 = 178.3;
        double tall3 = 198.7;
        double tall4 = 188.67;
        double tall5 = 168.8;

        System.out.println((int)((tall1+tall2+tall3+tall4+tall5)/5));

        // --------------------------------------

        long lnum =10L;
        int num = 190;

        int sum = (int)lnum + num;
        int sum2 = (int)(num + lnum);

        System.out.println(sum+sum2);

        /*
        *  사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고싶다.
        *
        * 소득은 다음과 같다.
        * 150480원
        * 1400원
        * 25000원
        * 30000원
        * 총합 - 이번 달 매출
        *
        * 다음과 같이 출력 해주세요
        * 홍길동의 총 매출은 --원 입니다.
        * 부가세 제외 소득은 --원 이고 부가세는 --원 입니다.
        * */

        int sum1 = 150480+1400+25000+30000;
        int avg1 = (int)(sum1*0.1);


        System.out.println(sum1-avg1);
        System.out.println("홍길동의 총 매출은 "+sum1+"원 입니다. \n부가세 제외 소득은 " +(sum1-avg1) +"원 이고 부가세는 " +avg1 +"원 입니다." );

























    }
}
