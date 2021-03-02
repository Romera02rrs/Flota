import java.util.Formattable;
import java.util.Scanner;
public class cTablero {

    cBarco barco = new cBarco();

    //boolean a = cBarco.a;

    //Declaracion de las constantes del tablero.
    static final int X = 8;
    static final int Y = 8;
    //Declaracion escaner.
    Scanner leerInt = new Scanner(System.in);
    Scanner leerString = new Scanner(System.in);
    //Declaracion de las variables;
    int numBarcos = 0;
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

        do {
            barco.esocgeBarco();
        } while (barco.nb == true);

        System.out.println("Hola");
        if(barco.a == true){
            System.out.println("Acorazado escogido");
        }else if (barco.d == true){
            System.out.println("Destructor escogido");
        }else if (barco.f == true){
            System.out.println("Fragata escogido");
        }else if (barco.p == true){
            System.out.println("Porta Aviones escogido");
        }else if (barco.s == true){
            System.out.println("Submarino escogido");
        }else{
            System.out.println("Aqui no deberia de llegar");
        }
        int posX;
        int posY;
        System.out.println("En que posicion 'X' quieres el barco:");
        posX = leerInt.nextInt();
        System.out.println("En que posicion 'Y' quieres el barco:");
        posY = leerInt.nextInt();
        posX -= 1;
        posY -= 1;
        if (barco.f == true){
            tablero[posX][posY] = 'F';
            mostrarTablero();
        }else{
            tablero[posX][posY] = 'X';
            mostrarTablero();
            System.out.println("\n\nEn que direccion quieres colocar el barco: arr - aba - izq - der");
            String direccion = leerString.nextLine();
            boolean arr, aba, izq, der;
            arr = false;
            aba = false;
            izq = false;
            der = false;
            if (barco.a == true){
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
            if (barco.d == true){
                if (direccion.equalsIgnoreCase("arr")){
                    tablero[posX][posY] = 'B';
                    tablero[posX-1][posY] = 'B';
                } else if(direccion.equalsIgnoreCase("aba")){
                    aba = true;
                    tablero[posX][posY] = 'B';
                    tablero[posX+1][posY] = 'B';
                } else if(direccion.equalsIgnoreCase("izq")){
                    izq = true;
                    tablero[posX][posY] = 'B';
                    tablero[posX][posY-1] = 'B';
                } else{
                    der = true;
                    tablero[posX][posY] = 'B';
                    tablero[posX][posY+1] = 'B';;
                }
                mostrarTablero();
            }
            if (barco.p == true){
                if (direccion.equalsIgnoreCase("arr")){
                    tablero[posX][posY] = 'P';
                    tablero[posX-1][posY] = 'P';
                    tablero[posX-2][posY] = 'P';
                    tablero[posX-3][posY] = 'P';
                } else if(direccion.equalsIgnoreCase("aba")){
                    aba = true;
                    tablero[posX][posY] = 'P';
                    tablero[posX+1][posY] = 'P';
                    tablero[posX+2][posY] = 'P';
                    tablero[posX+3][posY] = 'P';
                } else if(direccion.equalsIgnoreCase("izq")){
                    izq = true;
                    tablero[posX][posY] = 'P';
                    tablero[posX][posY-1] = 'P';
                    tablero[posX][posY-2] = 'P';
                    tablero[posX][posY-3] = 'P';
                } else{
                    der = true;
                    tablero[posX][posY] = 'P';
                    tablero[posX][posY+1] = 'P';
                    tablero[posX][posY+2] = 'P';
                    tablero[posX][posY+3] = 'P';
                }
                mostrarTablero();
            }
            if (barco.s == true){
                if (direccion.equalsIgnoreCase("arr")){
                    tablero[posX][posY] = 'S';
                    tablero[posX-1][posY] = 'S';
                    tablero[posX-2][posY] = 'S';
                } else if(direccion.equalsIgnoreCase("aba")){
                    aba = true;
                    tablero[posX][posY] = 'S';
                    tablero[posX+1][posY] = 'S';
                    tablero[posX+2][posY] = 'S';
                } else if(direccion.equalsIgnoreCase("izq")){
                    izq = true;
                    tablero[posX][posY] = 'S';
                    tablero[posX][posY-1] = 'S';
                    tablero[posX][posY-2] = 'S';
                } else{
                    der = true;
                    tablero[posX][posY] = 'S';
                    tablero[posX][posY+1] = 'S';
                    tablero[posX][posY+2] = 'S';
                }
                mostrarTablero();
            }
        }
    }
}
