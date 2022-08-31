import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input start number:");
        int StartNum = Integer.parseInt(scanner.nextLine());
        System.out.println("Input stop number:");
        int StopNum = Integer.parseInt(scanner.nextLine());
        int sum = 0, i = StartNum;
        do {
            sum += i;
            i ++;
        } while (i <= StopNum);
        System.out.printf("Sum from %d to %d is %d\n",StartNum,StopNum,sum);
    }
}
