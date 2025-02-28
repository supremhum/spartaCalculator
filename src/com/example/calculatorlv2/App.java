package com.example.calculatorlv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int leftValue; // 좌측 피연산자
        int rightValue; // 우측 피연산자
        char operator; // 연산
//            int result; // 연산값
        char[] operatorSet = {'+', '-', '*', '/'}; // 연산자 집합
        Calculator calculator = new Calculator();

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

            // 사칙연산 기호만 입력받기 동시에 계산까지.
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
                } else {
                    if (rightValue == 0 && operator == '/') {
                        System.out.println("0으로 나눌 수 없습니다.\n");
                        break;
                    } else {
                        // 입력받는건 끝났고 실제 계산 진행
                        // 계산 결과는 resultSet의 첫번째 항목에 저장하는데 이러면 안되지 계속 진행되니깐 끝자락의 결과를 출력해야해
                        // 끝자락의 index는 length로 가늠하지 않고 ArrayList 클래스 살펴보니 size()매소드가 있다 이를 활용
                        // size 는 크기라서 1부터고
                        // get은 index라서 0부터 라는 개념이 있으니
                        // 이를 매꾸기 위해 .size() -1 을 하면 가장 마지막 인덱스에 접근 할 수 있다.

                        calculator.calculator(leftValue, rightValue, operator);
                        System.out.println(leftValue + " " + operator + " " + rightValue + " = " + calculator.getResultSet(calculator.resultSetSize - 1));
                        break;
                    }

                }

            }

            System.out.print("exit 를 입력하면 계산기를 종료합니다. 계속하려면 아무키 입력 : ");
            if (scanner1.next().equals("exit")) {
                scanner1.nextLine();
                break;
            }
            scanner1.nextLine();
        }

        int i = 0;
        while (true) {
            try {
                System.out.println(calculator.getResultSet(i));
                i++;
            } catch (Exception e) {
                break;
            }

        }


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
        System.out.println();
        // 스캐너 종료
        scanner1.close();
    }
}

