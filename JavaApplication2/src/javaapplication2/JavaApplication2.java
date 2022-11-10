package javaapplication2;

/**
 *
 * @author Alexis
 */
public class JavaApplication2 {
    public static void main(String[] args){
        /*
        menu init = new menu();
        init.loginin();
        switch (init.acceso) {
            case 1 -> System.out.println("Administrador");
            case 2 -> System.out.println("Estudiante");
            default -> init.loginin();
        }
        */
        GeneradorNombres gen1 = new GeneradorNombres();
        gen1.leer();
    }    
}
