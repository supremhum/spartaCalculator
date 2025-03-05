package com.example.calculatorlv3;
import java.util.Scanner;
public class Input {
    Scanner scanner = new Scanner(System.in);
    private int intValue;
    private char operator;
    private char[] operatorSet = {'+','-','*','/'};

    public Input() {
    }

    public int readInt() {
        while (true) {
            try {
                System.out.print("숫자를 입력해 주세요 : ");
                this.intValue = this.scanner.nextInt();
                if (this.intValue<0||this.intValue>1000000000){
                    System.out.println("음수 또는 너무 큰 값이 올 수 없습니다");
                }
                else {
                    this.scanner.nextLine();
                    return this.intValue;
                }
            } catch (Exception e) {
                System.out.println("잘못된 숫자 입력");
            }
            this.scanner.nextLine();
        }
    }

    public char readChar() {
        while (true) {
            try {
                System.out.print("연산자를 입력해 주세요 : ");
                this.operator = this.scanner.next().charAt(0);
                int counter = 0;
                for (char c:operatorSet) {
                    if (c==operator) {
                        counter++;
                        this.scanner.nextLine();
                        return this.operator;
                    }
                }
                if (counter==0) {
                    System.out.println("연산자를 다시 입력해 주세요");
                }
            } catch (Exception e) {
                System.out.println("잘못된 연산자 입력");
            }
            this.scanner.nextLine();
        }
    }
    public void exitApp () {
        System.out.print("exit를 입력하면 종료합니다. 계속하려면 아무버튼이나 눌러주세요 : ");
        int a = this.scanner.nextLine().indexOf("exit");
        if (a>=0) {
            System.out.println("계산기를 종료합니다");
            System.exit(0);
        }
    }
}
