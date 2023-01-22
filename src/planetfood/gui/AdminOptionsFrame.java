/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.gui;

import java.awt.Color;
import javax.swing.JOptionPane;
import planetfood.pojo.UserProfile;

/**
 *
 * @author Jonty
 */
public class AdminOptionsFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public AdminOptionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lbAdmin.setText("Hello " + s1);
    }
    String s1= UserProfile.getUsername();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jrAddEmp = new javax.swing.JRadioButton();
        jrViewEmp = new javax.swing.JRadioButton();
        jrEditEmp = new javax.swing.JRadioButton();
        jrRemoveEmp = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jrRegisterCashier = new javax.swing.JRadioButton();
        jrRemoveCashier = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        jrViewOrder = new javax.swing.JRadioButton();
        jrViewDatewise = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jrAddCategory = new javax.swing.JRadioButton();
        jrEditCategory = new javax.swing.JRadioButton();
        jrViewCategory = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jrAddProduct = new javax.swing.JRadioButton();
        jrViewProduct = new javax.swing.JRadioButton();
        jrEditProduct = new javax.swing.JRadioButton();
        jrRemoveProduct = new javax.swing.JRadioButton();
        btnQuit = new javax.swing.JButton();
        btnDoTask = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbAdmin = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetfood/Icon/AdminOptions.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PLANET FOOD ADMIN PANEL");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Make A Choice");

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Emp Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jrAddEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddEmp);
        jrAddEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrAddEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrAddEmp.setText("Add Emp");

        jrViewEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewEmp);
        jrViewEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrViewEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrViewEmp.setText("View Emp");

        jrEditEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditEmp);
        jrEditEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrEditEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrEditEmp.setText("Edit Emp");
        jrEditEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditEmpActionPerformed(evt);
            }
        });

        jrRemoveEmp.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemoveEmp);
        jrRemoveEmp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrRemoveEmp.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveEmp.setText("Remove Emp");
        jrRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRemoveEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddEmp)
                    .addComponent(jrRemoveEmp)
                    .addComponent(jrViewEmp)
                    .addComponent(jrEditEmp))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditEmp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveEmp)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cashier Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jrRegisterCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRegisterCashier);
        jrRegisterCashier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrRegisterCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrRegisterCashier.setText("Register Cashier");

        jrRemoveCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemoveCashier);
        jrRemoveCashier.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrRemoveCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveCashier.setText("Remove Cashier");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrRegisterCashier)
                    .addComponent(jrRemoveCashier))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jrRegisterCashier)
                .addGap(18, 18, 18)
                .addComponent(jrRemoveCashier)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jrViewOrder.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewOrder);
        jrViewOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        jrViewOrder.setText("View Orders");

        jrViewDatewise.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewDatewise);
        jrViewDatewise.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrViewDatewise.setForeground(new java.awt.Color(255, 255, 255));
        jrViewDatewise.setText("View DateWise");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewOrder)
                    .addComponent(jrViewDatewise))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jrViewOrder)
                .addGap(18, 18, 18)
                .addComponent(jrViewDatewise)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jrAddCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddCategory);
        jrAddCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrAddCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrAddCategory.setText("Add Category");

        jrEditCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditCategory);
        jrEditCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrEditCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrEditCategory.setText("Edit Category");
        jrEditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditCategoryActionPerformed(evt);
            }
        });

        jrViewCategory.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewCategory);
        jrViewCategory.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrViewCategory.setForeground(new java.awt.Color(255, 255, 255));
        jrViewCategory.setText("View Category");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAddCategory)
                    .addComponent(jrEditCategory)
                    .addComponent(jrViewCategory))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditCategory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewCategory)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(255, 255, 255));

        jrAddProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAddProduct);
        jrAddProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrAddProduct.setText("Add Product");

        jrViewProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrViewProduct);
        jrViewProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrViewProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrViewProduct.setText("View Product");

        jrEditProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrEditProduct);
        jrEditProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrEditProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrEditProduct.setText("Edit Product");
        jrEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEditProductActionPerformed(evt);
            }
        });

        jrRemoveProduct.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrRemoveProduct);
        jrRemoveProduct.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jrRemoveProduct.setForeground(new java.awt.Color(255, 255, 255));
        jrRemoveProduct.setText("Remove Product");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrViewProduct)
                    .addComponent(jrEditProduct)
                    .addComponent(jrAddProduct)
                    .addComponent(jrRemoveProduct))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jrAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrViewProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrEditProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrRemoveProduct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnQuit.setBackground(new java.awt.Color(0, 102, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnDoTask.setBackground(new java.awt.Color(0, 102, 102));
        btnDoTask.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDoTask.setForeground(new java.awt.Color(255, 255, 255));
        btnDoTask.setText("Do Task");
        btnDoTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoTaskActionPerformed(evt);
            }
        });

        lbAdmin.setBackground(new java.awt.Color(0, 102, 102));
        lbAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAdmin.setForeground(new java.awt.Color(255, 255, 255));

        lblLogout.setBackground(new java.awt.Color(0, 102, 102));
        lblLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setText("LOGOUT");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 617, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnDoTask, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogout))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoTask)
                    .addComponent(btnQuit))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrEditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditCategoryActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
       int result= JOptionPane.showConfirmDialog(null,"Are you sure you want to quit?", "CONFIRM QUIT", JOptionPane.YES_NO_OPTION);
       if(result == JOptionPane.YES_OPTION)
           System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jrEditEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditEmpActionPerformed

    private void jrRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRemoveEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrRemoveEmpActionPerformed

    private void jrEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEditProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEditProductActionPerformed

    private void btnDoTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoTaskActionPerformed
        if(jrAddEmp.isSelected()){
            AddEmpFrame frame1= new AddEmpFrame();
            frame1.setVisible(true);
            this.dispose();
        }
        
        else if(jrViewEmp.isSelected()){
            ViewEmpFrame frame2= new ViewEmpFrame();
            frame2.setVisible(true);
            this.dispose();
        }
        
        else if(jrEditEmp.isSelected()){
            EditEmpFrame frame3= new EditEmpFrame();
            frame3.setVisible(true);
            this.dispose();
        }
        
        else if(jrRemoveEmp.isSelected()){
            RemoveEmpFrame frame4= new RemoveEmpFrame();
            frame4.setVisible(true);
            this.dispose();
        }
        
        else if(jrRegisterCashier.isSelected()){
            RegisterCashierFrame frame5= new RegisterCashierFrame();
            frame5.setVisible(true);
            this.dispose();
        }
        
        else if(jrRemoveCashier.isSelected()){
            RemoveCashierFrame frame6= new RemoveCashierFrame();
            frame6.setVisible(true);
            this.dispose();
        }
        
        else if(jrViewOrder.isSelected()){
            ViewAllOrdersFrame frame7= new ViewAllOrdersFrame();
            frame7.setVisible(true);
            this.dispose();
        }
        
        else if(jrViewDatewise.isSelected()){
            ViewAllDateOrdersFrame frame8= new ViewAllDateOrdersFrame();
            frame8.setVisible(true);
            this.dispose();
        }
        
        else if(jrAddCategory.isSelected()){
            AddCategoryFrame frame9= new AddCategoryFrame();
            frame9.setVisible(true);
            this.dispose();
        }
        
        else if(jrEditCategory.isSelected()){
            EditCategoryFrame frame10= new EditCategoryFrame();
            frame10.setVisible(true);
            this.dispose();
        }
        
        else if(jrViewCategory.isSelected()){
            ViewAllCategoriesFrame frame11= new ViewAllCategoriesFrame();
            frame11.setVisible(true);
            this.dispose();
        }
        
        else if(jrAddProduct.isSelected()){
            AddProductFrame frame12= new AddProductFrame();
            frame12.setVisible(true);
            this.dispose();
        }
        
        
        else if(jrViewProduct.isSelected()){
            ViewProductsFrame frame13= new ViewProductsFrame();
            frame13.setVisible(true);
            this.dispose();
        }
        
        else if(jrEditProduct.isSelected()){
            EditProductFrame frame14= new EditProductFrame();
            frame14.setVisible(true);
            this.dispose();
        }
        
        else if(jrRemoveProduct.isSelected()){
            RemoveProductFrame frame15= new RemoveProductFrame();
            frame15.setVisible(true);
            this.dispose();
        }
        
        else
            JOptionPane.showMessageDialog(null,"Please make a choice","Error!",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnDoTaskActionPerformed

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setForeground(Color.yellow);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        LoginFrame loginFrame=new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminOptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminOptionsFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoTask;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jrAddCategory;
    private javax.swing.JRadioButton jrAddEmp;
    private javax.swing.JRadioButton jrAddProduct;
    private javax.swing.JRadioButton jrEditCategory;
    private javax.swing.JRadioButton jrEditEmp;
    private javax.swing.JRadioButton jrEditProduct;
    private javax.swing.JRadioButton jrRegisterCashier;
    private javax.swing.JRadioButton jrRemoveCashier;
    private javax.swing.JRadioButton jrRemoveEmp;
    private javax.swing.JRadioButton jrRemoveProduct;
    private javax.swing.JRadioButton jrViewCategory;
    private javax.swing.JRadioButton jrViewDatewise;
    private javax.swing.JRadioButton jrViewEmp;
    private javax.swing.JRadioButton jrViewOrder;
    private javax.swing.JRadioButton jrViewProduct;
    private javax.swing.JLabel lbAdmin;
    private javax.swing.JLabel lblLogout;
    // End of variables declaration//GEN-END:variables
}