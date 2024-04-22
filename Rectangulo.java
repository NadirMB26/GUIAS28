public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public static void main(String[] args) {
       Rectangulo suelo = new Rectangulo(30, 50);
       suelo.setBase(30);
       suelo.setAltura(50);
       double area = suelo.getArea();
       double peri = suelo.getPerimetro();
    }
    public void setBase(double nuevaBase) {
        this.base = nuevaBase;
    }
    
    public void setAltura(double nuevaAltura) {
        this.altura = nuevaAltura;
    }
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getArea() {
        return base * altura;
    }
    
    public double getPerimetro() {
        return 2 * (base + altura);
    }
}
