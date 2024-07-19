import java.util.Scanner;

public class Bai5 {
    public static String chuanHoa(String s) {
        String res = "";
        res += Character.toUpperCase(s.charAt(0));
        for (int i = 1; i < s.length(); i++) res += Character.toLowerCase(s.charAt(i));
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] words = s.split("\\s+");
        String res = chuanHoa(words[words.length-1]) + " ";
        res += chuanHoa(words[0]) + " ";
        for (int i = 1; i < words.length-1; i++) {
            res += chuanHoa(words[i]) + " ";
        }
        System.out.println(res);
    }
}
