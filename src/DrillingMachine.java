public class DrillingMachine {
    private int watt;
    private String name;
    private int age;
    private double price;
    private boolean broken;

    public DrillingMachine() {
        this.watt = (int)(Math.random() * 1200) + 800;
        this.name = "Heheheha";
        this.age = (int)(Math.random() * 10);
        this.price = (int)(Math.random() * 450) + 50;
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
        broken = false;
        price = price / 2;
    }

    public void aging(){
        age = age + 1;
        if(age >= 10){
            broken = true;
        }
    }

    public void reactOnHighDemand(){
        price = price + (price * 0.25);
    }
}
