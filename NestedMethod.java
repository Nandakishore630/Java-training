public class NestedMethod {
    class test{
        void display(){
            System.out.println("Hello JARVIS");
        }
    }
    public static void main(String[] args) {
        NestedMethod ob = new NestedMethod();
        test ob1 = ob.new test();
        ob1.display();
    }
}
