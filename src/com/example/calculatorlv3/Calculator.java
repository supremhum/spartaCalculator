package com.example.calculatorlv3;

import java.util.ArrayList;

public class Calculator {
    private int result;
    private final ArrayList<Integer> resultList = new ArrayList<>();


    public Calculator() {}

    private int resultListSize() {
        return this.resultList.size();
    }

    public void calculator(int leftValue,int rightValue,char operator) {
        if (rightValue == 0 && operator == '/') {
            System.out.println("분모가 0이 될 수 없습니다");
        } else {
            switch (operator) {
                case '+':
                    this.result = leftValue + rightValue;
                    resultList.add(this.result);
                    break;

                case '-':
                    this.result = leftValue - rightValue;
                    resultList.add(this.result);
                    break;

                case '*':
                    this.result = leftValue * rightValue;
                    resultList.add(this.result);
                    break;

                case '/':
                    this.result = leftValue / rightValue;
                    resultList.add(this.result);
                    break;

                default:
                    throw new IllegalArgumentException("알수없는 연산자 오류");
            }
            System.out.println(String.format("%d %s %d = %d",leftValue,operator,rightValue,this.result));
        }
    }

    // 최근 연산결과 불러오기
    public int getResult(int index) {

        return this.resultList.get(resultListSize()-1-index);
    }

    // 결과집합에서 index 번째 값 value로 바꾸기
    public void setResultList(int index, int value) {
        resultList.set(index,value);
    }

    // 첫번째 결과값 지우기
    public void removeFirstEntry () {
        resultList.remove(0);
    }
}
