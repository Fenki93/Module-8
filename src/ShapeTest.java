public class ShapeTest {
    public static void main(String[] args) {

        ShapeNamePrinter printer = new ShapeNamePrinter();
        printer.printShapeName(new Circle());
        printer.printShapeName(new Triangle());
        printer.printShapeName(new Rectangle());
        printer.printShapeName(new Ellipse());
        printer.printShapeName(new Square());
    }
}