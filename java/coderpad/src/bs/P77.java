package bs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P77 {
    @Test
    void testInterval(){
        int[][] interval = interval(new int[][]{{1, 3}, {5, 8}, {4, 10}, {20, 25}});
        int[][] expectedResult1 = {{1, 3}, {4, 10}, {20, 25}};
        // 1 3 4 10 20 25
        assertArrayEquals(interval, expectedResult1);

        int[][] interval2 = interval(new int[][]{{1, 3}, {5, 8}, {4, 10}, {20, 25}, {22, 27}});
        int[][] expectedResult2 = {{1, 3}, {4, 10}, {20, 27}};
        // 1 3 4 10 20 27
        assertArrayEquals(interval2, expectedResult2);
    }

    public static int[][] interval(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0])); // 오름차순 정렬

        ArrayList<ArrayList<Integer>> mergedIntervals = new ArrayList<>();
        for (int[] inter: intervals){
            if (mergedIntervals.size()>0){

                ArrayList<Integer> lastOne = mergedIntervals.get(mergedIntervals.size() - 1);
                if (inter[0] <= lastOne.get(1)){

                    ArrayList<Integer> integers = getIntegerArrayList(lastOne.get(0), Math.max(lastOne.get(1), inter[1]));
                    mergedIntervals.set(mergedIntervals.size()-1,integers);
                }else{
                    ArrayList<Integer> integers = getIntegerArrayList(inter[0], inter[1]);
                    mergedIntervals.add(integers);
                }
            }else{
                ArrayList<Integer> integers = getIntegerArrayList(inter[0], inter[1]);
                mergedIntervals.add(integers);
            }
        }
        int[][] result = new int[mergedIntervals.size()][mergedIntervals.get(0).size()];
        for (int i =0; i< mergedIntervals.size(); i++){
            result[i][0] = mergedIntervals.get(i).get(0);
            result[i][1] = mergedIntervals.get(i).get(1);
        }
        return result;
    }

    private static ArrayList<Integer> getIntegerArrayList(int inter, int inter1) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(inter);
        integers.add(inter1);
        return integers;
    }
}
