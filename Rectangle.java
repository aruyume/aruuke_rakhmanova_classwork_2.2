public class Rectangle extends Figure {

    private int a, b;

    public Rectangle(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public Rectangle(String name) {
        super(name);
    }

    public int calculatePerimeter() {
        return (int) (a * b);
    }

    @Override
    public void draw() {
        System.out.println("▭");
    }
}
