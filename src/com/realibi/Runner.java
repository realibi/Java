package com.realibi;
import java.lang.*;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNum = scanner.nextInt();

        int nod = findNod(firstNum, secondNum);
        System.out.println("NOD: " + nod);
    }

    public static int findNod(int firstNum, int secondNum) {
        if (secondNum == 0){
            return firstNum;
        }

        return findNod(secondNum, firstNum % secondNum);
    }
}
