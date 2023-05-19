import java.util.Scanner;

public class Retangulo {
    Scanner sc = new Scanner(System.in);

    double base, altura, resultado;

    Retangulo(){

    }

    public Retangulo(double base, double altura, double resultado) {
        this.base = base;
        this.altura = altura;
        this.resultado = resultado;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
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

    double area(){
        do {
            System.out.println("Digite o valor da base: ");
            double base = sc.nextDouble();
            if (base <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setBase(base);
            }
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setAltura(altura);
                double resultado = getBase() * getAltura();
                setResultado(resultado);
                break;
            }
        } while(true);
        System.out.printf("A área é: %f \n", getResultado());
        return 0;
    }

    double perimetro() {

        do {
            System.out.println("Digite o valor da base: ");
            double base = sc.nextDouble();
            if (base <= 0) {
                System.out.println("Digite um valor positivo");
            } else {
                setBase(base);
            }
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("Digite um valor positivo");
            } else {
                setAltura(altura);
                double resultado = (getAltura() * getAltura()) + (getBase() * getBase());
                setResultado(resultado);
                break;
            }
        } while (true);
        System.out.printf("O perimetro é: %f \n", getResultado());
        return 0;
    }
}
