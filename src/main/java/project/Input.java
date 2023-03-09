package project;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Scanner 에 마우스 갖다대고 윈도우: alt + enter
        // 입력을 받을 스캐너를 만든다. new: 새로운, System.in: 시스템 안으로 스캔한다.
        Scanner input = new Scanner(System.in);

        // String: 문장이라는 뜻
        // str: 문장의 이름
        // input.nextLine() : 한 줄을 입력받는다.
        String str = input.nextLine();

        // str을 출력해라.
        System.out.println(str);
    }
}
