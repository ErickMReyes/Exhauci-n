package exhaucion;

import java.util.*;
/**
 *
 * @author Erick
 */
public class Exhaucion {
    
    public static void main(String[] args) {
        
        double Lados = 6;
        double LadoInicial = 1;
        double a,b,P,D,nuevoLado;
        
        for(int i=1; i<=20; i++){
            
            double C = (LadoInicial/2);
            a = Math.sqrt(1-(C*C));
            b = 1-a;
            
            nuevoLado = Math.sqrt(C*C+b*b);
            P = Lados*LadoInicial;
            D = P/2;
            
            String f1 = String.format("%5s", "Lados:");
            String f2 = String.format("%5s","Lado Inicial:");
            String f3 = String.format("%5s", "x:");
            String f4 = String.format("%5s", "a:");
            String f5 = String.format("%5s", "b:");
            String f6 = String.format("%5s", "Nuevo lado:");
            String f7 = String.format("%5s", "P:");
            String f8 = String.format("%5s", "P/D:");
            
            System.out.println(f1 + Lados + "    " + f2 + LadoInicial + " " +
                    f3 + C + " " + f4 + a + " " + f5 + b + "     " + f6 + 
                    nuevoLado + "     " + f7 + P + "     " + f8 + D);
            LadoInicial = nuevoLado;
            Lados = Lados*2;
        }
    }
}
