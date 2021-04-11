//71 SE COMP A Wilfred Almeida

import java.io.*;

public class Question_1 {
    public static void main(String[] args) throws Exception {
        int t = 0;

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(sc.readLine());

        while (t-- > 0) {
            String s = sc.readLine();
            int count = 0;

            for (char a : s.toCharArray()) {
                if (String.valueOf(a).equals("5"))
                    count++;
            }
            System.out.println(count);
            count = 0;
        }

        sc.close();
    }
}