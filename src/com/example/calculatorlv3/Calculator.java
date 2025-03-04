package com.example.calculatorlv3;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> resultSet;
    public int resultSetSize;

    public Calculator() {
        this.resultSet = new ArrayList<>();
        this.resultSetSize = 0;
    }

    public void calculator(int leftValue, int rightValue, char operator) {
        int result;
        switch (operator) {
            case '+':
                OperatorType addition = OperatorType.ADDITION;
                result = leftValue + rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
            case '-':
                OperatorType subtract = OperatorType.SUBTRACT;
                result = leftValue - rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
            case '*':
                OperatorType multiply = OperatorType.MULTIPLY;
                result = leftValue * rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
            case '/':
                OperatorType divide = OperatorType.DIVIDE;
                result = leftValue / rightValue;
                this.resultSet.add(result);
                resultSetSize++;
                break;
            default:
//                System.out.println("알수 없는 연산 구문");
                throw new IllegalArgumentException("알 수 없는 연산자");
        }
    }

    public void removeFirstEntry(){
        resultSet.remove(0);
        resultSetSize--;
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
