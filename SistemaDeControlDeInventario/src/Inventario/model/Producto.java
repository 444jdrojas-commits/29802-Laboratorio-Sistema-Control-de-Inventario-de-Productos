package Inventario.model;

/**
 * -------------------------------------------------------------------------
 * INTEGRANTE: Josue Rojas (Team Inventario)
 * CLASE: Producto (Modelo de Datos)
 * Esta clase define el PROCESO de encapsulamiento y estructura de datos.
 * Es la responsable de mantener la integridad de la información que
 * fluye por el sistema (validación de tipos de datos en sus atributos).
 * -------------------------------------------------------------------------
 */
public class Producto {
    
    // Atributos privados (Encapsulamiento)
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor: Proceso de inicialización
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // --- ACCIONES DE ACCESO A DATOS (Getters/Setters) ---

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + " (Stock: " + stock + ")";
    }
}