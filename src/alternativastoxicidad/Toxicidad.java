package alternativastoxicidad;

import java.io.*;

/*
 * @author Parga
 */
public class Toxicidad {

    public static void main(String[] args) throws IOException {
        int grado;
        String nombre;

        BufferedReader lee = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nombre del producto: ");
        nombre = (lee.readLine());
        System.out.println("Nivel de toxicidad: ");
        grado = Integer.parseInt(lee.readLine());

        Producto.calculo(grado, null);
    }
}
