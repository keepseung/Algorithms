package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 정렬라이브러리키기준 {

    static class Fruit implements Comparable<Fruit>{
        private String name;
        private int score;

        public Fruit(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        // 정렬 기준은 점수가 낮은 순서
        @Override
        public int compareTo(Fruit o) {
            if (this.score < o.score) return -1;
            return 1;
        }
    }
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("A", 2));
        fruits.add(new Fruit("B", 5));
        fruits.add(new Fruit("C", 3));

        Collections.sort(fruits);
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("("+fruits.get(i).getName()+","+fruits.get(i).getScore()+" )");
        }
    }

}
