package BOJ.Implementation;

public class SelfNumber {
    public static void main(String[] args) {
        //1. 생성자 계산 메서드
        //2. 생성자인지 아닌지 boolean 판별
        //3. 셀프 넘버 배열에 추가
        //4. 셀프 넘버 출력 (인덱스 활용)

        //생성자가 있는 숫자?
        // -> ex) 39 / 10 = 3
        //        39 % 10 = 9

        //생성자인지 아닌지? --> boolean으로
        boolean [] a = new boolean[10001];

        for (int i = 1; i<10001; i++) { //1~10000 반복
            int n = test(i);
            if (n < 10001) {
                a[n] = true; //생성자 O
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (a[i] == false) {
                System.out.println(i);
            }
        }
    }
    //생성자 계산
    public static int test(int n){
        int sum = n;
        while (n != 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}