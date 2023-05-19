import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        while(true) {
            try {
                System.out.println("______CALCULADORA_GEOMÉTRICA______");
                System.out.println("Figuras Planas    [1]");
                System.out.println("Figuras Espaciais [2]");
                System.out.print("Digite sua escolha: ");
                int escolha = sc.nextInt();
                if(escolha == 1){
                    menu.menu_planas();
                }
                else if(escolha == 2){

                }
                else{
                    System.out.println("Digite uma opção válida!\n");
                }
            }catch(InputMismatchException e){
                System.out.println("\n Digite um valor válido!\n");

            }
            sc.nextLine();
        }



    }
}
