package calificaciones;

import java.util.*;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner holi=new Scanner(System.in);
        double[][] Cal=new double[5][4];
        double grupal=0;
        int x,y;
        
        for(x=0;x<5;x++){
            for(y=0;y<3;y++){
                System.out.print("Alumno "+(x+1)+"\tCalificacion "+(y+1)+": ");
                Cal[x][y]=holi.nextDouble();
                Cal[x][3]=Cal[x][3]+Cal[x][y];
            }
            Cal[x][3]/=3;
            grupal=grupal+Cal[x][3];
        }
        
        System.out.println("\n\nImpresion de las calificaciones con su promedio");
        
        System.out.println("Alumno\tCal. 1\tCal. 2\tCal. 3\tPromedio");
        for(x=0;x<5;x++){
            System.out.println((x+1)+"\t"+Cal[x][0]+"\t"+Cal[x][1]+"\t"+Cal[x][2]+"\t"+Cal[x][3]);
        }
        
        System.out.println("\n\nPromedio grupal: "+(grupal/5));
    }
    
}
