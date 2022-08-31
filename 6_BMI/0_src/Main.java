import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your height in m:");
        String height = scanner.nextLine();
        System.out.println("enter your weight in kg:");
        String weight = scanner.nextLine();
        double h = Float.parseFloat(height);
        int w = Integer.parseInt(weight);
        double bmi = (double)w / (h*h);
        if(bmi < 18.5){
            System.out.printf("%.2f too thin", bmi);
        }else if(bmi < 25){
            System.out.printf("%.2f thin", bmi);
        }else if(bmi < 28){
            System.out.printf("%.2f normal", bmi);
        }else if(bmi < 32){
            System.out.printf("%.2f fat", bmi);
        }else{
            System.out.printf("%.2f too fat", bmi);
        }
    }
}
    