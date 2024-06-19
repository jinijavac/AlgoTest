package BOJ.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongJump {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] dp = new long[n+1];

        //효진이는 0번째 칸에서 출발
        //만약 인덱스 2를 구할 경우 0번째, 1번째가 필요

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 3; i < n+1; i++){
            dp[i] = (dp[i-1]+dp[i-2]) % 1234567 ;
        }
        System.out.println(dp[n]);
    }
}
