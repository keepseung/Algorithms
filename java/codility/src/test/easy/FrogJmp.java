package test.easy;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // double로 나눠야 나눗셈 몫에 소수점이 나옴 예) 2.5
        // int로 나누면 소수점 제외한 몫만 나옴
        // Math.ceil은 올림임
        return (int) Math.ceil((Y-X)/(double)D);
    }

    public static void main(String[] args) {
        System.out.println(Math.ceil(5/(double)2));
        System.out.println(Math.ceil(5/2));
        System.out.println(Math.ceil(4/(double)2));
        System.out.println(Math.ceil(4/2));
    }
}
