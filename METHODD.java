public class METHODD {
    void display(METHODD t){
        System.out.println("Hello JARVIS");
        System.out.println(t);
    }
    METHODD print(METHODD t){
        System.out.println("Hello JARVIS");
        return new METHODD();
    }
    public static void main(String[] args) {
        METHODD ob = new METHODD();
        METHODD ob1 = ob.print(ob);
        ob.display(ob1);
        System.out.println(ob1);
        METHODD ob2 = ob1.print(ob1);
        ob2.display(ob2);
    }
}
