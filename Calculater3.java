class Calculater3{
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }
}
class Maths extends Calculater3{
    @Override
    void add(int a, int b) {
        System.out.println("Sum of three integers: " + (a + b));
    }
}
class Calculater3Main {
    public static void main(String[] args) {
        Calculater3 calc = new Maths();
        calc.add(5, 10);
    }
}