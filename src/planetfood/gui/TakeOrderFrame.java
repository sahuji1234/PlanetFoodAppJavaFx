/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetfood.gui;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import planetfood.dao.CategoryDao;
import planetfood.dao.OrderDao;
import planetfood.dao.ProductDao;
import planetfood.pojo.OrderDetail;
import planetfood.pojo.Orders;
import planetfood.pojo.Product;
import planetfood.pojo.UserProfile;

/**
 *
 * @author Jonty
 */
public class TakeOrderFrame extends javax.swing.JFrame {
    private HashMap<String,String> categories;
    private HashMap<String,Product> productList;
    private ArrayList<OrderDetail> orderList=new ArrayList<OrderDetail>();
    private Product p;
    private String catId;
    private String prodName;
    private String prodId;
    private String catName;
    private double subTotal;
    private double actualTotal;
    private double grandTotal;
    private double discountAmount;
    private double gstAmount;
    private double discountPer;
    private String ordId;
    private DefaultTableModel model;
    private StringBuffer message=new StringBuffer("\n");
    HashMap<String,Double> msg=new HashMap<>();
    
    
    
    
    /**
     * Creates new form TakeOrderFrame
     */
    public TakeOrderFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblName.setText("Hello " + UserProfile.getUsername());
        loadProductDetails();
        model=(DefaultTableModel)jtProductDetails.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBasket = new javax.swing.JButton();
        jcCatName = new javax.swing.JComboBox<>();
        jcPrdName = new javax.swing.JComboBox<>();
        txtPrdPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnPayBill = new javax.swing.JButton();
        txtOrdId = new javax.swing.JTextField();
        txtSubTotal = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtGstAmount = new javax.swing.JTextField();
        txtGrandTotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcTable = new javax.swing.JComboBox<>();
        lblName = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAKE ORDER PANEL");

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Choose Product To Order", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(0, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Category");

        jLabel3.setBackground(new java.awt.Color(0, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Id");

        jLabel5.setBackground(new java.awt.Color(0, 102, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Price");

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity");

        btnBasket.setBackground(new java.awt.Color(0, 102, 102));
        btnBasket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBasket.setForeground(new java.awt.Color(255, 255, 255));
        btnBasket.setText("Add to Basket");
        btnBasket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBasketActionPerformed(evt);
            }
        });

        jcCatName.setBackground(new java.awt.Color(0, 102, 102));
        jcCatName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcCatName.setForeground(new java.awt.Color(255, 255, 255));
        jcCatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCatNameActionPerformed(evt);
            }
        });

        jcPrdName.setBackground(new java.awt.Color(0, 102, 102));
        jcPrdName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcPrdName.setForeground(new java.awt.Color(255, 255, 255));
        jcPrdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPrdNameActionPerformed(evt);
            }
        });

        txtPrdPrice.setEditable(false);
        txtPrdPrice.setBackground(new java.awt.Color(0, 102, 102));
        txtPrdPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrdPrice.setForeground(new java.awt.Color(255, 255, 255));

        txtQuantity.setBackground(new java.awt.Color(0, 102, 102));
        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPrdPrice)
                    .addComponent(jcCatName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuantity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(btnBasket, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jcPrdName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcPrdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBasket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        jtProductDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Price", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(jtProductDetails);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basket Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Order Id");

        jLabel8.setBackground(new java.awt.Color(0, 102, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sub Total");

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Discount");

        jLabel10.setBackground(new java.awt.Color(0, 102, 102));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("GST Amount");

        jLabel11.setBackground(new java.awt.Color(0, 102, 102));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grand Total");

        btnPayBill.setBackground(new java.awt.Color(0, 102, 102));
        btnPayBill.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPayBill.setForeground(new java.awt.Color(255, 255, 255));
        btnPayBill.setText("Pay Bill");
        btnPayBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayBillActionPerformed(evt);
            }
        });

        txtOrdId.setEditable(false);
        txtOrdId.setBackground(new java.awt.Color(0, 102, 102));
        txtOrdId.setForeground(new java.awt.Color(255, 255, 255));

        txtSubTotal.setEditable(false);
        txtSubTotal.setBackground(new java.awt.Color(0, 102, 102));
        txtSubTotal.setForeground(new java.awt.Color(255, 255, 255));

        txtDiscount.setEditable(false);
        txtDiscount.setBackground(new java.awt.Color(0, 102, 102));
        txtDiscount.setForeground(new java.awt.Color(255, 255, 255));

        txtGstAmount.setEditable(false);
        txtGstAmount.setBackground(new java.awt.Color(0, 102, 102));
        txtGstAmount.setForeground(new java.awt.Color(255, 255, 255));

        txtGrandTotal.setEditable(false);
        txtGrandTotal.setBackground(new java.awt.Color(0, 102, 102));
        txtGrandTotal.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Table No.");

        jcTable.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnPayBill))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtOrdId, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(txtSubTotal)
                            .addComponent(txtDiscount)
                            .addComponent(txtGstAmount)
                            .addComponent(txtGrandTotal)
                            .addComponent(jcTable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtOrdId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtGstAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jcTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPayBill)
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lblDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPayBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayBillActionPerformed
        // TODO add your handling code here:
        
        Orders obj=new Orders();
        obj.setOrdId(ordId);
        java.util.Date today=new java.util.Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
        obj.setOrdDate(sdf.format(today));
        obj.setGst(5.0);
        obj.setGstAmount(gstAmount);
        obj.setOrdAmount(subTotal);
        obj.setGrandTotal(grandTotal);
        obj.setDiscount(discountAmount);
        obj.setUserId(UserProfile.getUserId());
        
        
        //String message="Your Bill Details \n Bill Amount: Rs"+actualTotal;
        //message+="\n Discount:Rs"+discountAmount;
        //message+="\n GST:Rs"+gstAmount;
        //message+="\n Amount Payable:Rs"+grandTotal;
        message.append("\n Bill Amount: Rs").append(actualTotal);
        message.append("\n Discount:Rs").append(discountAmount);
        message.append("\nGST:Rs").append(gstAmount);
        message.append("\n Amount Payable:Rs").append(grandTotal);
        JOptionPane.showMessageDialog(null, message);
        // model.removeRow(0);
       
       /*    txtOrdId.setText("");
        txtSubTotal.setText("");
        txtDiscount.setText("");
        txtGrandTotal.setText("");
        txtGstAmount.setText("");*/
        

        
        try{
            boolean status= OrderDao.addOrder(obj, orderList);
            if(status){
                JOptionPane.showMessageDialog(null,"Order Placed Succesfully","Success!",JOptionPane.INFORMATION_MESSAGE);
                clearAll();
                 model.setRowCount(0);
            }
            else
                JOptionPane.showMessageDialog(null,"Order Not Placed Successfully","Error!",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Exception while adding order","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_btnPayBillActionPerformed

    private void jcCatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCatNameActionPerformed
        // TODO add your handling code here:
        try{
            if(jcCatName.getSelectedItem()==null)
                return;
            catName=jcCatName.getSelectedItem().toString();
            catId=categories.get(catName);
            
            productList=ProductDao.getProductsByCategory(catId);
            
            jcPrdName.removeAllItems();
            for(String prdId: productList.keySet())
                jcPrdName.addItem(prdId);
        }
        catch(SQLException ex){
            JOptionPane.showInputDialog(null,"Exception in DB","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jcCatNameActionPerformed

    private void jcPrdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPrdNameActionPerformed
        // TODO add your handling code here:
        if(jcPrdName.getSelectedItem()==null){
            return;
        }
        prodName=jcPrdName.getSelectedItem().toString();
        p=productList.get(prodName);
        prodId=p.getProdId();
      //  txtPrdName.setText(p.getProdName());
        txtPrdPrice.setText(String.valueOf(p.getProdPrice()));
        
    }//GEN-LAST:event_jcPrdNameActionPerformed

    private void btnBasketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBasketActionPerformed
        // TODO add your handling code here:
      //  txtOrdId.setText("");
        //txtSubTotal.setText("");
        
        
        String quantity = txtQuantity.getText();
        JOptionPane.showMessageDialog(null, "Quantity is"+quantity);
        if(quantity.isEmpty()){
            JOptionPane.showInputDialog(null,"Please Set the Quantity","Error!",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
      
        
        String price = txtPrdPrice.getText();
        Object[] rows=new Object[5];
        DefaultTableModel model=(DefaultTableModel)jtProductDetails.getModel();
        
        rows[1]=jcPrdName.getSelectedItem().toString();
        rows[0]=prodId;
       // rows[1]=txtPrdName.getText();
        rows[2]=price;
        rows[3]=quantity;
        
        double amount=Double.parseDouble(price)*Double.parseDouble(quantity);
        rows[4]=amount;
        //model.addRow(0);
      //  msg.put(txtPrdName.getText(),Double.parseDouble(txtPrdPrice.getText()));
      //  message.append(txtPrdName.getText()).append("\t").append(quantity).append("\t").append(txtPrdPrice.getText()).append("\t").append(amount).append("\n");
        
        model.addRow(rows);
        actualTotal=amount+actualTotal;
        subTotal=actualTotal;
        discountAmount=Math.round(discountPer*subTotal/100.00);
        
        txtDiscount.setText(String.valueOf(discountAmount));
        txtSubTotal.setText(String.valueOf(subTotal));
        gstAmount=Math.round(5*subTotal/100.0);
        txtGstAmount.setText(String.valueOf(gstAmount));
        
        grandTotal=Math.round(subTotal+gstAmount-discountAmount);
        txtGrandTotal.setText(String.valueOf(grandTotal));
        
        OrderDetail obj=new OrderDetail();
        obj.setOrdid(ordId);
        obj.setProdid(prodId);
        obj.setQuantity(Double.parseDouble(quantity));
        obj.setCost(amount);
        orderList.add(obj);
        txtQuantity.setText("");
    }//GEN-LAST:event_btnBasketActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CashierOptionsFrame orderFrame=new CashierOptionsFrame();
        orderFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(TakeOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeOrderFrame().setVisible(true);
            }
        });
    }

    public void loadProductDetails(){
        try{
            jcCatName.removeAllItems();
            categories=CategoryDao.getAllCategoryId();
            for(String catName:categories.keySet())
                jcCatName.addItem(catName);
            ordId=OrderDao.getNewId();
            txtOrdId.setText(ordId);
            do{
                String discountStr=JOptionPane.showInputDialog("How much Discount is offered?");
                if(discountStr == null){
                    discountStr="0.0";
                }
                try{
                    discountPer=Double.parseDouble(discountStr);
                    lblDiscount.setText("Discount("+discountPer+"%)");
                    break;
                }
                catch(Exception ex){
                    JOptionPane.showInputDialog(null,"Please Set Numeric value for Discount","Error!",JOptionPane.ERROR_MESSAGE);
                }
            }
            while(true);
        }
        catch(SQLException ex){
            JOptionPane.showInputDialog(null,"Exception in DB","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public void clearAll(){
        //txtPrdName.setText("");
      //  txtPrdPrice.setText("");
        txtQuantity.setText("");
        txtOrdId.setText("");
        txtSubTotal.setText("");
        txtGstAmount.setText("");
        txtGrandTotal.setText("");
        txtDiscount.setText("");
        actualTotal=0;
        grandTotal=0;
        gstAmount=0;
       discountAmount=0;
      //  model.removeRow(0);
        
        try{
            ordId=OrderDao.getNewId();
            txtOrdId.setText(ordId);
        }
        catch(SQLException ex){
            JOptionPane.showInputDialog(null,"Please Set Numeric value for Discount","Error!",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBasket;
    private javax.swing.JButton btnPayBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCatName;
    private javax.swing.JComboBox<String> jcPrdName;
    private javax.swing.JComboBox<String> jcTable;
    private javax.swing.JTable jtProductDetails;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtGrandTotal;
    private javax.swing.JTextField txtGstAmount;
    private javax.swing.JTextField txtOrdId;
    private javax.swing.JTextField txtPrdPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSubTotal;
    // End of variables declaration//GEN-END:variables
}