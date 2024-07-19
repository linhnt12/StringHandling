import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + ' ';
        int idx = 0;
        int max = 0;
        int cnt = 0;
        int i = 0;
        while (i < s.length()){
            if (s.charAt(i) != ' ') {
                cnt++;
            } else {
                if (cnt > max) {
                    max = cnt;
                    idx = i - cnt + 1;
                }
                cnt = 0;
            }
            i++;
        }
        System.out.println("Từ dài nhất xuất hiện ở vị trí: " + idx);
    }
}
