package project;

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. 작은 정수
        int num = scan.nextInt();

        // 2. 큰 정수 2^63 - 1
        long number = scan.nextLong();

        // 3. 작은 실수
        float small = scan.nextFloat();

        // 4. 큰 실수
        Double big = scan.nextDouble();

        // 문장 + 숫자
        String str = scan.nextLine();
        int age = scan.nextInt();
        System.out.println(str);
        System.out.println(age);


        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println(num2);
        System.out.println(num1);


    }
}
