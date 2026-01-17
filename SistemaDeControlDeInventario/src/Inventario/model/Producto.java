package Inventario.model;

/**
 * -------------------------------------------------------------------------
 * INTEGRANTE: Josue Rojas (Model)
 * PROYECTO: Sistema de Control de Inventario
 * DESCRIPCIÓN: Clase que define la estructura de datos (POJO).
 * -------------------------------------------------------------------------
 */
public class Producto {
    // Atributos encapsulados
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // --- Getters y Setters ---
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Método extra para calcular cuánto dinero hay en este producto
    public double getValorTotal() {
        return precio * stock;
    }

    @Override
    public String toString() {
        return nombre;
    }
}