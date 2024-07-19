import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] arr = (s1.replaceAll(s2, "")).trim().split("\\s+");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
