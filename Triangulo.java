import java.util.Scanner;

public class Triangulo {
    Scanner sc = new Scanner(System.in);

    double lado, resultado;

    Triangulo(){

    }

    public Triangulo(double lado, double resultado) {
        this.lado = lado;
        this.resultado = resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double base) {
        this.lado = base;
    }


    void area(){
        do {
            System.out.println("Digite o valor do lado: ");
            double lado = sc.nextDouble();
            if (lado <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setLado(lado);
                double resultado = ((getLado() * getLado()) * 1.7) / 4;
                setResultado(resultado);
                break;
            }
        } while(true);
        System.out.printf("A área é: %f \n", getResultado());

    }

    void perimetro(){
        do {
            System.out.println("Digite o valor do lado: ");
            double lado = sc.nextDouble();
            if (lado <= 0) {
                System.out.println("Digite um valor positivo");
            }

            else {
                setLado(lado);
                double resultado = getLado() * 3;
                setResultado(resultado);
                break;
            }

        } while(true);

        System.out.printf("O perimetro é \n: %f", getResultado());
    }
}
