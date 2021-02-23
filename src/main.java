public class main {


    //Instancias
    static cTablero flota = new cTablero();
    //Variables
    public int fila;
    public int columna;
    public int grandaria;


    public static void main(String[] args) {

        do{

            flota.reiniciarTablero();
            flota.mostrarTablero();
            flota.colocarBarcos();

        }while(false);
    }
}
