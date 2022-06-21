package bs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class P134 {

    @Test
    void testP134() {
        SparseArray sparseArray = new SparseArray(new int[]{0, 0, 0}, 5);
        assertEquals(sparseArray.get(0), 0);
        assertEquals(sparseArray.get(3), 0);

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> sparseArray.get(-1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> sparseArray.set(-1, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> sparseArray.get(5));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> sparseArray.set(5, 0));

        sparseArray.set(0, 1);
        assertEquals(sparseArray.get(0), 1);
        sparseArray.set(4, 1);
        assertEquals(sparseArray.get(4), 1);
    }
}

class SparseArray {
    private Map<Integer, Integer> map = new HashMap<>();
    private int size;

    // init(arr, size): 큰 원본 배열과 사이즈를 인자로 받아 초기화 합니다.
    public SparseArray(int[] arr, int size) {
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
        this.size = size;
    }

    //set(i, val): 인덱스 i 를 val 값으로 업데이트 합니다.
    public void set(int index, int value) {
        this.checkBound(index);
        this.map.put(index, value);
    }

    private void checkBound(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    //get(i): 인덱스 i 번째 값을 반환합니다
    public int get(int index) {
        this.checkBound(index);
        return map.get(index) == null ? 0 : map.get(index);
    }
}
