public class Solution1 {

    public int solution(String t, String p) {

        int result = 0; //result 정수형으로 변수 선언

        //1. 문자열 -> 숫자로 우선 변환함
        //자릿수 범위 문제가 있기때문에 parse시 Long.parseLong 사용해야합니다.
        try {
            long pnum = Long.parseLong(p); //문자열을 숫자로 변환
            int pCnt = p.length(); //p 문자열 배열의 갯수
            int tCnt = t.length(); //t 문자열 배열의 갯수


            System.out.println("길이 : " + tCnt + "와 p길이 : " + pCnt);
            //2. 비교하기
            for (int i = 0; i < tCnt; i++) {
                if(i-1 + pCnt >= tCnt){
                    break;
                }
                String tnumStr = t.substring(i, (i + pCnt)); //pCnt 크기만큼 부분문자열 따오기
                long tnum = Long.parseLong(tnumStr); // 부분문자열을 정수형으로 전환
                if (tnum <= pnum) { //pnum의 숫자보다 작거나 같으면 결과값 증가
                    result++;
                }
            }
        } catch (NumberFormatException e) {
            e.getMessage();
        }


        return result;
    }
}
