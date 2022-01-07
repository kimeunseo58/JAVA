import java.util.Scanner;
public class Baekjoon_2588 {
    public static void main(String[] args){
        Scanner mine = new Scanner(System.in);
        int A = mine.nextInt();
        int B = mine.nextInt();
        System.out.println((B%10)*A);
        System.out.println((B/10)%10*A);
        System.out.println((B/100)*A);
        System.out.println(A*B);
    }
}
