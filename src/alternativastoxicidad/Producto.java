package alternativastoxicidad;

/**
 * * @author Parga
 */
public class Producto {

    private String nombre;
    private int grado;

    public Producto() {
    }

    public Producto(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    static void calculo(int grado, String nombre) {

        int g = grado;
        int b = 0;
        String n = nombre;

        if (g < 10 && g > 0) {
            System.out.println("El producto no es tóxico.");
        } else {
            if (g == 11) {
                System.out.println("El producto tiene una baja toxicidad.");
            } else {
                if (g == 12) {
                    System.out.println("El producto tiene una toxicidad media.");
                } else {
                    if (g == 13) {
                        System.out.println("El producto es altamente tóxico.");
                    } else {
                        if (g > 13) {
                            System.out.println("El producto es altamente peligroso.");
                        } else {
                            System.out.println("ERROR de toxicidad");
                        }
                    }
                }

            }

        }
    }
}