import java.util.Scanner;

public class App {
    public static int leValor(String str) 
    {
        if(str.matches("[a-zA-Z]+")){
            return 2147483647;
        }else{
            int numero = Integer.parseInt(str);
            return numero;
        }
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num;
        do{
        System.out.print("digite un numero:");
        num = leValor(teclado.nextLine());
        }while(num == 2147483647);
        System.out.print("\ndigite uma operação:\n   digite 1 para soma\n   digite 2 para subtração\n   digite 3 para multiplicação\n   digite 4 para divisão\n");
        int op = leValor(teclado.nextLine());
        switch (op) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d + %d = %d\n",num, i, num+i);
                }
                break;
            case 2:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d - %d = %d\n",num, i, num-i);
                }
                break;
            case 3:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d * %d = %d\n",num, i, num*i);
                }
                break;
            case 4:
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d / %d = %d\n",num, i, num/i);
                }
                break;
            default:
                System.out.println("você não digitou um valor válido");
                break;
        }
    }
}
