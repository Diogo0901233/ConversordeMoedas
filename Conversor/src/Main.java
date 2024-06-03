import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner leitura =new Scanner(System.in);
        boolean sair=true;
        Moedas valorDaMoeda=new Moedas();
while (sair) {
    System.out.println("Seja bem vindo/a ao Conversor de Moedas");
    System.out.println("1-Real Brasileiro para Dolar");
    System.out.println("2-Dolar para Peso Colombiano");
    System.out.println("3-Peso colombiano para Dolar");
    System.out.println("4-Dolar para peso argentino");
    System.out.println("5-Peso argentino para dolar");
    System.out.println("6-Dolar pra real brasileiro");
    System.out.println("7-Sair");
    String digitar=leitura.nextLine();


    switch (digitar) {
        case "1":
            valorDaMoeda.moeda1="BRL";
            valorDaMoeda.moeda2="USD";
            System.out.println("1-Real Brasileiro para Dolar, Digite um valor para converter");
            valorDaMoeda.valorDigitado=leitura.nextLine();
            valorDaMoeda.consulta();
            System.out.println(valorDaMoeda.toString());
            break;
        case "2":
            valorDaMoeda.moeda1="USD";
            valorDaMoeda.moeda2="COP";
            System.out.println("2-Dolar para Peso Colombiano, Digite um valor para converter");
            valorDaMoeda.valorDigitado=leitura.nextLine();
            valorDaMoeda.consulta();
            System.out.println(valorDaMoeda.toString());
            break;
        case "3":
            valorDaMoeda.moeda1="COP";
            valorDaMoeda.moeda2="USD";
            System.out.println("3-Peso colombiano para Dolar, Digite um valor para converter");
            valorDaMoeda.valorDigitado=leitura.nextLine();
            valorDaMoeda.consulta();
            System.out.println(valorDaMoeda.toString());
            break;
        case "4":
            valorDaMoeda.moeda1="USD";
            valorDaMoeda.moeda2="ARS";
            System.out.println("4-Dolar para Peso argentino, Digite um valor para converter");
            valorDaMoeda.valorDigitado=leitura.nextLine();
            valorDaMoeda.consulta();
            System.out.println(valorDaMoeda.toString());
            break;
        case "5":
            valorDaMoeda.moeda1="ARS";
            valorDaMoeda.moeda2="USD";
            System.out.println("5-Peso argentino para dolar, Digite um valor para converter");
            valorDaMoeda.valorDigitado=leitura.nextLine();
            valorDaMoeda.consulta();
            System.out.println(valorDaMoeda.toString());
            break;
        case "6":
            valorDaMoeda.moeda1="USD";
            valorDaMoeda.moeda2="BRL";
            System.out.println("6-Dolar pra real brasileiro, Digite um valor para converter");
            valorDaMoeda.valorDigitado=leitura.nextLine();
            valorDaMoeda.consulta();
            System.out.println(valorDaMoeda.toString());
            break;
        case "7":
            System.out.println("Programa finalizado");
            sair=false;
            break;




    }



}




    }
    }