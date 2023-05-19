import java.util.Scanner;

public class Piramede {

    Scanner sc = new Scanner(System.in);

    double lado, altura, resultado;

    public Piramede() {
    }

    public Piramede(double lado, double altura, double resultado) {
        this.lado = lado;
        this.altura = altura;
        this.resultado = resultado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    void volume(){
        do{
            System.out.println("Digite o valor do lado da base: ");
            double lado_b = sc.nextDouble();
            if (lado_b <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setLado(lado_b);
            }
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setAltura(altura);
                double resultado =  ((getLado() * getLado()) * getAltura()) / 3 ;
                setResultado(resultado);
                break;
            }

        }while(true);
        System.out.printf("O volume é: %f \n", getResultado());
    }

    void superficie(){
        do{
            System.out.println("Digite o valor do lado da base: ");
            double lado_b = sc.nextDouble();
            if (lado_b <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setLado(lado_b);
                double resultado =  getLado() * getLado();
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("A superfície é: %f \n", getResultado());
    }
}
