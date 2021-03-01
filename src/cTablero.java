import java.util.Formattable;
import java.util.Scanner;
public class cTablero {

    //Declaracion de las constantes del tablero.
    static final int X = 8;
    static final int Y = 8;
    //Declaracion escaner.
    Scanner leerInt = new Scanner(System.in);
    Scanner leerString = new Scanner(System.in);
    //Declaracion de las variables;
    int posX;
    int posY;
    //Declaracion del tamaño de los barcos.
    private int tAcorazado;
    private int tDestructor;
    private int tFragata;
    private int tPortaAviones;
    private int tSubmarino;
    //Declaracion de las matrices.
    //Declaracion de las clases.
    cAcorazado acorazado;
    cDestructor destructor;
    cFragata fragata;
    cPortaAviones portaAviones;
    cSubmarino submarino;
    //Declaracion de las matrices.
    char[][] tablero;
    int[][] disparos;
    int[][] barcos;

    public cTablero() {

        //
        /*
        p = new cPortaAviones();
        d = new cDestructor();
        f = new cFragata();
        s = new cSubmarino();
        a = new cAcorazado();*/
        disparos = new int[X][Y];
        //Inicializacion de las constantes del tablero.

        //Inicializacion del tamaño de los barcos.
        tAcorazado = 3;
        tDestructor = 2;
        tFragata = 1;
        tPortaAviones = 4;
        tSubmarino = 3;
        //Declaracion de las matrices.
        //Declaracion de las clases.
        cAcorazado acorazado;
        cDestructor destructor;
        cFragata fragata;
        cPortaAviones portaAviones;
        cSubmarino submarino;
        //Declaracion de las matrices.
        tablero = new char [X][Y];
        int[][] disparos;
        int[][] barcos;
    }

    public void reiniciarTablero(){

        for (char i = 0; i < tablero.length; i++){
            for (char j = 0; j < tablero[i].length; j++){
                tablero[i][j] = '○';
            }
        }
    }

    public void mostrarTablero(){

        System.out.print("  1 2 3 4 5 6 7 8");
        int num = 0;
        for (char i = 0; i < tablero.length; i++){
            num += 1;
            System.out.println();
            System.out.print(num+" ");
            for (char j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j]+" ");
            }
        }
    }

    public void colocarBarco(){

        int posX;
        int posY;

        System.out.println("En que posicion 'X' quieres el barco:");
        posX = leerInt.nextInt();
        System.out.println("En que posicion 'Y' quieres el barco:");
        posY = leerInt.nextInt();
        posX -= 1;
        posY -= 1;
        tablero[posX][posY] = 'X';
        mostrarTablero();
        System.out.println("\n\nEn que direccion quieres colocar el barco: arr - aba - izq - der");
        String direccion = leerString.nextLine();
        boolean arr, aba, izq, der;
        arr = false;
        aba = false;
        izq = false;
        der = false;
        if (direccion.equalsIgnoreCase("arr")){
            tablero[posX][posY] = 'A';
            tablero[posX-1][posY] = 'A';
            tablero[posX-2][posY] = 'A';
        } else if(direccion.equalsIgnoreCase("aba")){
            aba = true;
            tablero[posX][posY] = 'A';
            tablero[posX+1][posY] = 'A';
            tablero[posX+2][posY] = 'A';
        } else if(direccion.equalsIgnoreCase("izq")){
            izq = true;
            tablero[posX][posY] = 'A';
            tablero[posX][posY-1] = 'A';
            tablero[posX][posY-2] = 'A';
        } else{
            der = true;
            tablero[posX][posY] = 'A';
            tablero[posX][posY+1] = 'A';
            tablero[posX][posY+2] = 'A';
        }
        mostrarTablero();

    }

    public void colocarBarco2(){

        cBarco prueba = new cBarco();

        if(prueba.esocgeBarco(boolen a = true)){

        }
        int posX;
        int posY;
        System.out.println("En que posicion 'X' quieres el barco:");
        posX = leerInt.nextInt();
        System.out.println("En que posicion 'Y' quieres el barco:");
        posY = leerInt.nextInt();
        posX -= 1;
        posY -= 1;
        tablero[posX][posY] = 'X';
        mostrarTablero();
        System.out.println("\n\nEn que direccion quieres colocar el barco: arr - aba - izq - der");
        String direccion = leerString.nextLine();
        boolean arr, aba, izq, der;
        arr = false;
        aba = false;
        izq = false;
        der = false;
        if (direccion.equalsIgnoreCase("arr")){
            tablero[posX][posY] = 'A';
            tablero[posX-1][posY] = 'A';
            tablero[posX-2][posY] = 'A';
        } else if(direccion.equalsIgnoreCase("aba")){
            aba = true;
            tablero[posX][posY] = 'A';
            tablero[posX+1][posY] = 'A';
            tablero[posX+2][posY] = 'A';
        } else if(direccion.equalsIgnoreCase("izq")){
            izq = true;
            tablero[posX][posY] = 'A';
            tablero[posX][posY-1] = 'A';
            tablero[posX][posY-2] = 'A';
        } else{
            der = true;
            tablero[posX][posY] = 'A';
            tablero[posX][posY+1] = 'A';
            tablero[posX][posY+2] = 'A';
        }
        mostrarTablero();

    }
}
