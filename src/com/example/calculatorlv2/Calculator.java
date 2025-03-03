package com.example.calculatorlv2;

import java.util.ArrayList;

public class Calculator {
//    private int result; // 연산값
//    int count = 0; // 계산이 시행된 횟수. 이를 활용해서 resultSet.size()를 간접적으로 얻으려 했었다.

    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    // 연산 결과를 저장하는 공간이 있다.
    private ArrayList<Integer> resultSet;
    public int resultSetSize;
//    public int resultSetSize = 0;
//     public int resultSetSize = resultSet.size();// <<< 얘로하면 널포인트 발생
    // 여기서 null 값을 point하는 문제가 있었다.
    // 계산할 때마다 직접 후위증감연산을 하는 것으로 바꿈
    // 또는


    // 생성자로 만들면 결과 집합을 새로 가진다
    public Calculator() {
        this.resultSet = new ArrayList<>();
        this.resultSetSize = 0;
    }

    // return 연산결과인 매서드 구현 정수, 정수, 연산자 입력받으면 해당 연산결과 보내줌
    public void calculator(int leftValue, int rightValue, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = leftValue + rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
//                return result;
            case '-':
                result = leftValue - rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
//                return result;
            case '*':
                result = leftValue * rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
//                return result;
            case '/':
                result = leftValue / rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
//                return result;
            default:
                System.out.println("알수 없는 연산 구문");
//                return 0;
        }
    }
    // 가장 먼저 저장된 데이터를 삭제하는 메서드
    // set의 인덱스의 0번을 제거하면 끝
    // ArrayList.remove(index) 를 알았고 index=0 이면 가장 첫번째 결과가 지워지는것
    public void removeFirstEntry(){
        resultSet.remove(0);
    }

    // 게터
    public int getResultSet(int index) {
        return this.resultSet.get(index);
    }

    // 세터
    public void setResultSet(int index, int element){
        this.resultSet.set(index,element);

    }
}
