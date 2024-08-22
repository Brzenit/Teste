import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Utilitario utilitario = new Utilitario();
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();

        utilitario.mensage(nome);

        Integer numero1 = scan.nextInt();
        Integer numero2 = scan.nextInt();

        utilitario.soma(numero1 , numero2);
    }

}
