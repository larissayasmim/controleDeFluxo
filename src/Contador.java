import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        
      try {  
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       
        System.out.println("Por favor, digite o primeiro valor: ");
        int parametroUm = scanner.nextInt();

        System.out.println("Por favor, digite o segundo valor: ");
        int parametroDois = scanner.nextInt();

        contar(parametroUm, parametroDois);
    }
    catch (ParametrosInvalidosException e) {
        System.out.println(e.getMessage());
    }
    }

    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException
     {
        if ( parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
        else {

            int somaParametros = parametroDois - parametroUm;
            for (int contador = 1; contador <= somaParametros; contador++){
                System.out.println("Imprimindo número " + contador );
            }
        }   
    }
}
