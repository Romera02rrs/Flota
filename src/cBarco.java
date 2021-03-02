import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class cBarco {
    Scanner leerString = new Scanner(System.in);
    Scanner leerInt = new Scanner(System.in);

    protected int grandaria = 0;

    public boolean a;
    public boolean d;
    public boolean f;
    public boolean p;
    public boolean s;
    public boolean nb;

    public cBarco(){

    }

    public boolean esocgeBarco() {

         a = false;
         d = false;
         f = false;
         p = false;
         s = false;
         nb = false;

        System.out.println("""
                                
                                
                Escoge un barco: Acorazado, Destructor, Fragata, PortaAviones, Submarino. 
                """);
        String num = leerString.nextLine();
        if (num.equals("a")) {
            return a = true;
        } else if (num.equals("d")) {
            return d = true;
        } else if (num.equals("f")) {
            return f = true;
        } else if (num.equals("p")) {
            return p = true;
        } else if (num.equals("s")) {
            return s = true;
        } else{
            System.out.println("No has escogido ningun barco valido");
            return nb = true;
        }
    }
}
