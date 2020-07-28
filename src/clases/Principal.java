package clases;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Lógica instancia = new Lógica();
        int decisión;
        
        System.out.println("**************************************************");
        System.out.println("**     CONVERTIDOR DE SISTEMA DE NUMERACIÓN     **");
        System.out.println("**************************************************");
        System.out.println("");
        
        do {
            System.out.println("1. De decimal a binario");
            System.out.println("2. De binario a decimal");
            System.out.print("¿Que tipo de conversión desea hacer? ");
            decisión = entrada.nextInt();
        } while (decisión != 1 && decisión != 2);

        instancia.IngresoDatos();

        switch (decisión) {
            case 1:
                instancia.Decimal_Binario();
                instancia.SalidaDatos_DB();
                break;
            case 2:
                instancia.Binario_Decimal();
                instancia.SalidaDatos_BD();
                break;
        }
        
        System.out.println("");        
    }
}
