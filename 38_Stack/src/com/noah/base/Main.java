import java.util.*;

public class Main {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println(hex);
        }
    }

    static String toHex(int n) {
        Deque<String> tmp = new LinkedList();
        int quotient  = n / 16;
        int remainder = n % 16;
        StringBuilder result = new StringBuilder(1024);
        while (quotient != 0 || remainder !=0) {
            String r = switch (remainder) {
                case 10 -> "A";
                case 11 -> "B";
                case 12 -> "C";
                case 13 -> "D";
                case 14 -> "E";
                case 15 -> "F";
                default -> String.valueOf(remainder);
            };
            remainder = quotient % 16;
            quotient  = quotient / 16;
            System.out.println(String.valueOf(remainder)+' '+r);
            tmp.push(r);
        };
        System.out.println(tmp.size());
        for (int i = 0; i < tmp.size();) {
            System.out.println(i);
            result.append(tmp.pop());
        }
        return result.toString();
    }
}