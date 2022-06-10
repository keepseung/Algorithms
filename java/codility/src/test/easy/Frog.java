package test.easy;

public class Frog {
    public int solution(int X, int Y, int D) {

        int result =0;
        while (Y>X){
            X += D;
            result +=1;
        }
        return result;
    }
}
