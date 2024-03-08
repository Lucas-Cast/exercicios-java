//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5,5);
        Retangulo r2 = new Retangulo(5,10);
        Retangulo r3 = new Retangulo(4,7);

        r1.perimetro();
        r1.area();
        r2.perimetro();
        r2.area();
        r3.perimetro();
        r3.area();
    }
}