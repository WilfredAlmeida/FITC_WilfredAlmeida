//71 SE COMP A Wilfred Almeida

import java.io.*;

public class Question_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.readLine());
            int sum = 0;
            while (n-- > 0) {
                sum += Integer.parseInt(sc.readLine());
            }

            if (sum >= 100)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}
