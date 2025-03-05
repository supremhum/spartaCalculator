package com.example.calculatorlv3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int leftValue;
        int rightValue;
        char operator;
        Calculator calculator = new Calculator();

        Input input = new Input();

        while(true) {

            // 입력받기
            leftValue = input.readInt();
            rightValue = input.readInt();
            operator = input.readChar();

            // 계산진행 + 출력 + 결과저장
            calculator.calculator(leftValue,rightValue,operator);

            // 종료선택
            input.exitApp();
        }

    }
}
