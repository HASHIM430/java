class A {
    double length, width;

    double Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7.9, 8.5);
        Rectangle r2 = new Rectangle(2.3, 5.2);

        System.out.println("Rectangle 1: Area = " + r1.area() + ", Perimeter = " + r1.perimeter());
        System.out.println("Rectangle 2: Area = " + r2.area() + ", Perimeter = " + r2.perimeter());
    }
}
