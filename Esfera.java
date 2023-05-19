import java.util.Scanner;

public class Esfera {
    Scanner sc = new Scanner(System.in);

    double raio, resultado;

    public Esfera() {
    }

    public Esfera(double raio, double resultado) {
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

    void volue(){
        do {
            System.out.println("Digite o valor do Raio: ");
            double raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {

                setRaio(raio);
                double resultado = (4 * 3.14 * (getRaio() * getRaio()* getRaio()))/3;
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("O volume é: %f \n", getResultado());
    }

    void superfice(){
        do {
            System.out.println("Digite o valor do Raio: ");
            double raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {
                setRaio(raio);
                double resultado = 4 * 3.14 * (getRaio() * getRaio());
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("A superfície é: %f \n", getResultado());
    }
}
