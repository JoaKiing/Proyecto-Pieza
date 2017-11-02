package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int porcentajeGatos = 10;
        int porcentajeRaton = 25;
        
        int colum = 0;
        int fila = 0;
        int respuesta = 0;
        int contGatos = 1;
        int contRaton = 1;
        int x1 = 0;
        int y1 = 0;
        int numGato = 0;
        int numRaton = 0;
        int contMueble = 0;
        
        //Pediremos los datos como string para luego guardarlos y separarlos en un vector
        System.out.print("ancho y largo separados ppor una coma(,): ");
        String mueble = scan.nextLine();

        String[] vCoordenadas = mueble.split(",");

        String filas = vCoordenadas[0];
        String columna = vCoordenadas[1];

        colum = Integer.parseInt(columna);
        fila = Integer.parseInt(filas);

        int areaPieza = colum * fila;
        
        //creamos la matriz pieza con los datos ingresados por el usuario
        String[][] mPieza = new String[fila][colum];
        
        
        //creamos la cabecera con las coordenadas a mostrar
        String principio = "f/c";
        for (int i = 0; i < mPieza[0].length; i++) {
            principio = principio + " 0" + Integer.toString(i);
        }
        System.out.println(principio);
        
        
        for (int i = 0; i < mPieza.length; i++) {
            for (int j = 0; j < mPieza[i].length; j++) {
                mPieza[i][j] = " - ";

            }

        }
        
        
        String filass = "";
        for (int f = 0; f < mPieza.length; f++) {
            filass = Integer.toString(f);
            for (int c = 0; c < mPieza[0].length; c++) {
                filass = filass + mPieza[f][c];
            }
            System.out.println("  0" + filass);
        }

        int porcentaje_gatos = areaPieza * porcentajeGatos / 100;
        int porcentaje_raton = areaPieza * porcentajeRaton / 100;
        System.out.println("La Cantidad De Gatos MAXIMA a Ingresar Es : " + porcentaje_gatos);
        System.out.print("Cuantos desea ingresar:  ");
        while(true){
            try {
                respuesta = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.out.println("INGRESE SOLO NUMEROS CON UN MAXIMO DE " + porcentaje_gatos);
                System.out.print("INGRESE NUEVAENTE: ");

            }
        }
//--------------------------------------------------------------------
        while (respuesta > numGato) {
            
                System.out.println("GATO N°: " + contGatos + " : ");

                String gato = scan.nextLine();
                String[] vCoordenadas2;
                vCoordenadas2 = gato.split(",");

                int fi = Integer.parseInt(vCoordenadas2[0]);
                int co = Integer.parseInt(vCoordenadas2[1]);
                
                
                for (int i = 0; i < mPieza.length; i++) {
                    for (int j = 0; j < mPieza[i].length; j++) {
                        mPieza[fi][co] = " G ";
                    }
                }
                
            principio = "f/c";
            for (int i = 0; i < mPieza[0].length; i++) {
                principio = principio + " 0" + Integer.toString(i);
            }
            System.out.println(principio);

            filass = "";
            for (int f = 0; f < mPieza.length; f++) {
                filass = Integer.toString(f);
                for (int c = 0; c < mPieza[0].length; c++) {
                    filass = filass + mPieza[f][c];
                }
                System.out.println("  0" + filass);
            }
            numGato++;
            contGatos++;
        }

       
        System.out.println("LA CANTIDAD MAXIMA DE RATONES A INGRESAR ES: " + porcentaje_raton);
        System.out.println("Cuantos Ratones Desea Ingresar: ");
        while(true){
            try{
                respuesta = Integer.parseInt(scan.nextLine());
                break;
            }catch(NumberFormatException ex){
                System.out.println("ERROR, SOLO INGRESE NUMEROS ENTRE EL RANGO");
                
            }
        }
        
        while (respuesta > numRaton) {

            System.out.println("RATON N° " + contRaton + " : ");
            String raton = scan.nextLine();
            String[] vCoordenadasRaton;
            String col;
            String fil;

            vCoordenadasRaton = raton.split(",");

            fil = vCoordenadasRaton[0];
            col = vCoordenadasRaton[1];

            x1 = Integer.parseInt(fil);
            y1 = Integer.parseInt(col);

            for (int i = 0; i < mPieza.length; i++) {
                for (int j = 0; j < mPieza[i].length; j++) {
                    mPieza[x1][y1] = " R ";
                }

            }
            
            principio = "f/c";
            for (int i = 0; i < mPieza[0].length; i++) {
                principio = principio + " 0" + Integer.toString(i);
            }
            System.out.println(principio);

            filass = "";
            for (int f = 0; f < mPieza.length; f++) {
                filass = Integer.toString(f);
                for (int c = 0; c < mPieza[0].length; c++) {
                    filass = filass + mPieza[f][c];
                }
                System.out.println("  0" + filass);
            }
            numRaton++;
            contRaton++;
        }

        System.out.println("mueble n");
        System.out.print("punto de inicio: ");
        mueble = scan.nextLine();
        String[] vCoordenadas4;
        String col;
        String fil;

        vCoordenadas4 = mueble.split(",");

        fil = vCoordenadas4[0];
        col = vCoordenadas4[1];

        int X1 = Integer.parseInt(fil);
        int Y1 = Integer.parseInt(col);

        principio = "f/c";
        for (int i = 0; i < mPieza[0].length; i++) {
            principio = principio + " 0" + Integer.toString(i);

        }
        System.out.println(principio);

        filass = "";
        for (int f = 0; f < mPieza.length; f++) {
            filass = Integer.toString(f);
            for (int c = 0; c < mPieza[0].length; c++) {
                filass = filass + mPieza[f][c];
            }
            System.out.println("  0" + filass);
        }
        System.out.println("mueble n");
        System.out.println("punto final ");
        mueble = scan.nextLine();

        String[] vCoordenadas5;
        String col1;
        String fil1;

        vCoordenadas5 = mueble.split(",");

        fil1 = vCoordenadas5[0];
        col1 = vCoordenadas5[1];

        int X2 = Integer.parseInt(fil1);
        int Y2 = Integer.parseInt(col1);

        for (int i = X1; i < X2; i++) {
            for (int j = Y1; j < Y2; j++) {
                mPieza[i][j] = " M ";

            }

        }

        principio = "f/c";
        for (int i = 0; i < mPieza[0].length; i++) {
            principio = principio + " 0" + Integer.toString(i);
        }
        System.out.println(principio);

        filass = "";
        for (int f = 0; f < mPieza.length; f++) {
            filass = Integer.toString(f);
            for (int c = 0; c < mPieza[0].length; c++) {
                filass = filass + mPieza[f][c];
            }
            System.out.println("  0" + filass);
        }
        contMueble++;
    }

}