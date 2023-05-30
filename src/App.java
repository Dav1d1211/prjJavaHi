/**
 * @date: 30.may.2k23
 * @author: Dave
 * @description: primer programa en java
 */
import java.util.Scanner;
/*
 * @description: mi primera clase
 */

public class App {
    
    public static void main(String[] args) throws Exception {
        int nroSignos=5;
        String strDelimitador = "-:-";
        String strfruta = "coco-:-banana-:-mango-:-manzana-:-pera-:-frutilla-:-sandia";
        
        usoScaner(strDelimitador, strfruta);
        //secuencia de signos
        secuenciaDeSignos(nroSignos);
        //secuencia de signos alternos
        secuenciaDeSignosAlternos(nroSignos);

        
    }

    /**
     * usoScaner : indica como usar la lib scaner 
     * @param  strDelimirador : caracteres para hacer la segmentacion
     * @param strfruta : listado de frutas
     */
    private static void usoScaner(String strDelimitador, String strfruta) {
        Scanner sc = new Scanner (strfruta);

        sc.useDelimiter(strDelimitador);
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
    /**
     * secuenciaSigno: imprime una secuencia de signos
     * @param nroSignos: cantidad de signos a imprimir
     */
    public static void secuenciaDeSignos(int nroSignos){
        //secuencia de signos
        for (int i = 0; i < nroSignos; i++) {
            System.out.print("+ ");
            
        }
        System.out.println("");

    }
    /**
     * <b>secuenciaSignoAlternos<b>: imprime una secuencia de signos alternos
     * @param nroSignos: cantidad de signos a imprimir
     */
    public static void secuenciaDeSignosAlternos(int nroSignos){
        for (int i = 0; i < nroSignos; i++) 
            if (i %2 ==0) 
                System.out.print("+ ");
                
             else 
                System.out.print("- ");
    }
    
}
