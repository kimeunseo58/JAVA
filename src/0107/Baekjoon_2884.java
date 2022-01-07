import java.util.Scanner;
public class Baekjoon_2884 {
    public static void main(String[] args){
        Scanner mine = new Scanner(System.in);
        int H = mine.nextInt();
        int M = mine.nextInt();
        if(M-45<0){
            if( H == 0) H = 23;
            else H -= 1;
            M +=15;
        }
        else M-=45;
        System.out.print(H + " " + M);
    }
}
