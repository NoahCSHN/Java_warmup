public class Main {
    public static void main(String[] args) {
        double total = 0.0;
        Income[] ns = new Income[] {
            new Salary(20200),
            new Royalties(50000),
        };
        for (Income n : ns){
            total += n.GetTax();
        }
        System.out.println(total);
    }    
}

/**
 * Income
 */
interface Income {
    double GetTax();    
}

class Salary implements Income{
    double salary;

    public Salary(double income){
        this.salary = income;
    }

    public double GetTax(){
        if(salary < 5000){
            return 0;
        }else{
            return ((salary - 5000) * 0.1);
        }
    }
}

class Royalties implements Income{
    double royalties;

    public Royalties(double income){
        this.royalties = income;
    }

    public double GetTax(){
        return royalties * 0.14;
    }
}