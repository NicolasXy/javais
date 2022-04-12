import java.util.Scanner;

public class Main9 {
    public static void main (String[] args){
        Scanner meuTexto = new Scanner(System.in);
        System.out.println("Entre com o nome do usuário: ");
        String nome = meuTexto.nextLine();
        System.out.println("Entre com a senha: ");
        String senha = meuTexto.nextLine();
        System.out.println("Usuario é" + nome);
        System.out.println("A senha é" + senha);
        meuTexto.close();
    }
}