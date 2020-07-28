package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lógica {

    private List<Integer> lista = new ArrayList<>();
    private int número;

    public void IngresoDatos() {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número que desea convertir: ");
        número = entrada.nextInt();
    }

    //Realizamos la división sucesiva por 2
    public void Decimal_Binario() {

        int residuo;
        
        while (número != 1) {
            residuo = número % 2;
            número /= 2;
            lista.add(residuo);
        }
        lista.add(número);
    }
    
    //Imprimimos la lista de manera invertida
    public void SalidaDatos_DB() {
        
        System.out.print("Número convertido: ");

        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i));
        }
    }

    //Remplazamos los 1s por valores binarios sucesivos y los sumamos en una variable
    public void Binario_Decimal() {

        String cadena = String.valueOf(número);
        número = 0;
        int valor = 1;

        for (int i = cadena.length() - 1; i >= 0; i--) {
            if (cadena.charAt(i) == '1') {
                número += valor;
            }
            valor *= 2;
        }
    }

    public void SalidaDatos_BD() {
        
        System.out.print("Número convertido: " + número);
    }
}
