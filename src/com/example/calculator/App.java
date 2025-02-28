package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int leftValue; // 좌측 피연산자
        int rightValue; // 우측 피연산자
        char operator; // 연산
        int result; // 연산값
        char[] operatorSet = {'+', '-', '*', '/'}; // 연산자 집합

        // 실행
        while (true) {

        // 입력 라인

            // 양의 정수 입력받기 + 정수가 아닌 값, 범위를 넘는 값 예외처리
            while (true) {
                try {
                    System.out.print("(0포함) 양수를 입력해 주세요 (leftValue) : ");
                    leftValue = scanner1.nextInt();
                    scanner1.nextLine();
                    if (leftValue < 0) {
                        System.out.println("*** 음수를 받을 수 없습니다 (leftValue) \n");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("입력에서 잘못된 정보가 들어왔습니다 (leftValue) \n");
                    scanner1.nextLine();
                }
            }

            // 양의 정수 입력받기 + 정수가 아닌 값, 범위를 넘는 값 예외처리
            while (true) {
                try {
                    System.out.print("(0포함) 양수를 입력해 주세요 (rightValue) : ");
                    rightValue = scanner1.nextInt();
                    scanner1.nextLine();
                    if (rightValue < 0) {
                        System.out.println("*** 음수를 받을 수 없습니다 (rightValue) \n");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("입력에서 잘못된 정보가 들어왔습니다 (rightValue) \n");
                    scanner1.nextLine();
                }
            }

            // 사칙연산 기호만 입력받기
            while (true) {
                System.out.print("{ +, -, *, / } 사칙연산 기호를 입력해 주세요 (operator) : ");
                operator = scanner1.nextLine().charAt(0);
                int checkNum = 0;
                for (char i : operatorSet) {
                    if (i == operator) {
                        checkNum++;
                        break;
                    }
                }
                if (checkNum == 0) {
                    System.out.println("*** 올바른 사칙연산기호가 아닙니다\n");
                    continue;
                } else {
                    break;
                }

            }

        // 연산 라인

            // 연산자에 따른 실제 계산 진행
            switch (operator) {
                case '+':
                    result = leftValue + rightValue;
                    System.out.println(leftValue + " " + operator + " " + rightValue + " = " + result);
                    break;

                case '-':
                    result = leftValue - rightValue;
                    System.out.println(leftValue + " " + operator + " " + rightValue + " = " + result);
                    break;

                case '*':
                    result = leftValue * rightValue;
                    System.out.println(leftValue + " " + operator + " " + rightValue + " = " + result);
                    break;

                    // 나눗셈 예외처리 분모에 0이였을 경우 해당 계산 종료
                case '/':
                    if (rightValue == 0) {
                        System.out.println("분모가 0이 될 수 없습니다.\n");
                        break;
                    }
                    result = leftValue / rightValue;
                    System.out.println(leftValue + " " + operator + " " + rightValue + " = " + result);
                    break;

                default:
                    System.out.println("*** 연산 도중 알 수 없는 오류가 발생했습니다\n");
            }
            System.out.print("exit 를 입력하면 계산기를 종료합니다. 계속하려면 아무키 입력 : ");
            if (scanner1.next().equals("exit")) {
                scanner1.nextLine();
                break;
            }
            scanner1.nextLine();
        }
        // 스캐너 종료
        scanner1.close();
    }
}

