import java.util.Scanner;

public class Hexagono {

    Scanner sc = new Scanner(System.in);
    double lado, resultado;

    Hexagono(){

    }

    public Hexagono(double lado, double resultado) {
        this.lado = lado;
        this.resultado = resultado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
                setLado(lado);
                double areaTriangulo = ((getLado() * getLado()) * 1.7) / 4;
                double resultado = 6 * areaTriangulo;
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("A área é: %f \n", getResultado());
        return 0;
    }

    double perimetro(double lado){
        do {
            System.out.println("Digite o valor do Raio: ");
            double raio = sc.nextDouble();
            if (raio <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {
                setLado(lado);
                double resultado = getLado() * 6;
                setResultado(resultado);
                break;
            }
        }while(true);
        System.out.printf("O perimetro é: %f \n", getResultado());
        return 0;
    }
}


