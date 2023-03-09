package project;

public class Main {
    public static void main(String[] args) {
        // 컴퓨터는 바보라서 큰 따옴표가 ("") 있으면 얘는 '문장'이라고 생각합니다.
        System.out.println("3" + "3");
        System.out.println(3 + 3);
        System.out.println(1.5);
        System.out.println(-3);

        // 문장이랑 문자를 구별합니다. 작은 따옴표 '' 문자
        System.out.println('A');

        // 특수 문자 출력은 역슬래시(\)를 사용한다.
        System.out.println("\"Hello world\"");

        // \n 을 사용하면 엔터를 칠수 있다.
        System.out.println("Hello \nworld");

        // \t: 탭, \b: 백스페이스
    }
}