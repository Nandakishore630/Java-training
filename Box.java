public class Box {
    int l,w,h;
    Box(){
        l=w=h=1;
    }
    Box(int l, int w, int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    void display(){
        System.out.println("Length: " + l + ", Width: " + w + ", Height: " + h);
    }
}
class Basic{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.display();
        Box b2 = new Box(10, 20, 30);
        b2.display();
    }
}