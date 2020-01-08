abstract class Car{
    String name = "Noname Car";
    public String getInfo(){
        return name;
    }
    public abstract int getPrice();
}

abstract class Decorator extends Car{
    public abstract String getInfo();
}

class  ToyotaHilux extends Car{
    public ToyotaHilux(){
        name = "Toyota Hilux";
    }

    public int getPrice(){
        return 2_306_000;
    }
}

class Comfort extends Decorator{
    Car car;
    public Comfort(Car car){
        this.car = car;
    }

    public String getInfo(){
        return car.getInfo() + " Comfort";
    }

    public int getPrice(){
        return car.getPrice() + 163_000;
    }
}

class Prestige extends Decorator{
    Car car;
    public Prestige(Car car){
        this.car = car;
    }

    public String getInfo(){
        return car.getInfo() + " (Двигатель 2.8л)";
    }

    public int getPrice(){
        return car.getPrice() + 330_000;
    }
}

