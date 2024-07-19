import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        String res = "";
        for (String x : words) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase() + " ";
        }
        System.out.println(res);
    }
}
