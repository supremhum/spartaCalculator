package com.example.calculatorlv2;

public class App {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator();
        cal1.addResult(0);
        cal1.addResult(-12);
        cal1.addResult(5);
        cal1.addResult(666);
        cal1.addResult(6);
        cal1.addResult(0);
        cal1.addResult(999);

        for (int i:cal1.resultSet){
            System.out.println(i);
        }

    }
}
