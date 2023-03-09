package project;

// 외부에 만들어져 있는 스캐너를 가져온다.
import java.util.Scanner;

public class Parrot {
    public static void main(String[] args) {
        System.out.println("나는 앵무새입니다.");

        // parrot 이라는 이름을 가진 스캐너, System 안으로 데이터를 가져온다.
        Scanner parrot = new Scanner(System.in);
        // parrot (Scanner) 이 한 줄을 읽어와 (nextLine) 문장(String) str 변수에 저장한다.
        String str = parrot.nextLine();

        System.out.println(str);
    }
}
