public class This2 {
    String make;
    String model;
    int year;

    This2(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display(){
        System.out.println("Year: "+year+" Make: "+make+" Model: "+model);
    }
}

class Basic {
    public static void main(String[] args) {
        This2 ob = new This2("Honda", "Civic", 2020);
        ob.display();
        This2 ob1 = new This2("Ford", "Mustang", 2021);
        ob1.display();
        This2 ob2 = new This2("Chevrolet", "Corvette", 2022);
        ob2.display();
    }
}