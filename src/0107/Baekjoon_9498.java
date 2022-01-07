import java.util.Scanner;
public class Baekjoon_9498 {
    public static void main(String[] args) {
        Scanner mine = new Scanner(System.in);
        int a = mine.nextInt();
        if(100 >= a && a >=90) System.out.print("A");
        else if(89 >= a && a >=80) System.out.print("B");
        else if(79 >= a && a >=70) System.out.print("C");
        else if(69 >= a && a >=60) System.out.print("D");
        else System.out.print("F");
    }
}
