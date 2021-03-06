package day05;

import java.util.Scanner;

import util.ScannerUtil;

// 사용자로부터
// 국영수 점수를 입력받아
// 1~3회차의 점수와 총점 평균을 출력하는 프로그램
// 결과가 다음과 같이 나온다.

// 1번 박원영
// ---1번 시험---
// 국어: 080점 영어: 080점 수학: 079점
// 총점: 239점 평균: 79.66점
// -----------
// --2번 시험---
// .......
// --3번 시험---
// .......
// -----------
// 국영수를
// 국어 1회차, 2회차, 3회차
// 영어 1회차, 2회차, 3회차
// 수학 1회차, 2회차, 3회차

public class Ex04Array03 {
    private final static int SIZE = 3;
    private final static int SCORE_MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] koreanArray = new int[SIZE];
        int[] englishArray = new int[SIZE];
        int[] mathArray = new int[SIZE];
        
        int id = 0;
        String name = new String();
        
        System.out.print("번호: ");
        id = scanner.nextInt();
        
        System.out.print("이름: ");
        name = ScannerUtil.nextLine(scanner);
        
        
        // for문을 이용해서
        // 각 배열의 i번째에 시험 점수를 넣어준다
        for(int i = 0; i < SIZE; i++) {
            koreanArray[i] = ScannerUtil.nextInt(scanner, 
                    "국어 "+(i+1)+"회차 점수: ",0, SCORE_MAX);
            englishArray[i] = ScannerUtil.nextInt(scanner, 
                    "영어 "+(i+1)+"회차 점수: ",0, SCORE_MAX);
            mathArray[i] = ScannerUtil.nextInt(scanner, 
                    "수학 "+(i+1)+"회차 점수: ",0, SCORE_MAX);
        }
       
       // 입력된 정보 출력
        System.out.printf("번호: %d번 이름: %s\n", id, name); 
        // 배열을 돌면서 각 배열의 i번째를 
        // 출력해주자
        for(int i = 0; i < SIZE; i++) {
            int korean = koreanArray[i];
            int english = englishArray[i];
            int math = mathArray[i];
            int sum = korean + english + math;
            double average = sum / (double)SIZE;
            System.out.println((i+1)+"번 시험 결과");
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math); 
            System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
            System.out.println("-----------------------");
        }
        
        
        scanner.close();
    }
}












