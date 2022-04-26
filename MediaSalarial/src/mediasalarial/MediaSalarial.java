package mediasalarial;
import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double somaSalario = 0;
        
        System.out.println("Digite o número de funcionários da empresa:");
        int numFuncionarios = teclado.nextInt();
        
        for(int i=0; i<numFuncionarios; i++){
            System.out.println("Digite o salário, em R$, do funcionário número "+i+1);
            double salario = teclado.nextDouble();
            somaSalario = somaSalario + salario;
        }
        double mediaSalario = somaSalario/numFuncionarios;
        System.out.println("A média salarial da empresa é de R$"+mediaSalario+". ");
    }
    
}
