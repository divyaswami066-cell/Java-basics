
class Calculator4 {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }
}

class Calculater4Main {
    public static void main(String[] args) {
        Calculator4 c = new Calculator4();

        c.add(5, 10);
        c.add(5, 10, 15);
    }
}
