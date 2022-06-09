package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 성적낮은학생순으로정렬 {
    static class Student implements Comparable<Student>{

        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        // 점수 낮은 순서대로 정렬
        @Override
        public int compareTo(Student o) {
            if (this.score <o.score) return -1;
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // n명의 학생 정보를 입력받아 리스트에 저장
        List<Student> students = new ArrayList<>();
        for (int i =0; i <n ; i++){
            String name = sc.next();
            int score = sc.nextInt();
            students.add(new Student(name, score));
        }

        Collections.sort(students);

        for(int i =0; i <n ; i++){
            System.out.println(students.get(i).getName());
        }
    }
}
