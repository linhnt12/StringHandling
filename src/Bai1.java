public class Bai1 {
    public static boolean check (int n) {
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số: ");
        for (int i=100000; i<=999999; i++) {
            if (check(i)) System.out.println(i);
        }
    }
}