package Inventario;

import Inventario.controller.InventarioController;
import Inventario.view.FrmInventario;

/**
 * -------------------------------------------------------------------------
 * CLASE PRINCIPAL (ENTRY POINT)
 * PROYECTO: Sistema de Control de Inventario
 * DESCRIPCIÓN: Punto de arranque de la aplicación.
 * Integración de componentes MVC (Modelo, Vista, Controlador).
 * -------------------------------------------------------------------------
 */
public class Main {
    public static void main(String[] args) {
        
        // Estética: Poner el diseño nativo de Windows/Mac para que se vea Pro
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            // Si falla, no importa, usa el diseño por defecto de Java
        }

        // 1. Instanciar la VISTA (Trabajo de Edwin)
        FrmInventario vista = new FrmInventario();
        
        // 2. Instanciar el CONTROLADOR (Trabajo de Jaime)
        // Se le pasa la vista para que el controlador tenga el control de la ventana
        InventarioController controlador = new InventarioController(vista);
        
        // 3. INICIAR EL SISTEMA
        controlador.iniciar();
    }
}