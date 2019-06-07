
import java.awt.*;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_Creacion_Clientes = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        Genero = new javax.swing.JLabel();
        Genero1 = new javax.swing.JLabel();
        rb_M = new javax.swing.JRadioButton();
        rb_F = new javax.swing.JRadioButton();
        rb_Salmon = new javax.swing.JRadioButton();
        rb_Res = new javax.swing.JRadioButton();
        rb_Tortilla = new javax.swing.JRadioButton();
        rb_Polo_Pure = new javax.swing.JRadioButton();
        rb_Espaguetis = new javax.swing.JRadioButton();
        rb_Hamburgesa = new javax.swing.JRadioButton();
        rb_Pollo = new javax.swing.JRadioButton();
        rb_Capirotada = new javax.swing.JRadioButton();
        tf_Nombre_Cliente = new javax.swing.JTextField();
        tf_Edad_Cliente = new javax.swing.JTextField();
        Genero2 = new javax.swing.JLabel();
        Genero3 = new javax.swing.JLabel();
        Genero4 = new javax.swing.JLabel();
        Genero5 = new javax.swing.JLabel();
        rb_Pie_Limon = new javax.swing.JRadioButton();
        rb_Codero = new javax.swing.JRadioButton();
        rb_Huevos = new javax.swing.JRadioButton();
        rb_Cheesecake = new javax.swing.JRadioButton();
        rb_Anafre = new javax.swing.JRadioButton();
        rb_Crepa = new javax.swing.JRadioButton();
        rb_Empanada = new javax.swing.JRadioButton();
        rb_Tiramiso = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        bt_Crear_Clientes = new javax.swing.JButton();
        bt_Volver_Cliente = new javax.swing.JButton();
        bg_Genero_Clientes = new javax.swing.ButtonGroup();
        bg_Sopas = new javax.swing.ButtonGroup();
        bg_Plato_Fuerte = new javax.swing.ButtonGroup();
        bg_Postres = new javax.swing.ButtonGroup();
        bg_Entradas = new javax.swing.ButtonGroup();
        bg_Genero_Chefs = new javax.swing.ButtonGroup();
        bt_Crear_Cliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bt_Avanzar = new javax.swing.JButton();
        pb_Ordenes = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_Chefs = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_Clientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_Platillos_Clientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("Nombre");

        Genero.setText("Genero");

        Genero1.setText("Edad");

        bg_Genero_Clientes.add(rb_M);
        rb_M.setSelected(true);
        rb_M.setText("Masculino");

        bg_Genero_Clientes.add(rb_F);
        rb_F.setText("Femenino");

        bg_Plato_Fuerte.add(rb_Salmon);
        rb_Salmon.setText("Salmon");

        bg_Sopas.add(rb_Res);
        rb_Res.setText("Res");

        bg_Sopas.add(rb_Tortilla);
        rb_Tortilla.setText("Tortilla");

        bg_Plato_Fuerte.add(rb_Polo_Pure);
        rb_Polo_Pure.setText("Pollo con pure");

        bg_Plato_Fuerte.add(rb_Espaguetis);
        rb_Espaguetis.setText("Espaguetis");

        bg_Plato_Fuerte.add(rb_Hamburgesa);
        rb_Hamburgesa.setText("Hamburguesa");

        bg_Sopas.add(rb_Pollo);
        rb_Pollo.setText("Pollo");

        bg_Sopas.add(rb_Capirotada);
        rb_Capirotada.setText("Capirotada");

        Genero2.setText("Sopas");

        Genero3.setText("Palto Fuerte");

        Genero4.setText("Entradas");

        Genero5.setText("Postres");

        bg_Postres.add(rb_Pie_Limon);
        rb_Pie_Limon.setText("Pie de Limón");

        bg_Plato_Fuerte.add(rb_Codero);
        rb_Codero.setText("Cordero");

        bg_Entradas.add(rb_Huevos);
        rb_Huevos.setText("Huevos Rellenos");

        bg_Postres.add(rb_Cheesecake);
        rb_Cheesecake.setText("Cheesecake");

        bg_Entradas.add(rb_Anafre);
        rb_Anafre.setText("Anafre Parisiense");

        bg_Postres.add(rb_Crepa);
        rb_Crepa.setText("Crepa");

        bg_Entradas.add(rb_Empanada);
        rb_Empanada.setText("Empanada");

        bg_Postres.add(rb_Tiramiso);
        rb_Tiramiso.setText("Tiramisú");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Creacion de Clientes con sus platillos");

        bt_Crear_Clientes.setText("Crear");
        bt_Crear_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_ClientesActionPerformed(evt);
            }
        });

        bt_Volver_Cliente.setText("Volver");
        bt_Volver_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Volver_ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_Creacion_ClientesLayout = new javax.swing.GroupLayout(jd_Creacion_Clientes.getContentPane());
        jd_Creacion_Clientes.getContentPane().setLayout(jd_Creacion_ClientesLayout);
        jd_Creacion_ClientesLayout.setHorizontalGroup(
            jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(Genero1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_Edad_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(Genero)
                        .addGap(18, 18, 18)
                        .addComponent(rb_M)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_F))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(Genero2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Tortilla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Res)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Pollo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Capirotada)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(Genero4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Anafre)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Empanada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Huevos))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(Genero5)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Pie_Limon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Cheesecake)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Tiramiso)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Crepa))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(Genero3)
                        .addGap(18, 18, 18)
                        .addComponent(rb_Polo_Pure)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Espaguetis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Hamburgesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_Salmon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb_Codero))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                        .addComponent(bt_Crear_Clientes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_Volver_Cliente)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jd_Creacion_ClientesLayout.setVerticalGroup(
            jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_Creacion_ClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(38, 38, 38)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_Nombre_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero)
                    .addComponent(rb_M)
                    .addComponent(rb_F))
                .addGap(23, 23, 23)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Genero1)
                    .addComponent(tf_Edad_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero2)
                    .addComponent(rb_Tortilla)
                    .addComponent(rb_Res)
                    .addComponent(rb_Pollo)
                    .addComponent(rb_Capirotada))
                .addGap(24, 24, 24)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero3)
                    .addComponent(rb_Polo_Pure)
                    .addComponent(rb_Espaguetis)
                    .addComponent(rb_Hamburgesa)
                    .addComponent(rb_Salmon)
                    .addComponent(rb_Codero))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero5)
                    .addComponent(rb_Pie_Limon)
                    .addComponent(rb_Cheesecake)
                    .addComponent(rb_Tiramiso)
                    .addComponent(rb_Crepa))
                .addGap(28, 28, 28)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Genero4)
                    .addComponent(rb_Anafre)
                    .addComponent(rb_Empanada)
                    .addComponent(rb_Huevos))
                .addGap(31, 31, 31)
                .addGroup(jd_Creacion_ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Crear_Clientes)
                    .addComponent(bt_Volver_Cliente))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_Crear_Cliente.setText("Crear Cliente");
        bt_Crear_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_Crear_ClienteActionPerformed(evt);
            }
        });

        jButton2.setText("Crear Chef");

        bt_Avanzar.setText("Ordenar");

        jl_Chefs.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(jl_Chefs);

        jl_Clientes.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_Clientes);

        jLabel1.setText("Barra de Platillos");

        jLabel2.setText("Clientes");

        jt_Platillos_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Preparacion Min.", "Id", "Elaboracion", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_Platillos_Clientes);

        jLabel3.setText("Chefs");

        jLabel4.setText("Platillos Listos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_Avanzar)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(bt_Crear_Cliente))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pb_Ordenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(bt_Crear_Cliente)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_Avanzar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(pb_Ordenes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_Crear_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_ClientesActionPerformed
        //Lista de Clientes
        DefaultListModel modelo = (DefaultListModel) jl_Clientes.getModel();

        //Cliente
        String nombre = tf_Nombre_Cliente.getText();
        int edad = Integer.parseInt(tf_Edad_Cliente.getText());
        String genero = "";

        //Platillos
        Date fecha = new Date();
        GregorianCalendar d = new GregorianCalendar();
        fecha = d.getTime();

        //Llenado de info
        if (rb_M.isSelected()) {
            genero = "Masculino";
        } else if (rb_F.isSelected()) {
            genero = "Femenino";
        } else {
            bt_Crear_Cliente.setEnabled(false);
            JOptionPane.showMessageDialog(jd_Creacion_Clientes, "Debe de seleccionar un genero");
        }
        Cliente p = new Cliente(nombre, edad, genero);

        //Platillos
        if (rb_Anafre.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(5, "Entradas", fecha, Color.getColor("brown"), "Anafre Prisiense");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Capirotada.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(7, "Sopas", fecha, Color.white, "Sopa de Capirotada");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Cheesecake.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(8, "Postres", fecha, Color.red, "Cheesecake");
            p.getPlatilos().add(m);
            cl.add(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Codero.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(16, "Plato Fuerte", fecha, Color.white, "Cordero");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Crepa.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(6, "Postres", fecha, Color.yellow, "Crepa");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Empanada.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(7, "Entradas", fecha, Color.red, "Empanada");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Espaguetis.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(13, "Plato Fuerte", fecha, Color.red, "Espaguesti");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Hamburgesa.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(11, "Plato Fuerte", fecha, Color.yellow, "Hamburgesa");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Huevos.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(3, "Entradas", fecha, Color.white, "Huevos Rellenos");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Pie_Limon.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(7, "Postres", fecha, Color.green, "Pie de Limon");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Pollo.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(10, "Sopas", fecha, Color.yellow, "Pollo");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Polo_Pure.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(15, "Plato Fuerte", fecha, Color.getColor("brown"), "Anafre Prisiense");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Res.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(12, "Sopas", fecha, Color.getColor("brown"), "Res");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Salmon.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(18, "Plato Fuerte", fecha, Color.pink, "Salmon");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Tiramiso.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(9, "Postres", fecha, Color.getColor("brown"), "Tiramisu");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else if (rb_Tortilla.isSelected()) {
            fecha = new Date();
            d = new GregorianCalendar();
            fecha = d.getTime();
            Menu m = new Menu(9, "Sopas", fecha, Color.red, "Tortilla");
            p.getPlatilos().add(m);
            cl.add(p);
            modelo.addElement(p);
            jl_Clientes.setModel(modelo);

        } else {
            bt_Crear_Cliente.setEnabled(false);
            JOptionPane.showMessageDialog(jd_Creacion_Clientes, "Debe de escoger un platillo de cada tipo ");
        }//Fin del if que ayuda con los platillos

        ADMP ap = new ADMP("./personas.shay");
        ap.cargarArchivo();
        ap.setListap(p);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(jd_Creacion_Clientes, "Cliente Creado exitosamente");

        //Reinicio de la info del cliente
        tf_Nombre_Cliente.setText("");
        tf_Edad_Cliente.setText("");
        rb_M.setSelected(true);
        rb_F.setSelected(false);

        //Reinicio de los platillos
        rb_Anafre.setSelected(false);
        rb_Capirotada.setSelected(false);
        rb_Cheesecake.setSelected(false);
        rb_Codero.setSelected(false);
        rb_Crepa.setSelected(false);
        rb_Empanada.setSelected(false);
        rb_Espaguetis.setSelected(false);
        rb_Hamburgesa.setSelected(false);
        rb_Huevos.setSelected(false);
        rb_Pie_Limon.setSelected(false);
        rb_Pollo.setSelected(false);
        rb_Polo_Pure.setSelected(false);
        rb_Res.setSelected(false);
        rb_Salmon.setSelected(false);
        rb_Tiramiso.setSelected(false);
        rb_Tortilla.setSelected(false);
    }//GEN-LAST:event_bt_Crear_ClientesActionPerformed

    private void bt_Volver_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Volver_ClienteActionPerformed
        // TODO add your handling code here:
        jd_Creacion_Clientes.dispose();
    }//GEN-LAST:event_bt_Volver_ClienteActionPerformed

    private void bt_Crear_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_Crear_ClienteActionPerformed
        // TODO add your handling code here:
        jd_Creacion_Clientes.setModal(true);
        jd_Creacion_Clientes.pack();
        jd_Creacion_Clientes.setLocationRelativeTo(this);
        jd_Creacion_Clientes.setVisible(true);
    }//GEN-LAST:event_bt_Crear_ClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Genero;
    private javax.swing.JLabel Genero1;
    private javax.swing.JLabel Genero2;
    private javax.swing.JLabel Genero3;
    private javax.swing.JLabel Genero4;
    private javax.swing.JLabel Genero5;
    private javax.swing.ButtonGroup bg_Entradas;
    private javax.swing.ButtonGroup bg_Genero_Chefs;
    private javax.swing.ButtonGroup bg_Genero_Clientes;
    private javax.swing.ButtonGroup bg_Plato_Fuerte;
    private javax.swing.ButtonGroup bg_Postres;
    private javax.swing.ButtonGroup bg_Sopas;
    private javax.swing.JButton bt_Avanzar;
    private javax.swing.JButton bt_Crear_Cliente;
    private javax.swing.JButton bt_Crear_Clientes;
    private javax.swing.JButton bt_Volver_Cliente;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_Creacion_Clientes;
    private javax.swing.JList<String> jl_Chefs;
    private javax.swing.JList<String> jl_Clientes;
    private javax.swing.JTable jt_Platillos_Clientes;
    private javax.swing.JProgressBar pb_Ordenes;
    private javax.swing.JRadioButton rb_Anafre;
    private javax.swing.JRadioButton rb_Capirotada;
    private javax.swing.JRadioButton rb_Cheesecake;
    private javax.swing.JRadioButton rb_Codero;
    private javax.swing.JRadioButton rb_Crepa;
    private javax.swing.JRadioButton rb_Empanada;
    private javax.swing.JRadioButton rb_Espaguetis;
    private javax.swing.JRadioButton rb_F;
    private javax.swing.JRadioButton rb_Hamburgesa;
    private javax.swing.JRadioButton rb_Huevos;
    private javax.swing.JRadioButton rb_M;
    private javax.swing.JRadioButton rb_Pie_Limon;
    private javax.swing.JRadioButton rb_Pollo;
    private javax.swing.JRadioButton rb_Polo_Pure;
    private javax.swing.JRadioButton rb_Res;
    private javax.swing.JRadioButton rb_Salmon;
    private javax.swing.JRadioButton rb_Tiramiso;
    private javax.swing.JRadioButton rb_Tortilla;
    private javax.swing.JTextField tf_Edad_Cliente;
    private javax.swing.JTextField tf_Nombre_Cliente;
    // End of variables declaration//GEN-END:variables
private ArrayList<Cliente> cl = new ArrayList();
}
