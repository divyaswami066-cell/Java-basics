
class Rectangle {
    private double length;
    private double width;

    public void setLength(double l) {
        if (l > 0) {
            length = l;
        }
    }

    public void setWidth(double w) {
        if (w > 0) {
            width = w;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setWidth(5);

        System.out.println("Length: " + r.getLength());
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Perimeter: " + r.calculatePerimeter());
    }
}
