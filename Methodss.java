public class Methodss {
    static int price = 10;
    int gst = 2;

    void display() {
        System.out.println(price + gst);
    }

    public static void main(String[] args) {
        Methodss ob = new Methodss();
        ob.display();
    }
}
