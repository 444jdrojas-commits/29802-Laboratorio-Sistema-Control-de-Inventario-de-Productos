package Inventario.controller;

import Inventario.model.Inventario; 
import Inventario.model.Producto;  
import Inventario.view.FrmInventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * INTEGRANTE: Jaime (Controller)
 * ACTUALIZACIÓN: Ahora integra el trabajo de Sebas, Josue y Edwin.
 */
public class InventarioController implements ActionListener {

    private FrmInventario vista;
    private Inventario modeloSebas; // <--- Usamos la clase de Sebas

    public InventarioController(FrmInventario vista) {
        this.vista = vista;
        this.modeloSebas = new Inventario(); // <--- Instanciamos a Sebas

        this.vista.btnAgregar.addActionListener(this);
        this.vista.btnLimpiar.addActionListener(this);
        this.vista.btnSalir.addActionListener(this);
    }

    public void iniciar() {
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAgregar) {
            agregarProducto();
        }
        //  resto de botones igual
        if (e.getSource() == vista.btnLimpiar) limpiarCampos();
        if (e.getSource() == vista.btnSalir) System.exit(0);
    }

    private void agregarProducto() {
        try {
            // 1. Datos de la Vista 
            String codigo = vista.txtCodigo.getText();
            String nombre = vista.txtNombre.getText();
            double precio = Double.parseDouble(vista.txtPrecio.getText());
            int stock = Integer.parseInt(vista.txtStock.getText());

            // 2. Crear Objeto 
            Producto nuevoProducto = new Producto(codigo, nombre, precio, stock);
            
            // 3. Guardar usando la clase Inventario
            modeloSebas.agregarProducto(nuevoProducto);

            // 4. Actualizar Tabla
            agregarFilaTabla(nuevoProducto);
            
            // Extra: Mostrar mensaje con total 
            double totalBodega = modeloSebas.calcularValorTotalBodega();
            JOptionPane.showMessageDialog(vista, "Guardado.\nValor Total en Bodega: $" + totalBodega);
            
            limpiarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error en datos: " + ex.getMessage());
        }
    }

    private void agregarFilaTabla(Producto p) {
        
        Object[] fila = {p.getCodigo(), p.getNombre(), p.getPrecio(), p.getStock(), p.getValorTotal()};
        vista.modeloTabla.addRow(fila);
    }
    
    private void limpiarCampos() {
        vista.txtCodigo.setText("");
        vista.txtNombre.setText("");
        vista.txtPrecio.setText("");
        vista.txtStock.setText("");
    }
}