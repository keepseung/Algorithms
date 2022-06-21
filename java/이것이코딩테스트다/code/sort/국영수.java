package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
/*
12
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghyuk 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90
 */
public class 국영수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        int n = sc.nextInt();
        for (int i =0; i <n; i++){
            String name = sc.next();
            int guk = sc.nextInt();
            int yong = sc.nextInt();
            int su = sc.nextInt();
            students.add(new Student(name, guk, yong, su));
        }

        students.sort(new StudentComparator());

        for (Student student : students) {
            System.out.println(student.getName());
        }

    }

    static class Student{
        private String name;
        private int guk;
        private int yong;
        private int su;

        public Student(String name, int guk, int yong, int su) {
            this.name = name;
            this.guk = guk;
            this.yong = yong;
            this.su = su;
        }

        public String getName() {
            return name;
        }

        public int getGuk() {
            return guk;
        }

        public int getYong() {
            return yong;
        }

        public int getSu() {
            return su;
        }
    }

    static class StudentComparator implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            // 1. 국어 내림차순
            // 2. 영어 오름차순
            // 3. 수학 내림차순
            // 4. 이름이 증가하는 순
            if (o1.getGuk() > o2.getGuk()){ // 내림차순
                return -1;
            }else if (o1.getGuk() == o2.getGuk()){ // 오름차순
                if (o1.getYong() < o2.getYong()){
                    return -1;
                }else if (o1.getYong() == o2.getYong()){
                    if (o1.getSu() > o2.getSu()){ // 내림차순
                        return -1;
                    }else if (o1.getSu() == o2.getSu()){
                        if (o1.getName().compareTo(o2.getName()) < 0){ // 문자열 오름차순
                            return -1;
                        }else{
                            return 1;
                        }
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }
    }
}
