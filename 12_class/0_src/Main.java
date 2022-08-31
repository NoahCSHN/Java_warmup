public class Main {
    public static void main(String[] args) {
        City CS = new City();
        City CD = new City();
        City XT = new City();
        CS.name = "ChangSha";
        CD.name = "ChangDe";
        XT.name = "XiangTan";
        CS.latitude = 112.92;
        CS.longitude = 28.23;
        CD.latitude = 111.68;
        CD.longitude = 29.05;
        XT.latitude = 112.93;
        XT.longitude = 27.83;
        System.out.println(CS.name);
        System.out.println("location: " + CS.latitude + ", " + CS.longitude);
        System.out.println(CD.name);
        System.out.println("location: " + CD.latitude + ", " + CD.longitude);
        System.out.println(XT.name);
        System.out.println("location: " + XT.latitude + ", " + XT.longitude);
    }
}

/**
 * City
 */ 
class City {
    public String name;
    public double latitude;
    public double longitude;
    
}