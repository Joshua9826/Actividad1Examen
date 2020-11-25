
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshu
 */
public class Sumas {
    public static void main (String[] args){
        Scanner teclado = new Scanner (System.in);
        int numero, suma=0;
        System.out.println("Ingrese su matricula");
        numero = teclado.nextInt();
        int aux=numero;
        while(numero != 0){
            suma=suma+(numero%10);
            numero=numero/10;
        }
        System.out.println("Los digitos que ingreso ("+aux+") suma: "+suma);
        
        if(suma<=19){
            int hashS = 0;
            System.out.println("Su hash Simple es: "+hashS);
        }if(suma >=20 && suma<=29){
            int hashS = 1;
            System.out.println("Su hash Simple es: "+hashS);
        }else{
            int hashS = 2;
            System.out.println("Su hash Simple es: "+hashS);
        }
        
        System.out.println("Sumaremos los datos de su sumatoria: ");
        
        if(suma==30){
            System.out.println("La sumatoria de la sumatoria: "+suma+" es 3 por lo tanto esta reprobado, este es el MIO");
        }if (suma==26){
            System.out.println("La sumatoria de la sumatoria: "+suma+" es 8 por lo tanto esta aprobado");
        }if (suma==25){
            System.out.println("La sumatoria de la sumatoria: "+suma+" es 7 por lo tanto esta aprobado");
        }if (suma==22){
            System.out.println("La sumatoria de la sumatoria: "+suma+" es 4 por lo tanto esta reprobado");
        }if (suma==20){
            System.out.println("La sumatoria de la sumatoria: "+suma+" es 2 por lo tanto esta reprobado");
        }
    }
}

    