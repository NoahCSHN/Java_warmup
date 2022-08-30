import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input last time test scores:");
        String LastScore = scanner.nextLine();
        System.out.println("Input this time test scores:");
        String CurScore = scanner.nextLine();
        int diff = Integer.parseInt(CurScore) - Integer.parseInt(LastScore);
        double Percentage = (double)diff / Integer.parseInt(LastScore);
        if(diff > 0){
            System.out.printf("This time Score increase %.2f%%\n", Percentage*100);
        }else{
            System.out.printf("This time Score decrease %.2f%%\n", -Percentage*100);
        }
    }
}
