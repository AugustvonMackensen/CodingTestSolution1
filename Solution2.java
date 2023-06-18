public class Solution2 {
    public int solution(int n) {
        int answer = 0;
        int num = 1;

        //나머지가 1이 나오는 가장 작은 숫자 -> 1부터 쭉 1씩 증가시키면서 나머지가 1이될때 while문 빠져나오게 한다.

        while(true){
            num++;
            if(n % num == 1){
                answer = num;
                break;
            }
        }
        return answer;
    }
}
