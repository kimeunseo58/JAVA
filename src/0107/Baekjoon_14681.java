import java.util.Scanner;
public class Baekjoon_14681 {
    public static void main(String[] args){
        Scanner mine = new Scanner(System.in);
        int x = mine.nextInt();
        int y = mine.nextInt();
        if(x>0 && y>0) System.out.print(1);
        else if(x>0 && y<0) System.out.print(4);
        else if(x<0 && y<0) System.out.print(3);
        else System.out.print(2);
    }
}
