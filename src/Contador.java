import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int primeiroNumero = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        int segundoNumero = sc.nextInt();

        try{

            contar(primeiroNumero,segundoNumero);

        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
