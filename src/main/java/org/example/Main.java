package org.example;

import java.util.Scanner;

class Calculate {
    static int add (int num1, int num2) {
        return num1 + num2;
    }
    static int min (int num1, int num2) {
        return num1 - num2;
    }
    static int mul (int num1, int num2) {
        return num1 * num2;
    }
    static int div (int num1, int num2) {
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculate calc = new Calculate();

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("사칙연산 기호를 입력하세요: ");
        char oper = sc.next().charAt(0);
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        int result;
        switch (oper) {
            case '+':
                result = Calculate.add(num1, num2);
                System.out.println("결과: " + result);
                break;
            case '-':
                result = Calculate.min(num1, num2);
                System.out.println("결과: " + result);
                break;
            case '*':
                result = Calculate.mul(num1, num2);
                System.out.println("결과: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = Calculate.div(num1, num2);
                    System.out.println("결과: " + result);
                }
                break;
            default:
                System.out.println("올바른 사칙연산 기호를 입력하세요.");
        }

        sc.close();

    }
}