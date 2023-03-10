package project;

public class Arrays {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
         // for(타입 변수명) : 콜렉션명
        for (String data: arr) {
            System.out.println(data);
        }
    }
}
