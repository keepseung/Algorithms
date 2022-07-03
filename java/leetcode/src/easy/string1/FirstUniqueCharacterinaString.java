package easy.string1;

public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
    public static int firstUniqChar(String s) {
        int notRepeatIndex = -1;
        String[] source = s.split("");
        for (int i =0; i <source.length; i++){
            boolean isRepeating = false;
            for (int j =0; j <source.length; j++){
                if (source[i].equals(source[j])){
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating){
                notRepeatIndex = i;
                break;
            }
        }
        return notRepeatIndex;
    }
}
