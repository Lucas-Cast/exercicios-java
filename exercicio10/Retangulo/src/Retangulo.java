public class Retangulo {
    public  double altura;
    public double lado;

    public Retangulo(double altura, double lado) {
        this.altura = altura;
        this.lado = lado;
    }
    public void perimetro() {
        System.out.println(altura*2 + lado*2);
    }
    public void area() {
        System.out.println(altura*lado);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
