import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Stack stack = new Stack();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < Num; i++) {

            String str = bf.readLine();
            int count = 0;
            for(int j = 0; j < str.length(); j++) {
                char a = str.charAt(j);
                if(a == '(') {
                    count++;
                }
                else if(a == ')') {
                    count--;
                    if(count < 0) {
                        bw.write("NO" + "\n");
                        count = 500;
                    }
                }



            }

            if(count == 0) {
                bw.write("YES" + "\n");

            }
            else if(count < 400) {
                bw.write("NO" + "\n");
            }

        }
        bw.flush();
        bw.close();
    }

}
