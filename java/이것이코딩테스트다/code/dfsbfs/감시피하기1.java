package dfsbfs;

import java.util.ArrayList;
import java.util.Scanner;

public class 감시피하기1 {

    public static int n;
    public static char[][] board = new char[6][6];
    public static ArrayList<Position> teachers = new ArrayList<>();
    public static ArrayList<Position> spaces = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i =0; i<n ;i++){
            for (int j =0; j<n ;j++){
                board[i][j] = sc.next().charAt(0);

                if (board[i][j] =='T') {
                    teachers.add(new Position(i, j));
                }

                if (board[i][j] =='O') {
                    spaces.add(new Position(i, j));
                }
            }
        }
        // 빈 공간에 3개를 뽑는 조합 확인
        Combination combination = new Combination(spaces.size(), 3);
        combination.combination(spaces, 0,0 ,0);
        ArrayList<ArrayList<Position>> spaceList = combination.getResult();

        boolean found = false;
        for (int i =0; i< spaceList.size(); i++) {
            for (int j =0; j< spaceList.get(i).size(); j++){
                int x = spaceList.get(i).get(j).getX();
                int y = spaceList.get(i).get(j).getY();
                board[x][y] = 'O';
            }

            // 학생이 한 명도 감지되지 않은 경우
            if (!process()) {
                found = true;
                break;
            }
        }

        if (found) System.out.println("YES");
        else System.out.println("NO");

    }

    private static boolean process() {
        for (int i =0; i<teachers.size(); i++){
            int x = teachers.get(i).getX();
            int y = teachers.get(i).getY();

            for (int j = 0; j <4;j++){
                if (watch(x,y,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean watch(int x, int y, int j) {
        switch (j){
            case 0:
                while (y>=0){
                    if (board[x][y] =='S'){
                        return true;
                    }
                    if (board[x][y] =='O'){
                        return false;
                    }
                    y-=1;
                }
                break;
            case 1:
                while (y>=0){
                    if (board[x][y] =='S'){
                        return true;
                    }
                    if (board[x][y]=='O'){
                        return false;
                    }
                    y-=1;
                }
                break;
            case 2:
                while (x>=0){
                    if (board[x][y] == 'S'){
                        return true;
                    }
                    if (board[x][y] == 'O'){
                        return false;
                    }
                    x-=1;
                }
            case 3:
                while (x>=0){
                    if (board[x][y] =='S'){ // 학생이 있는 경우
                        return true;
                    }
                    if (board[x][y] =='O'){ // 장애물이 있는 경우
                        return false;
                    }
                    x+=1;
                }
                break;
        }
        return false;
    }

    static class Combination{
        private int n;
        private int r;
        private int[] now;
        private ArrayList<ArrayList<Position>> result;

        public Combination(int n, int r) {
            this.n = n;
            this.r = r;
            this.now = new int[r];
            this.result = new ArrayList<>();

        }

        public void combination(ArrayList<Position> arr, int depth, int index, int target){
            if (depth ==r) { // r개 뽑은 경우
                ArrayList<Position> temp = new ArrayList<>();
                for (int i=0; i< now.length; i++){
                    temp.add(arr.get(now[i]));
                }
                result.add(temp);
                return;
            }
            if (target ==n) return;
            now[index] = target;
            combination(arr, depth+1, index+1, target+1);
            combination(arr, depth, index, target+1);

        }

        public ArrayList<ArrayList<Position>> getResult() {
            return result;
        }
    }

    static class Position{
        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
