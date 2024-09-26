import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite seu nome");
            String nome = scan.next();
            scan.nextLine();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scan.next();
            scan.nextLine();

            System.out.println("Digite sua idade");
            int idade = scan.nextInt();

            System.out.println("Digite sua altura");
            double altura = scan.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + "");
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");

        }
        catch (InputMismatchException e){
            System.out.println("O campo idade e altura  precisam ser numéricos");
        }
    }
}
