class Solution {
    public int solution(String s) {
        String[] numArray =  {"zero","one","two", "three","four","five","six","seven","eight","nine"};
        for (int i =0; i <numArray.length; i++){
            s = s.replaceAll(numArray[i], Integer.toString(i));
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}