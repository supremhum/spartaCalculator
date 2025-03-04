package com.example.calculatorlv3;

import java.util.Scanner;

public class Input {
    // 속성
    public int leftValue;
    public int rightValue;
    public char operator;
    private final char[] operatorSet = {'+', '-', '*', '/'}; // 연산자 집합
    OperatorType operatorType;

    // 생성
    public Input() {}

    // 기능
    Scanner scanner = new Scanner(System.in);

    public void leftValue() {
        while (true) {
            try {
                System.out.print("(0포함) 양수를 입력해 주세요 (좌) : ");
                this.leftValue = scanner.nextInt();
                scanner.nextLine();
                if (leftValue < 0) {
                    System.out.println("음수가 올 수 없습니다\n");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("올바르지 않은 숫자입니다\n");
                scanner.nextLine();
            }
        }
    }

    public void rightValue() {
        while (true) {
            try {
                System.out.print("(0포함) 양수를 입력해 주세요 (우) : ");
                this.rightValue = scanner.nextInt();
                scanner.nextLine();
                if (rightValue < 0) {
                    System.out.println("음수가 올 수 없습니다\n");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("올바르지 않은 숫자입니다\n");
                scanner.nextLine();
            }
        }
    }

//    switch (operator) {
//        case '+':
//            operator = OperatorType.ADDITION;
//            break;
//    }

    public void operator() {
        while (true) {
            try {
                System.out.print("연산 기호를 입력해 주세요 : ");
                int a = 0;
                this.operator = scanner.nextLine().charAt(0);
                for (char operator : operatorSet) {
                    if (this.operator == operator) {
                        a++;
                        break;
                    }
                }
                if (a==0) {
                    continue;
                }
            } catch (Exception e) {
//                throw new IllegalArgumentException("알 수 없는 연산자");
                continue;
            }
            break;
        }
    }
}
