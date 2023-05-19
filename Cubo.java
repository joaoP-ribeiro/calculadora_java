import java.util.Scanner;

public class Cubo {

    Scanner sc = new Scanner(System.in);

    double aresta, resultado;

    public Cubo(){}


    public Cubo(double aresta, double resultado) {
        this.aresta = aresta;
        this.resultado = resultado;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    void volume(){
        do {
            System.out.println("Digite o valor da aresta: ");
            double aresta = sc.nextDouble();
            if (aresta <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setAresta(aresta);
                double resultado = 6 * (getAresta() * getAresta());
                setResultado(resultado);
                break;
            }
        } while(true);
        System.out.printf("O volume é: %f \n", getResultado());
    }

    void superficie(){
        do {
            System.out.println("Digite o valor da aresta: ");
            double aresta = sc.nextDouble();
            if (aresta <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else {
                setAresta(aresta);
                double resultado = getAresta() * 12;
                setResultado(resultado);
                break;
            }
        } while(true);
        System.out.printf("A superfície é: %f \n", getResultado());
    }

}
