import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First people give:");
        String FirstFlag = scanner.nextLine();
        System.out.println("Second people give:");
        String SecondFlag = scanner.nextLine();
        switch (FirstFlag){
            case "stone" -> {
                switch (SecondFlag) {
                    case "stone" -> System.out.println("draw");
                    case "Scissors" -> System.out.println("First people wins");
                    case "cloth" -> System.out.println("Second people wins");
                }
            }
            case "Scissors" -> {
                switch (SecondFlag) {
                    case "stone" -> System.out.println("Second people wins");
                    case "Scissors" -> System.out.println("draw");
                    case "cloth" -> System.out.println("First people wins");
                }
            }
            case "cloth" -> {
                switch (SecondFlag) {
                    case "Scissors" -> System.out.println("Second people wins");
                    case "cloth" -> System.out.println("draw");
                    case "stone" -> System.out.println("First people wins");
                }
            }
        }
    }
}
