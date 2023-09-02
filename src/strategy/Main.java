package src.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static final int OPCION_SALIR = 5;


    public static void main(String[] args) {

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        int opcion;
        do {
            System.out.println("Ingrese una opción \n(1) - Crear\n(2) - Leer\n(3) - Actualizar\n(4) - Eliminar\n(" + OPCION_SALIR + ") - SALIR");
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);

            if (accion == null && opcion!= OPCION_SALIR) System.out.println("Esta opcion no existe");
            else if (accion == null && opcion == OPCION_SALIR) System.out.println("SALIDA EXITOSA");
            else accion.aplicar();

        } while (opcion != OPCION_SALIR);

    }
}
