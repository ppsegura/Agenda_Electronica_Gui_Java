package gui;

import javax.swing.*;

public class Principal extends JFrame{
    private JPanel panel1;
    private JTextField txt_dni,txt_direccion,txt_nombre,txt_telefono,txt_fecha_nac,txt_apellido,txt_indice;
    private JButton btnGuardar,btn_adelante,btn_atras;
    private JLabel lbl_dni,lbl_apellido,lbl_nombre,lbl_direccion,lbl_telefono,lbl_fecha_nac;

    // Variables Globales
    String [] dnis = new String[10];
    String [] nombres = new String[10];
    String [] apellidos = new String[10];
    String [] direcciones = new String[10];
    String [] telefonos = new String[10];
    String [] fecha_nac = new String[10];
    String indice;
    int indi;

    public Principal(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();

        btn_atras.addActionListener(e -> {
            indice = txt_indice.getText();
            indi = Integer.parseInt(indice);

            if(indi>0){
                indi--;
                indice = String.valueOf(indi);
                txt_indice.setText(indice);

                txt_dni.setText(dnis[indi]);
                txt_nombre.setText(nombres[indi]);
                txt_apellido.setText(apellidos[indi]);
                txt_direccion.setText(direcciones[indi]);
                txt_telefono.setText(telefonos[indi]);
                txt_fecha_nac.setText(fecha_nac[indi]);
            }

        });

        btn_adelante.addActionListener(e -> {

            indice = txt_indice.getText();
            indi = Integer.parseInt(indice);

            if(indi<9){
                indi++;
                indice = String.valueOf(indi);
                txt_indice.setText(indice);

                txt_dni.setText(dnis[indi]);
                txt_nombre.setText(nombres[indi]);
                txt_apellido.setText(apellidos[indi]);
                txt_direccion.setText(direcciones[indi]);
                txt_telefono.setText(telefonos[indi]);
                txt_fecha_nac.setText(fecha_nac[indi]);
            }

        });

        btnGuardar.addActionListener(e -> {

            indice = txt_indice.getText();
            indi = Integer.parseInt(indice);

            dnis[indi] = txt_dni.getText();
            nombres[indi] = txt_nombre.getText();
            apellidos[indi] = txt_apellido.getText();
            direcciones[indi] = txt_direccion.getText();
            telefonos[indi] = txt_telefono.getText();
            fecha_nac[indi] = txt_fecha_nac.getText();

        });

    }

}
