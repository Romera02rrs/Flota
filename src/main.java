public class main {


    //Instancias
    static cTablero tablero = new cTablero();
    static cBarco barco = new cBarco();
    //Variables
    public int fila;
    public int columna;
    public int grandaria;
    static int numBarcos = 5;


    public static void main(String[] args) {

        do{

            tablero.reiniciarTablero();
            tablero.mostrarTablero();
            while(numBarcos != 0){
                tablero.colocarBarco2();
                numBarcos -= 1;
            }

        }while(false);
    }
}
