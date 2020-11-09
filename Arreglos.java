import java.util.*;

public class Arreglos{
    
    public static void main(String[] args){

        float num;
        int selector;
        Arreglos maymen = new Arreglos();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola esta es mi practica de arreglos");
        System.out.println("Seleccione una opcion(METODO)");
        System.out.println("1-PROMEDIO");
        System.out.println("2-PROMEDIO PAR");
        System.out.println("3-CALIFICACIONES");
        System.out.println("4-MATRIZ");
        selector = entrada.nextInt();
        
        
        switch (selector) {
            case 1:
                maymen.Promedio();
                break;
            case 2:
                maymen.Promediopar();
                break;
            case 3:
                maymen.Calificaciones();
                break;
            case 4:
                System.out.println("En construccion no nos alcanzo el tiempo :( (T-T)");
                break;
                
            default:

            break;
        }
    }
    
    public void Promedio(){
        int positivos=0;
        int negativos=0;
        double sumap=0;
        double suman=0;
        double ppositivo=0;
        double pnegativo=0;

        Scanner entrada = new Scanner(System.in);


        double matriz[] = new double[10];


        for(int i=0; i<matriz.length; i++){
            // le pusiste matriz pero recuerda que cuando es unidimencional es un vector y se nombra arreglo, una matriz es bidimencional 
            System.out.println("el numero en la pocicion " + (i+1) + " es:");
            matriz[i] = entrada.nextDouble(); 
            // con el uso del if pregunto si el valor del arreglo es positivo o es negativo 
            // y dependiendo de esta condicion puedo saber cuantos son positivos y cuantos negativos GG
            if(matriz[i] > 0){
               positivos = positivos+1;

            }
            else{
               
            }if(matriz[i] < 0){
                negativos = negativos+1;
            }else{
                negativos = negativos+0;
            }
            
            System.out.println("numeros positivos: " + positivos);
            System.out.println("numeros negativos: " + negativos);
            
        }

        for(int p=0; p<matriz.length; p++){

            if(matriz[p] > 0){
            
                sumap+=matriz[p];
                System.out.println("la suma es: "+ sumap);
            
            }else{
            
                suman+=matriz[p];
                System.out.println("la suma es: "+ suman);
                
            } 
        }

        ppositivo = sumap/10;
        System.out.println("el promedio de los positivos es: " + ppositivo);
        pnegativo = (suman/10)*-1;
        System.out.println("el promedio de los negativos es: " + pnegativo);

    }

    public void Promediopar(){

        int positivos=0;
        int negativos=0;
        double sumap=0;
        double suman=0;
        double ppositivo=0;
        double pnegativo=0;

        Scanner entrada = new Scanner(System.in);


        double matriz[] = new double[10];


        for(int i=0; i<matriz.length; i++){
            // le pusiste matriz pero recuerda que cuando es unidimencional es un vector y se nombra arreglo, una matriz es bidimencional 
            System.out.println("el numero en la pocicion " + (i+1) + " es:");
            matriz[i] = entrada.nextDouble(); 
            // con el uso del if pregunto si el valor del arreglo es positivo o es negativo 
            // y dependiendo de esta condicion puedo saber cuantos son positivos y cuantos negativos GG
            if(matriz[i] > 0){
               positivos = positivos+1;

            }
            else{
               
            }if(matriz[i] < 0){
                negativos = negativos+1;
            }else{
                negativos = negativos+0;
            }
            
            System.out.println("numeros positivos: " + positivos);
            System.out.println("numeros negativos: " + negativos);
            
        }


        for(int p=0; p<matriz.length; p+=2){

            if(matriz[p] > 0){
            
                sumap+=matriz[p];
                System.out.println("la suma es: "+ sumap);
            
            }else{
            
                suman+=matriz[p];
                System.out.println("la suma es: "+ suman);
                
            } 
        }

        ppositivo = sumap/10;
        System.out.println("el promedio de los positivos es: " + ppositivo);
        pnegativo = (suman/10)*-1;
        System.out.println("el promedio de los negativos es: " + pnegativo);

    }
    
    public void Calificaciones(){

        int reprovados=0;
        int aprovados=0;
        double sumap=0;
        double suman=0;
        double ppositivo=0;
        double pnegativo=0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("POR FAVOR QUE LA PRIMERA CALIFICACION QUE INGRESE SEA LA MAS ALTA");


        double matriz[] = new double[10];


        for(int i=0; i<matriz.length; i++){
            // le pusiste matriz pero recuerda que cuando es unidimencional es un vector y se nombra arreglo, una matriz es bidimencional 
            System.out.println("la calificacion en la pocicion " + (i+1) + " es:");
            matriz[i] = entrada.nextDouble(); 

            double mayor,menor;
            mayor = matriz[0];
            menor = matriz[0];

            
            if(matriz[i] > mayor){
            mayor = matriz[i];

            }
            if(matriz[i] < menor){
            menor = matriz[i];
            }
            if(matriz[i]>=6){
                aprovados = aprovados + 1;

            }else{
                reprovados = reprovados + 1;          

            }
            
            // con el uso del if pregunto si el valor del arreglo es positivo o es negativo 
            // y dependiendo de esta condicion puedo saber cuantos son positivos y cuantos negativos GG
            if(matriz[i]<0 || matriz[i]>10){
                do{
                
                    System.out.println("recurda que solo debes ingresar numeros entrre 0 y 10");
                    System.out.println("la calificacion en la pocicion " + (i+1) + " es:");
                    matriz[i] = entrada.nextDouble(); 
                
                }while(matriz[i]<0 || matriz[i]>10);
            
            }else{
        
            }
            // se dejasta la calificacion mayor y la calificacion menor:( :( 
            System.out.println("la calificacion mayor es: "+mayor);
            System.out.println("la calificacion menor es: "+menor);

        }
        

        for(int p=0; p<matriz.length; p++){

            sumap+=matriz[p];

        
        }

        ppositivo = sumap/10;
        System.out.println("el promedio de las calificaciones es: " + ppositivo);
        System.out.println("total de alumnos aprovados: " + aprovados);
        System.out.println("total de alumnos reprovados: " + reprovados);

        

        
    }
    

}