import java.util.Scanner;

public class without_loop {

    public static void makeFibonacci(int time , int fibonacci , int a , int b){
        System.out.print(String.valueOf(fibonacci)+" ");
        a = b ;
        b = fibonacci ;
        fibonacci = a + b ;
        // System.out.println(time);
        time-- ;
        if (time > 0){
            makeFibonacci(time ,fibonacci , a , b);
        };
    }

    public static void main(String[] args) {
        Integer fibonacci = 0 ;
        Integer a = 0 ;
        Integer b = 1 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time = ");
        int time = scanner.nextInt();
        // System.out.println(time);

        makeFibonacci(time ,fibonacci , a , b);
    }

}