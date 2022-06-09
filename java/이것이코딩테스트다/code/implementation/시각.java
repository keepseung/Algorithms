package implementation;

import java.util.Scanner;

public class 시각 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int cnt= 0;

        for (int i=0; i<=h ; i++){
            for (int j=0; j< 60 ; j++){
                for (int k=0; k<60 ; k++){
                    if (check(i,j,k)) cnt ++;
                }
            }
        }
    }

    private static boolean check(int i, int j, int k) {
        if (i % 10 ==3 || j % 10 ==3 || j / 10==3 || k /10 ==3 || k %10==3){
         return true;
        }
        return false;
    }
}
