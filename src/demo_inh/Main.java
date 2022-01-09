package demo_inh;

class base{
    int x;
    public void printme(){
        System.out.println("I am a { base } constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}

class drived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class Main {
    public static void main(String[] args) {

        base obj = new base();
        obj.setX(90);
        System.out.println(obj.getX());

        drived ab = new drived();
        ab.setX(80);
        System.out.println("\n value of x via drived "+ab.getX());
//        ab.setY(80);
//        System.out.println("\n value of y via drived "+ obj.getY());

    }
}
