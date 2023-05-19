import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    Triangulo tri = new Triangulo();
    Circulo cir = new Circulo();
    Quadrado qua = new Quadrado();
    Retangulo ret = new Retangulo();
    Hexagono hex = new Hexagono();


    void menu_planas(){
        while(true){
            try {
                System.out.println("\nTriângulo [1]");
                System.out.println("Quadrado  [2]");
                System.out.println("Retangulo [3]");
                System.out.println("Circulo   [4]");
                System.out.println("Hexagono  [5]");
                int escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("\nÁrea      [1]");
                        System.out.println("Perimetro [2]");
                        System.out.println("Digite outo número para sair");
                        int escolha2 = sc.nextInt();
                        switch (escolha2) {
                            case 1:
                                tri.area();
                                break;
                            case 2:
                                tri.perimetro();
                                break;
                            default:
                                break;
                        }
                    case 2:
                        System.out.println("\nÁrea      [1]");
                        System.out.println("Perimetro [2]");
                        System.out.println("Digite outo número para sair");
                        escolha2 = sc.nextInt();
                        switch (escolha2) {
                            case 1:
                                qua.area();
                                break;
                            case 2:
                                qua.perimetro();
                                break;
                            default:
                                break;

                        }
                }

            }catch(InputMismatchException e){
                System.out.println("Digite um valor válido\n");
            }
            sc.nextLine();
        }
    }
}

