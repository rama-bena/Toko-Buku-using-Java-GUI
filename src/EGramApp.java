
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EGramApp extends javax.swing.JFrame {

    ArrayList<Buku> daftarBuku = new ArrayList<>();

    public EGramApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        JTabbedPane1 = new javax.swing.JTabbedPane();
        panelTambahBuku = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        txtTambahJudul = new javax.swing.JTextField();
        txtTambahPengarang = new javax.swing.JTextField();
        txtTambahStok = new javax.swing.JTextField();
        txtTambahHarga = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        panelUbahDiskon = new javax.swing.JPanel();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        txtDiskon = new javax.swing.JTextField();
        javax.swing.JLabel jLabel9 = new javax.swing.JLabel();
        btnUbahDiskon = new javax.swing.JButton();
        panelBeliBuku = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBeliUang = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        labelJudul = new javax.swing.JLabel();
        labelPengarang = new javax.swing.JLabel();
        labelHarga = new javax.swing.JLabel();
        labelHargaAkhir = new javax.swing.JLabel();
        labelStok = new javax.swing.JLabel();
        btnBeli = new javax.swing.JButton();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        labelDiskon = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Electronic Gramedai");

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul", "Pengarang", "Stok", "Harga", "Harga Akhir"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        JTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabbedPane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JTabbedPane1MouseEntered(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Judul");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pengarang");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Stok");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Harga");

        txtTambahStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTambahStokKeyPressed(evt);
            }
        });

        txtTambahHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTambahHargaKeyPressed(evt);
            }
        });

        btnTambah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTambahBukuLayout = new javax.swing.GroupLayout(panelTambahBuku);
        panelTambahBuku.setLayout(panelTambahBukuLayout);
        panelTambahBukuLayout.setHorizontalGroup(
            panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTambahBukuLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addComponent(jLabel3))
                        .addGroup(panelTambahBukuLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(38, 38, 38)))
                    .addGroup(panelTambahBukuLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)))
                .addGap(31, 31, 31)
                .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTambah)
                    .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTambahHarga)
                        .addComponent(txtTambahStok)
                        .addComponent(txtTambahPengarang)
                        .addComponent(txtTambahJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        panelTambahBukuLayout.setVerticalGroup(
            panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTambahBukuLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTambahJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTambahBukuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTambahPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTambahStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelTambahBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTambahHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addGap(78, 78, 78))
        );

        JTabbedPane1.addTab("Tambah Buku", panelTambahBuku);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Diskon ");

        txtDiskon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDiskon.setText("0");
        txtDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiskonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("%");

        btnUbahDiskon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUbahDiskon.setText("Ubah");
        btnUbahDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahDiskonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUbahDiskonLayout = new javax.swing.GroupLayout(panelUbahDiskon);
        panelUbahDiskon.setLayout(panelUbahDiskonLayout);
        panelUbahDiskonLayout.setHorizontalGroup(
            panelUbahDiskonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUbahDiskonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUbahDiskonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUbahDiskon)
                    .addGroup(panelUbahDiskonLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        panelUbahDiskonLayout.setVerticalGroup(
            panelUbahDiskonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUbahDiskonLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelUbahDiskonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(44, 44, 44)
                .addComponent(btnUbahDiskon)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        JTabbedPane1.addTab("Ubah Diskon", panelUbahDiskon);

        panelBeliBuku.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelBeliBukuMouseMoved(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Uang anda : ");

        txtBeliUang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBeliUang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeliUangActionPerformed(evt);
            }
        });
        txtBeliUang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBeliUangKeyPressed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Judul");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pengarang");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Stok");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Harga");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Harga Akhir");

        labelJudul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelJudul.setText("-");

        labelPengarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPengarang.setText("-");

        labelHarga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHarga.setText("-");

        labelHargaAkhir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHargaAkhir.setText("-");

        labelStok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelStok.setText("-");

        btnBeli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBeli.setText("Beli");
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBeliBukuLayout = new javax.swing.GroupLayout(panelBeliBuku);
        panelBeliBuku.setLayout(panelBeliBukuLayout);
        panelBeliBukuLayout.setHorizontalGroup(
            panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBeliBukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBeliBukuLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBeliBukuLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBeliUang, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCari)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBeliBukuLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBeliBukuLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBeliBukuLayout.createSequentialGroup()
                        .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBeliBukuLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBeliBukuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(32, 32, 32)))
                        .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelHargaAkhir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelStok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBeliBukuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBeli, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBeliBukuLayout.setVerticalGroup(
            panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBeliBukuLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBeliUang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addGap(27, 27, 27)
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labelJudul))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPengarang)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labelStok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(labelHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBeliBukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHargaAkhir)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBeli)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        JTabbedPane1.addTab("Beli Buku", panelBeliBuku);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Diskon");

        labelDiskon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDiskon.setText("0");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelDiskon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addComponent(jLabel6))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // kalau ada yang kosong
        if (txtTambahJudul.getText().equals("") || txtTambahPengarang.getText().equals("") || txtTambahStok.getText().equals("") || txtTambahHarga.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan semua input");
        } else {
            String judul = txtTambahJudul.getText();
            String pengarang = txtTambahPengarang.getText();
            int stok = Integer.parseInt(txtTambahStok.getText());
            double harga = Double.parseDouble(txtTambahHarga.getText());
            daftarBuku.add(new Buku(judul, pengarang, stok, harga));

            Collections.sort(daftarBuku);

            updateTabel(daftarBuku);
            txtTambahJudul.setText("");
            txtTambahPengarang.setText("");
            txtTambahStok.setText("");
            txtTambahHarga.setText("");
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiskonActionPerformed

    }//GEN-LAST:event_txtDiskonActionPerformed

    private void btnUbahDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahDiskonActionPerformed

        String diskon = txtDiskon.getText();

        if (diskon.equals("")) {
            JOptionPane.showMessageDialog(this, "Masukkan input");
            return;
        }
        labelDiskon.setText(diskon);

        Buku.setDiskon(Double.parseDouble(diskon));
        txtDiskon.setText("");

        updateTabel(daftarBuku);
    }//GEN-LAST:event_btnUbahDiskonActionPerformed

    private void txtTambahStokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTambahStokKeyPressed
        int length = txtTambahStok.getText().length();
        char tombol = evt.getKeyChar();

        if (tombol >= '0' && tombol <= '9') {
            if (length < 3) {
                txtTambahStok.setEditable(true);
            } else {
                txtTambahStok.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtTambahStok.setEditable(true);
            } else {
                txtTambahStok.setEditable(false);
            }
        }

    }//GEN-LAST:event_txtTambahStokKeyPressed

    private void txtTambahHargaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTambahHargaKeyPressed
        int length = txtTambahHarga.getText().length();
        char tombol = evt.getKeyChar();

        if (tombol >= '0' && tombol <= '9') {
            if (length < 7) { //maksimal harga 9.999.999
                txtTambahHarga.setEditable(true);
            } else {
                txtTambahHarga.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtTambahHarga.setEditable(true);
            } else {
                txtTambahHarga.setEditable(false);
            }
        }
    }//GEN-LAST:event_txtTambahHargaKeyPressed

    private void txtBeliUangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeliUangActionPerformed
       
        String sUang = txtBeliUang.getText();
        
        if(sUang.equals("")){
            updateTabel(daftarBuku);
            return;
        }
        
        int uang = Integer.parseInt(sUang);
        
        ArrayList<Buku> bisaBeli = new ArrayList<>();
        
        daftarBuku.stream().filter((buku) -> (buku.hargaAkhir() <= (double)(uang*1.0))).forEachOrdered((buku) -> {
            bisaBeli.add(buku);
        });
        updateTabel(bisaBeli);
        
        
        
    }//GEN-LAST:event_txtBeliUangActionPerformed

    private void txtBeliUangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBeliUangKeyPressed
        int length = txtBeliUang.getText().length();
        char tombol = evt.getKeyChar();

        if (tombol >= '0' && tombol <= '9') {
            if (length < 7) { //maksimal harga 9.999.999
                txtBeliUang.setEditable(true);
            } else {
                txtBeliUang.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtBeliUang.setEditable(true);
            } else {
                txtBeliUang.setEditable(false);
            }
        }
        
    }//GEN-LAST:event_txtBeliUangKeyPressed

    private void JTabbedPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabbedPane1MouseEntered

    }//GEN-LAST:event_JTabbedPane1MouseEntered

    private void panelBeliBukuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBeliBukuMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panelBeliBukuMouseMoved

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        txtBeliUangActionPerformed(evt);
    }//GEN-LAST:event_btnCariActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        DefaultTableModel tbl = (DefaultTableModel)tabel.getModel();
        
        if(tabel.getSelectedRowCount() == 1){
            String judul = tbl.getValueAt(tabel.getSelectedRow(),0).toString() ;
            String pengarang = tbl.getValueAt(tabel.getSelectedRow(),1).toString() ;
            String stok = tbl.getValueAt(tabel.getSelectedRow(),2).toString() ;
            String harga = tbl.getValueAt(tabel.getSelectedRow(),3).toString() ;
            String hargaAkhir = tbl.getValueAt(tabel.getSelectedRow(),4).toString() ;
            
            labelJudul.setText(judul);
            labelPengarang.setText(pengarang);
            labelStok.setText(stok);
            labelHarga.setText(harga);
            labelHargaAkhir.setText(hargaAkhir);
            
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        String sUang = txtBeliUang.getText();
        String sHargaAkhir = labelHargaAkhir.getText();
        String judul = labelJudul.getText();
        if(sUang.equals("")){
            JOptionPane.showMessageDialog(this, "Masukkan uang anda");
            return;
        }
        if(sHargaAkhir.equals("-")){
            JOptionPane.showMessageDialog(this, "Pilih salah satu buku dari daftar");
            return;
        }
        double uang = Double.parseDouble(sUang);
        double hargaAkhir = Double.parseDouble(sHargaAkhir);
        
        if(uang < hargaAkhir){
            JOptionPane.showMessageDialog(this, "Uang anda tidak cukup");
            return;
        }
        
        for(Buku buku : daftarBuku){
            if(buku.getJudul().equals(judul)){
                buku.kurangStok(1);
                if(buku.getStok() == 0){
                    daftarBuku.remove(buku);
                }
                break;
            }
        }
        updateTabel(daftarBuku);
        
        labelJudul.setText("-");
        labelPengarang.setText("-");
        labelStok.setText("-");
        labelHarga.setText("-");
        labelHargaAkhir.setText("-");
        txtBeliUang.setText("");
        
        JOptionPane.showMessageDialog(this, "Buku berhasil dibeli");
        
    }//GEN-LAST:event_btnBeliActionPerformed

    private void JTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabbedPane1MouseClicked
        // TODO add your handling code here:
        updateTabel(daftarBuku);
    }//GEN-LAST:event_JTabbedPane1MouseClicked

    private void ubahDiskon(double diskon) {
        labelDiskon.setText(Double.toString(diskon));
    }

    private void updateTabel(ArrayList<Buku> daftar) {
        DefaultTableModel tbl = (DefaultTableModel) tabel.getModel();
        int banyakBaris = tabel.getRowCount();

        for (int i = 0; i < banyakBaris; i++) {
            tbl.removeRow(0);
        }

        for (int i = 0; i < daftar.size(); i++) {
            String[] data = daftar.get(i).toArray();
            tbl.addRow(data);
        }
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EGramApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EGramApp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane JTabbedPane1;
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbahDiskon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDiskon;
    private javax.swing.JLabel labelHarga;
    private javax.swing.JLabel labelHargaAkhir;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelPengarang;
    private javax.swing.JLabel labelStok;
    private javax.swing.JPanel panelBeliBuku;
    private javax.swing.JPanel panelTambahBuku;
    private javax.swing.JPanel panelUbahDiskon;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtBeliUang;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtTambahHarga;
    private javax.swing.JTextField txtTambahJudul;
    private javax.swing.JTextField txtTambahPengarang;
    private javax.swing.JTextField txtTambahStok;
    // End of variables declaration//GEN-END:variables
}
