import java.util.Scanner;

public class Main10 {
    public static void main (String[] args){
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Programa lados de um retâmgulo ");
        System.out.println("Entre com o valor do primeiro lado: ");
        Double lado1 = meuObj.nextDouble();
        System.out.println("Entre com o segundo valor do lado: ");
        Double lado2 = meuObj.nextDouble();
        Double areaRetangular = lado1 * lado2;
        System.out.println("A área do retângulo é: " + areaRetangular);
        
        // área triângulo

        System.out.println("******");
        System.out.println("Programa área de um triângulo");
        System.out.println("Entre com o valor base: ");
        Double base1 = meuObj.nextDouble();
        System.out.println("Entre com o valor da altura: ");
        Double altura1 = meuObj.nextDouble();
        Double areaTriangulo = (base1 * altura1) / 2;
        System.out.println("Área do triangulo é: " + areaTriangulo);

        // temperatura
        System.out.println("******");
        System.out.println("Programa em Temperatura");
        System.out.println("Entre com a temperatura em Celsius");
        Double celsius = meuObj.nextDouble();
        Double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        meuObj.close();
    }
}