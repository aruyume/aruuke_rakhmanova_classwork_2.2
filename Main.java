public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг ", 12);
        Triangle triangle = new Triangle("Треугольник ", 3, 3, 3);
        Square square = new Square("Квадрат ", 3);
        Rectangle rectangle = new Rectangle("Прямоугольник ", 5,5);

        Cat cat = new Cat("Rixy");
        Dog dog = new Dog("Roxy");

        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat,};

        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + "Периметр => " + ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName());
            }
        }
    }
}