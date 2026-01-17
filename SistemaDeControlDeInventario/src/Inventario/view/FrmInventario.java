package Inventario.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * -------------------------------------------------------------------------
 * INTEGRANTE: Edwin Guachi
 * PROYECTO: Sistema de Control de Inventario
 * TEMA: Programa que implementa la interfaz grafica para el sistema de inventario
 * -------------------------------------------------------------------------
 */
public class FrmInventario extends JFrame {

    // Crea elemntos graficos
    public JPanel pnlPrincipal;
    public JTextField txtCodigo;
    public JTextField txtNombre;
    public JTextField txtPrecio;
    public JTextField txtStock;
    public JButton btnAgregar;
    public JButton btnLimpiar;
    public JButton btnSalir;
    public JTable tblProductos;
    public DefaultTableModel modeloTabla;

    // Constructor: crea nuevo formulario FrmInventario
    public FrmInventario() {
        setTitle("Sistema de Inventario - Team Java (Josue/Jaime/Edwin/Sebas)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        iniciarComponentes();
    }

    //Metodo inicializa los componentes graficos
    private void iniciarComponentes() {
        pnlPrincipal = new JPanel();
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBackground(new Color(245, 245, 250));

        // Título
        JLabel lblTitulo = new JLabel("CONTROL DE INVENTARIO", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitulo.setForeground(new Color(50, 50, 100));
        lblTitulo.setBounds(50, 20, 600, 30);
        pnlPrincipal.add(lblTitulo);

        //Estructura formulario
        agregarEtiqueta("Código:", 50, 80);
        txtCodigo = agregarCampo(120, 80, 100);

        agregarEtiqueta("Nombre:", 250, 80);
        txtNombre = agregarCampo(320, 80, 250);

        agregarEtiqueta("Precio $:", 50, 130);
        txtPrecio = agregarCampo(120, 130, 100);

        agregarEtiqueta("Stock:", 250, 130);
        txtStock = agregarCampo(320, 130, 100);

        // Crea botones
        btnAgregar = new JButton("GUARDAR");
        btnAgregar.setBounds(50, 180, 200, 40);
        btnAgregar.setBackground(new Color(0, 153, 76));
        btnAgregar.setForeground(Color.BLACK);           
        btnAgregar.setFont(new Font("Arial", Font.BOLD, 12));
        pnlPrincipal.add(btnAgregar);

        btnLimpiar = new JButton("LIMPIAR");
        btnLimpiar.setBounds(270, 180, 150, 40);
        btnLimpiar.setBackground(new Color(255, 204, 0));
        btnLimpiar.setForeground(Color.BLACK);            
        btnLimpiar.setFont(new Font("Arial", Font.BOLD, 12));
        pnlPrincipal.add(btnLimpiar);

        btnSalir = new JButton("SALIR");
        btnSalir.setBounds(440, 180, 150, 40);
        btnSalir.setBackground(new Color(204, 0, 0));
        btnSalir.setForeground(Color.BLACK);     
        btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
        pnlPrincipal.add(btnSalir);

        // Crea la tabla y asigna nombre a columnas
        JLabel lblLista = new JLabel("Listado de Productos:");
        lblLista.setBounds(50, 240, 300, 20);
        lblLista.setFont(new Font("Arial", Font.BOLD, 14));
        pnlPrincipal.add(lblLista);

        String[] columnas = {"Código", "Producto", "Precio", "Stock", "Total ($)"};
        modeloTabla = new DefaultTableModel(null, columnas);
        tblProductos = new JTable(modeloTabla);
        
        JScrollPane scroll = new JScrollPane(tblProductos);
        scroll.setBounds(50, 270, 590, 250);
        pnlPrincipal.add(scroll);

        //Añade panel a la ventana
        this.add(pnlPrincipal);
    }

    //Metodo que agrega etiquetas a panel
    private void agregarEtiqueta(String texto, int x, int y) {
        JLabel lbl = new JLabel(texto);
        lbl.setBounds(x, y, 80, 25);
        pnlPrincipal.add(lbl);
    }

    //Metodo para agregar campos de texto a panel
    private JTextField agregarCampo(int x, int y, int w) {
        JTextField txt = new JTextField();
        txt.setBounds(x, y, w, 25);
        pnlPrincipal.add(txt);
        return txt;
    }
}