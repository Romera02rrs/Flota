public class main {


    //Instancias
    static cTablero tablero = new cTablero();
    static cBarco barco = new cBarco();
    //Variables
    public int fila;
    public int columna;
    public int grandaria;


    public static void main(String[] args) {

        do{

            tablero.reiniciarTablero();
            tablero.mostrarTablero();
            barco.esocgeBarco(false, false, false, false, false);
            tablero.colocarBarco();

        }while(false);
    }
}
