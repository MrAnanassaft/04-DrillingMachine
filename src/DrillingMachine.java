import java.util.HashMap;

public class DrillingMachine {
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.watt = (int)(Math.random() * 1201) + 800;
        this.name = "Heheheha";
        this.age = (int)(Math.random() * 11);
        this.price = (Math.random() * 450) + 50;
        this.broken = false;
    }

    public int getWatt() {
        return watt;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBroken() {
        return broken;
    }

    public void becomeBroken(){
        broken = true;
    }
    public void repair(){
        if(broken == true){
            broken = false;
            price = price / 2;
        }
    }

    public void aging(){
        age = age + 1;
        if(age >= 10){
            broken = true;
        }
    }

    public void reactOnHighDemand(){
        price *= 1.25;
    }

    public void setBroken(boolean isBroken){
        broken = isBroken;
    }

    public void increasePrice(double amount){
        price = price + amount;
    }

    public void changePower(int watt){
        if(watt > 0){
            this.watt += watt;
            if(watt > 100){
                price *= 1.05;
            }
        }else if(watt !=0){
            this.watt += watt;
            price *= 0.9;
        }
    }

    public boolean isInexpensive(){
        if(getWatt() > 500 && getPrice() < 80){
            return true;
        }else{
            return false;
        }
    }

    public double getPricePerWatt(){
        double pricePerWatt = this.price / this.watt;
        return pricePerWatt;
    }
}
