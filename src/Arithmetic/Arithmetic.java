package Arithmetic; //패키지 선언, 클래스 조직화, 이름 충돌 방지, JS의 네임스페이스

import java.util.Scanner;

/**
 * Arithmetic
 */
class Arithmetic {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.println("X와 Y의 사칙연산");

    System.out.print("scan X :");
    int x = stdIn.nextInt(); //키보드 입력 받기

    System.out.print("scan Y :");
    int y = stdIn.nextInt();

    System.out.println("X+Y : " + (x + y));
    System.out.println("X-Y : " + (x - y));
    System.out.println("X*Y : " + (x * y));
    System.out.println("X/Y : " + (x / y));
    System.out.println("X%Y : " + (x % y));

  }
}
