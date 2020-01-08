public class Example {
    public static void main(String[] args){
        Car carr = new ToyotaHilux();
        System.out.println(carr.getInfo()+". Price: "+carr.getPrice()+" P");

        carr = new Comfort(carr);
        System.out.println(carr.getInfo()+". Price: "+carr.getPrice()+" P");

        carr = new Prestige(carr);
        System.out.println(carr.getInfo()+". Price: "+carr.getPrice()+" P");

    }
}
