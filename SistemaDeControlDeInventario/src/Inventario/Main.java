package Inventario;

import Inventario.controller.InventarioController;
import Inventario.view.FrmInventario;

/**
 * -------------------------------------------------------------------------
 * CLASE PRINCIPAL
 * PROYECTO: Sistema de Control de Inventario
 * DESCRIPCIÓN: Punto de arranque de la aplicación.
 * Integración de componentes MVC (Modelo, Vista, Controlador).
 * -------------------------------------------------------------------------
 */
public class Main {
    //Metodo principal
    public static void main(String[] args) {
        
        // define el aspecto de windows
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // usa el aspecto por defecto
        }

        // Conecta vista con controlador
        FrmInventario vista = new FrmInventario();
        InventarioController controlador = new InventarioController(vista);
        
        // Muestra la ventana
        controlador.iniciar();
    }
}