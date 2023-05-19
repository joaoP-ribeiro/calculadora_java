import java.util.Scanner;

public class Cone {
    Scanner sc = new Scanner(System.in);

    double raio, altura, resultado;

    public Cone() {
    }

    public Cone(double raio, double resultado, double altura) {
        this.raio = raio;
        this.resultado = resultado;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
            }
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {
                setRaio(altura);
                double resultado = (3.14 * ((getRaio() * getRaio()) * getAltura()))/3;
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
                double resultado = 3.14 * (getRaio() * getRaio());
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("A superfície é: %f \n", getResultado());
    }
}
