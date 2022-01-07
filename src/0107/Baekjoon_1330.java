import java.util.Scanner;
public class Baekjoon_1330 {
    public static void main(String[] args){
        Scanner mine = new Scanner(System.in);
        int a,b;
        a = mine.nextInt();
        b = mine.nextInt();
        if(a>b) System.out.print(">");
        else if(a==b) System.out.print("==");
        else System.out.print("<");

    }
}
