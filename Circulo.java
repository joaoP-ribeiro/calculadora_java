import java.util.Scanner;

public class Circulo {
    Scanner sc = new Scanner(System.in);

    double raio, resultado;


    Circulo(){

    }


    public Circulo(double raio, double resultado) {
        this.raio = raio;
        this.resultado = resultado;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    double area(){
        do {
            System.out.println("Digite o valor do Raio: ");
            double raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {
                setRaio(raio);
                double resultado = (getRaio() * getRaio()) * 3.14;
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("A área é: %f \n", getResultado());
        return 0;
    }

    double perimetro(){
        do {
            System.out.println("Digite o valor do Raio: ");
            double raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {

                setRaio(raio);
                double resultado = 2 * 3.14 * getRaio();
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("O perimetro é: %f \n", getResultado());
        return 0;
    }
}
