public class Encaps {
    private String name = "Hello";
    private int amount = 70_000;
    public void set(String name,int amount){
        this.name = name;
        this.amount = amount;
    }
    public void get(){
        System.out.println(name);
        System.out.println(amount);
    }
    public String getName(){
        return name;
    }
}
class Basic extends Encaps{
    public static void main(String[] args) {
    Encaps ob = new Encaps();
    ob.set("Sadik chotu", 70_000);
    ob.get();
    System.out.println(ob.getName());
    }
} 