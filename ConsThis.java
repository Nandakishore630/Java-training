public class ConsThis {
    int laptop;

    ConsThis(int value){
        System.out.println("int parameter");
    }

    ConsThis(double nums){
        this((int)nums);
        System.out.println("Double Parameter"   );
    }

    public static void main(String[] args) {
        ConsThis ob = new ConsThis(10.5);
        System.out.println(ob.laptop);
    }
}
