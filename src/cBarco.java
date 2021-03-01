import java.util.Scanner;

public class cBarco {
    Scanner leerString = new Scanner(System.in);
    Scanner leerInt = new Scanner(System.in);

    protected int grandaria = 0;

    public void cBarco() {


    }

    public boolean esocgeBarco(boolean a, boolean d, boolean f, boolean p, boolean s) {

        System.out.println("""
                                
                                
                Escoge un barco: Acorazado, Destructor, Fragata, PortaAviones, Submarino. 
                """);
        String num = leerString.nextLine();
        a = false;
        d = false;
        f = false;
        p = false;
        s = false;
        if (num.equalsIgnoreCase("a")) {
            return a = true;
        } else if (num.equalsIgnoreCase("d")) {
            return d = true;
        } else if (num.equalsIgnoreCase("f")) {
            return f = true;
        } else if (num.equalsIgnoreCase("p")) {
            return p = true;
        } else {
            return s = true;
        }
    }
}
