package section06.temary;

public class Application02 {
    public static void main(String[] args) {

        // 영어시험을 본 결과 1번 학생은 90점, 2번 학생은 95점, 3번 학생은 81점을 맞았다.
        // 평균을 구한 후 논리 연산자를 이용해 90~100점 이면 합격을 출력 아니면 불합격 출력

        int inum1 = 90;
        int inum2 = 95;
        int inum3 = 81;

        System.out.println ("영어시험 평균 점수는 " + (inum1 + inum2 + inum3) / 3 + "점");

        int inum4 = (inum1 + inum2 + inum3) / 3;

        String result1 = (inum4 >= 90 && inum4 <=100) ? "합격" : "불합격";

        System.out.println(result1);

        // 승객의 놀이기구 탑승 가능여부를 출력하는 코드를 만들어 주세요.
        // 탑승 기준은 120cm 이상.

        int inum5 = 100;

        String result2 = (inum5 <= 120) ? "탑승가능" : "탑승불가";

        System.out.println(result2);





    }
}
