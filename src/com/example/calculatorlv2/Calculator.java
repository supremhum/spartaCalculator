package com.example.calculatorlv2;
import java.util.ArrayList;

public class Calculator {
    private int result; // 연산값

    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    // 연산 결과를 저장하는 공간이 있다.
    public ArrayList<Integer> resultSet;

    // 생성자로 만들면 결과 집합을 새로 가진다
    public Calculator(){
        this.resultSet = new ArrayList<>();
    }

    // return 연산결과인 매서드 구현 정수, 정수, 연산자 입력받으면 해당 연산결과 보내줌
    public int calculator (int leftValue, int rightValue, char operator){
        switch (operator) {
            case '+':
                result = leftValue + rightValue;
                this.resultSet.add(result);
                return result;
            case '-':
                result = leftValue - rightValue;
                this.resultSet.add(result);
                return result;
            case '*':
                result = leftValue * rightValue;
                this.resultSet.add(result);
                return result;
            case '/':
                result = leftValue / rightValue;
                this.resultSet.add(result);
                return result;
            default:
                System.out.println("알수 없는 연산 구문");
                return 0;
        }
    }

    public void addResult(int num){
        resultSet.add(num);
    }
}
