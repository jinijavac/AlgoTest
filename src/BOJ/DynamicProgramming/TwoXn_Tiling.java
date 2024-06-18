package BOJ.DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoXn_Tiling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++){
            dp[i] = (dp[i-1]+dp[i-2]) % 1000000007 ;
        }
        System.out.println(dp[n]);
    }
}
//dp[i-1] --> 뒤에 1X2 타일 1개 붙이기
//dp[i-2] --> 뒤에 2X1 타일N2개 붙이기