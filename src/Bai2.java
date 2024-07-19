import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                res += Character.toUpperCase(s.charAt(i));
            } else res += Character.toLowerCase(s.charAt(i));
        }
        System.out.println(res);
    }
}
