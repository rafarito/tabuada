import java.util.Scanner;

public class App {
    public static int leValor(String str) 
    {
        if(str.matches("[a-zA-Z]+")){
            System.out.println("\nvocê não digitou um valor valido");
            return 0;
        }else{
            int numero = Integer.parseInt(str);
            return numero;
        }
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("digite un numero:");
        int num = leValor(teclado.nextLine());
        System.out.print("\ndigite uma operação:\n   digite 1 para soma\n   digite 2 para subtração\n   digite 3 para multiplicação\n   digite 4 para divisão\n");
        int op = leValor(teclado.nextLine());
        for(int i = 1;i <= 10;i++){
            if(op == 1){
                System.out.printf("%d + %d = %d\n",num, i, num+i);
            }else{
                if(op == 2){
                    System.out.printf("%d - %d = %d\n",num, i, num-i);
                }else{
                    if(op == 3){
                        System.out.printf("%d * %d = %d\n",num, i, num*i);
                    }else{
                        if(op == 4){
                            System.out.printf("%d / %d = %d\n",num, i, num/i);
                        }else{
                            System.out.println("você não digitou um valor valido");
                            break;
                        }
                    }
                }
            }
        }
    }
}

