/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enfermedades_emisiones_gases;

/**
 *
 * @author Medardo Rene Chango Caguana
 */
class Enfermedad1{
    int numCasosCuenca; 
    int casosenfermedad;
    
    
    void Mostrarvalores(){
        System.out.println("--La cantidad de personas con enfermedades: "+numCasosCuenca+""); 
        System.out.println("--El numero de personas con cada caso : "+casosenfermedad+""); 
    }
}
class Enfermedad extends Enfermedad1{
    String tipo;
    double calculararea(){
        return(casosenfermedad*100)/numCasosCuenca;
    }
    void MostrarTipo(){
       System.out.println("--El tipo de enfermedad es : "+tipo);
    }
}
public class Enfermedades_Emisiones_Gases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("  **********UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE********** ");
         System.out.println("             ********PROGRAMACION******** ");
         System.out.println("\033[34m-Autor: Medardo Chango");
         System.out.println("****************************************************************");
         System.out.println("\033[31mENFERMEDADES PRODUCIDAS POR LAS EMISIONES DE GASES PROVENIENTES DE LOS MOTORES OTTO"); 
         System.out.println("");
       Enfermedad e1= new Enfermedad();
       Enfermedad e2= new Enfermedad();
       Enfermedad e3= new Enfermedad();
       Enfermedad e4= new Enfermedad();
       Enfermedad e5= new Enfermedad();
       Enfermedad e6= new Enfermedad();
       Enfermedad e7= new Enfermedad();
       
        e1.numCasosCuenca=12354;
        e1.casosenfermedad=4447;
        e1.tipo="Asma";
        
        e2.numCasosCuenca=12354;
        e2.casosenfermedad=1483;
        e2.tipo="Bronconeumonia";
        
        e3.numCasosCuenca=12354;
        e3.casosenfermedad=2100;
        e3.tipo="Bronquiolitis";
        
        e4.numCasosCuenca=12354;
        e4.casosenfermedad=741;
        e4.tipo="Bronquitis";
        
        e5.numCasosCuenca=12354;
        e5.casosenfermedad=1482;
        e5.tipo="Faringitis";
        
        e6.numCasosCuenca=12354;
        e6.casosenfermedad=1359;
        e6.tipo="Neumonia";
        
        e7.numCasosCuenca=12354;
        e7.casosenfermedad=742;
        e7.tipo="Rinitis";
        
        
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>> ");
        e1.MostrarTipo();
        e1.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e1.calculararea()+"%");
        System.out.println();
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>>");
        e1.MostrarTipo();
        e1.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e2.calculararea()+"%");
        System.out.println();
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>>");
        e3.MostrarTipo();
        e3.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e3.calculararea()+"%");
        System.out.println();
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>>");
        e4.MostrarTipo();
        e4.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e4.calculararea()+"%");
        System.out.println();
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>>");
        e5.MostrarTipo();
        e5.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e5.calculararea()+"%");
        System.out.println();
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>>");
        e6.MostrarTipo();
        e6.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e6.calculararea()+"%");
        System.out.println();
        
        System.out.println("\033[31m<<INFORMACION PARA LA ENFERMEDAD POR EMISIONES DE GASES>>");
        e7.MostrarTipo();
        e7.Mostrarvalores();
        System.out.println("\033[34mEl porcentaje de la enfermdad producida por emisiones de gases es : "+e7.calculararea()+"%");
    }
    
}
