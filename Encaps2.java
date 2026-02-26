public class Encaps2 {
    int amount = 100;
    String name = "Sadik chotu";
    Encaps2(){
        System.out.println("Encaps2");
    }
    void display(){
        System.out.println(amount);
        System.out.println(name);
    }
}
class Ruhan extends Encaps2{
    Ruhan(){
        System.out.println("Ruhan");
    }
}
class Basic{
    public static void main(String[] args) {
        Ruhan ob = new Ruhan();
        ob.display();
        System.out.println(ob.amount);
        System.out.println(ob.name);
    }
}