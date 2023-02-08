import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);


        System.out.print("digite un numero:");
        int num = teclado.nextInt();
        if(num.matches("[a-zA-Z]+")){ //trabalhe nisso
            System.out.print("true");
        }else{
            System.out.print("false");
        }
        System.out.print("\ndigite uma operação:\n   digite 1 para soma\n   digite 2 para subtração\n   digite 3 para multiplicação\n   digite 4 para divisão\n");
        int op = teclado.nextInt();
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
