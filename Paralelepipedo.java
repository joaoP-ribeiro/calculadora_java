import java.util.Scanner;

public class Paralelepipedo {

    Scanner sc = new Scanner(System.in);
    double comprimento, largura, altura, resposta;

    public Paralelepipedo() {
    }

    public Paralelepipedo(double comprimento, double largura, double altura, double reposta) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.resposta = reposta;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getResposta() {
        return resposta;
    }

    public void setResposta(double reposta) {
        this.resposta = reposta;
    }

    void volume(){
        do {
            System.out.println("Digite o valor do comprimento: ");
            double comprimento = sc.nextDouble();
            if (comprimento <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setComprimento(comprimento);
            }
            System.out.println("Digite o valor da largura: ");
            double largura = sc.nextDouble();
            if (largura <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setLargura(largura);
            }
            System.out.println("Digite o valor da altura: ");
            double altura = sc.nextDouble();
            if (altura <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setAltura(altura);
                double resultado = getComprimento() * getLargura() * getAltura();
                setResposta(resultado);
                break;
            }
        } while(true);
        System.out.printf("O volume é: %f \n", getResposta());
    }


    void superficie(){
        do{
            System.out.println("Digite o valor do comprimento: ");
            double comprimento = sc.nextDouble();
            if (comprimento <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setComprimento(comprimento);
            }
            System.out.println("Digite o valor da largura: ");
            double largura = sc.nextDouble();
            if (largura <= 0) {
                System.out.println("Digite um valor positivo");
            }
            else{
                setLargura(largura);
                double resultado = getComprimento() * getLargura();
                setResposta(resultado);
                break;
            }

        }while(true);
        System.out.printf("A superfície é: %f \n", getResposta());
    }
}
