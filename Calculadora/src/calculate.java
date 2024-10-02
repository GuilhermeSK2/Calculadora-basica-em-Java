import java.util.Scanner;//Importação da classe Scanner

public class calculate {
    public static void main(String[] args) {
        //Objeto Scanner criado para poder receber os inputs do usuário.
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos realizar um cálculo!");
        System.out.println("Digite um número:");
        int x = input.nextInt();
        System.out.println("Digite um segundo número:");
        int y = input.nextInt();

        //Esta linha consome a linha adicional pendente deixada para trás pelo nextInt, fazendo com que a operação seja lida corretamente.
        input.nextLine();

        System.out.println("Agora escolha a operação a ser realizada:");
        System.out.println("Som = Soma");
        System.out.println("Sub = Subtração");
        System.out.println("Mult = Multiplicação");
        System.out.println("Div = Divisão");
        String operacao = input.nextLine();

        if(operacao.equals("Som")){
            sum(x, y);
        } else if (operacao.equals("Sub")) {
            minus(x, y);
        } else if (operacao.equals("Mult")) {
            multi(x, y);
        } else if (operacao.equals("Div")) {
            div(x, y);
        } else {
            System.out.println("Operação inválida");
        }
    }


    static void sum(int x, int y){
        System.out.println("O resultado da soma entre " + x + " e " + y + " é: " + (x + y));
    }

    static void minus(int x, int y){
        System.out.println("O resultado da subtração entre " + x + " e " + y + " é: " + (x - y));
    }

    static void multi(int x, int y){
        System.out.println("O resultado da multiplicação entre " + x + " e " + y + " é: " + (x * y));
    }

    static void div(int x, int y){
        System.out.println("O resultado da divisão entre " + x + " e " + y + " é: " + (x / y));
    }
}
