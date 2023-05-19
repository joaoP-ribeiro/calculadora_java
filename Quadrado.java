import java.util.Scanner;

public class Quadrado {
    Scanner sc = new Scanner(System.in);
    double lado, resultado;

   Quadrado(){

    }

    public Quadrado(double lado, double resultado) {
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
                double resultado = getLado() * getLado();
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
                double resultado = getLado() * 4;
                setResultado(resultado);
                break;
            }
        } while(true);
        System.out.printf("O perimetro é: %f \n", getResultado());
    }

}
