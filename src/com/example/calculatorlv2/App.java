package com.example.calculatorlv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int i; // 인덱스용
        Calculator calculator = new Calculator();
        Input inputHandler = new Input();

        // 실행
        System.out.println("===== 계산기를 실행합니다 =====");
        while (true) {
            // 입력 라인
            inputHandler.leftValue();
            inputHandler.rightValue();

            // 연산 라인
            inputHandler.operator();
            if (inputHandler.rightValue != 0 || inputHandler.operator != '/') {

                calculator.calculator(inputHandler.leftValue, inputHandler.rightValue, inputHandler.operator);

                System.out.println(inputHandler.leftValue + " " + inputHandler.operator + " " + inputHandler.rightValue + " = " + calculator.getResultSet(calculator.resultSetSize-1));
            } else {
                System.out.println("0으로 나눌 수 없습니다.\n");
            }

            System.out.print("exit 를 입력하면 계산기를 종료합니다. 계속하려면 아무키 입력 : ");
            if (scanner1.next().equals("exit")) {
                scanner1.nextLine();
                break;
            }
            scanner1.nextLine();
        }

        i = 0;
        while (true) {
            try {
                System.out.println(calculator.getResultSet(i));
                i++;
            } catch (Exception e) {
                break;
            }
        }

        // setter 활용
        calculator.setResultSet(0, 999999);
        i = 0;
        while (true) {
            try {
                System.out.println(calculator.getResultSet(i));
                i++;
            } catch (Exception e) {
                break;
            }
        }

        // removeFirstEntry 활용
        calculator.removeFirstEntry();
        i = 0;
        while (true) {
            try {
                System.out.println(calculator.getResultSet(i));
                i++;
            } catch (Exception e) {
                break;
            }
        }

        System.out.println();
        // 스캐너 종료
        scanner1.close();
    }
}

