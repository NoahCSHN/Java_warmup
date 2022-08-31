public class Main {
    public static void main(String[] args) {
        double pi = 0.0;
        for(long i=1; i<(65536*8192); i=i+2){
            if((i+1)%4 != 0){
                pi += (double)1/i;
            }else{
                pi -= (double)1/i;
            }
        }    
        System.out.println(4*pi);        
    }
}
