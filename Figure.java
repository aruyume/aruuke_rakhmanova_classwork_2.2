public class Figure implements Drawable{
    private String name;

    public String getName() {
        return name;
    }

    public Figure(String name) {
        this.name = name;
    }
    public int calculatePerimeter() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
