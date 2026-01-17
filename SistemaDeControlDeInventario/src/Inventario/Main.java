package Inventario;

import Inventario.controller.InventarioController;
import Inventario.view.FrmInventario;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar la Vista
        FrmInventario vista = new FrmInventario();
        
        // 2. Instanciar el Controlador
        InventarioController controlador = new InventarioController(vista);
        
        // 3. Iniciar
        controlador.iniciar();
    }
}