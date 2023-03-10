
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sun.security.jgss.GSSUtil.login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Employees extends javax.swing.JFrame {

    /**
     * Creates new form Employees
     */
    public Employees() {
        initComponents();
        
        tableUpdate();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txName = new javax.swing.JTextField();
        txSalary = new javax.swing.JTextField();
        txAdress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cGender = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idTx = new javax.swing.JTextField();
        namesch = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txContact = new javax.swing.JTextField();
        goHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        all = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Employees");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 16, -1, 49));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Gender:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Salary:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Adress:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNameActionPerformed(evt);
            }
        });
        getContentPane().add(txName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 120, -1));
        getContentPane().add(txSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 120, -1));
        getContentPane().add(txAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Salary", "Gender", "Adress", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 83, 504, 167));

        cGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        getContentPane().add(cGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 120, -1));

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Search by:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("ID:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Name:");

        idTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxActionPerformed(evt);
            }
        });
        idTx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTxKeyReleased(evt);
            }
        });

        namesch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameschKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTx)
                            .addComponent(namesch, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel6)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(idTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(namesch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Contact:");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 20));

        txContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txContactActionPerformed(evt);
            }
        });
        getContentPane().add(txContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 120, -1));

        goHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\home (1).png")); // NOI18N
        goHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goHomeActionPerformed(evt);
            }
        });
        getContentPane().add(goHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 78, 51));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\logo-uet-PNG.png")); // NOI18N

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 102));
        jLabel11.setText("?? Universiteti Europian i Tiranes");

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 102));
        jLabel12.setText("Developed by Edionis Bobo??i.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel12)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)))
                .addGap(94, 94, 94))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 889, 92));

        all.setBackground(new java.awt.Color(0, 0, 0,80));
        all.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        all.setForeground(new java.awt.Color(240, 240, 240));
        all.setText("Show All");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        getContentPane().add(all, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 110, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\imageedit_3_2940453513.gif")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goHomeActionPerformed
        // TODO add your handling code here:
         LandingPage menu=new LandingPage();
              menu.setVisible(true);
              setVisible(false);
    }//GEN-LAST:event_goHomeActionPerformed
PreparedStatement insert;
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String name=txName.getText();
        String adress=txAdress.getText();
         try{
          //hap lidhjen
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
          insert=con.prepareStatement("insert into employee (empName,salary,empGender,empAdress,empContact)values(?,?,?,?,?)");
          insert.setString(1,name);
          int salary=Integer.parseInt(txSalary.getText());
          insert.setInt(2,salary);
          String gender=cGender.getSelectedItem().toString();
          insert.setString(3,gender);
          insert.setString(4,adress);
          int contact=Integer.parseInt(txContact.getText());
          insert.setInt(5,contact);
          insert.executeUpdate();
          
          JOptionPane.showMessageDialog(this,"Employee added!");
           tableUpdate();
        txName.setText("");
        cGender.setSelectedIndex(0);
        txSalary.setText("");     
        txAdress.setText("");
        txContact.setText("");
        txName.requestFocus();
      }
      
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          
      }
    }//GEN-LAST:event_addBtnActionPerformed

    private void txNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNameActionPerformed

    private void txContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txContactActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();

        int sIndex=jTable1.getSelectedRow();
        txName.setText(Df.getValueAt(sIndex, 1).toString());
        txSalary.setText(Df.getValueAt(sIndex, 2).toString());
        cGender.setSelectedItem(Df.getValueAt(sIndex, 3).toString());
        txAdress.setText(Df.getValueAt(sIndex, 4).toString());
        txContact.setText(Df.getValueAt(sIndex, 5).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();

        int sIndex=jTable1.getSelectedRow();
        try{
         
        String name=txName.getText();
        String adress=txAdress.getText();
         int id=Integer.parseInt(Df.getValueAt(sIndex, 0).toString());
         int dialogResult=JOptionPane.showConfirmDialog(null, "Do you want to delete data","Warning",JOptionPane.YES_NO_OPTION);
         if(dialogResult==JOptionPane.YES_OPTION){
         
          //hap lidhjen
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
          insert=con.prepareStatement("delete from employee where empId=?");
        
          insert.setInt(1,id);
          insert.executeUpdate();
          JOptionPane.showMessageDialog(this,"Data deleted");
         }
         
        
          
       
          tableUpdate();
        txName.setText("");
        cGender.setSelectedIndex(0);
        txSalary.setText("");     
        txAdress.setText("");
        txContact.setText("");
        txName.requestFocus();
      }
      
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          
      }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
          txName.setText("");
        cGender.setSelectedIndex(0);
        txSalary.setText("");     
        txAdress.setText("");
        txContact.setText("");
        txName.requestFocus();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();

        int sIndex=jTable1.getSelectedRow();
     try{
         
       
         int id=Integer.parseInt(Df.getValueAt(sIndex, 0).toString());
         String name=txName.getText();
         String adress=txAdress.getText();
         
         
          //hap lidhjen
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
          insert=con.prepareStatement("update employee set empName=?,salary=?,empGender=?,empAdress=?,empContact=? where empId=?");
          insert.setString(1, name);
          int salary=Integer.parseInt(txSalary.getText());
          insert.setInt(2,salary);
          String gender=cGender.getSelectedItem().toString();
          insert.setString(3,gender);
          insert.setString(4,adress);
          int contact=Integer.parseInt(txContact.getText());
          insert.setInt(5,contact);
          insert.setInt(6,id);
          insert.executeUpdate();
          
          JOptionPane.showMessageDialog(this,"Data updated");
        txName.setText("");
        cGender.setSelectedIndex(0);
        txSalary.setText("");     
        txAdress.setText("");
        txContact.setText("");
        txName.requestFocus();
        tableUpdate();
      }
      
      catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          
      }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void idTxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTxKeyReleased
        // TODO add your handling code here:
    int tb;
    String search=idTx.getText();
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
           insert=con.prepareStatement("select * from employee where empId=?");
           insert.setString(1,search);
           ResultSet rs= insert.executeQuery();
           ResultSetMetaData Rss=rs.getMetaData();
           tb=Rss.getColumnCount();
           DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
           Df.setRowCount(0);
           
           while(rs.next()){
               Vector v1=new Vector();
               
               for(int a=1; a<=tb; a++)
               {
                  v1.add(rs.getString("empId"));
                   v1.add(rs.getString("empName"));
                   v1.add(rs.getInt("salary"));
                   v1.add(rs.getString("empGender"));
                   v1.add(rs.getString("empAdress"));
                   v1.add(rs.getInt("empContact"));
                     
               }
               Df.addRow(v1);
               
           }
           
        }
        
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
       
        
    }//GEN-LAST:event_idTxKeyReleased

    private void idTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxActionPerformed

    private void nameschKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameschKeyReleased
        // TODO add your handling code here:
         int tb;
    String search=namesch.getText();
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
           insert=con.prepareStatement("select * from employee where empName=?");
           insert.setString(1,search);
           ResultSet rs= insert.executeQuery();
           ResultSetMetaData Rss=rs.getMetaData();
           tb=Rss.getColumnCount();
           DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
           Df.setRowCount(0);
           
           while(rs.next()){
               Vector v1=new Vector();
               
               for(int a=1; a<=tb; a++)
               {
                  v1.add(rs.getString("empId"));
                   v1.add(rs.getString("empName"));
                   v1.add(rs.getInt("salary"));
                   v1.add(rs.getString("empGender"));
                   v1.add(rs.getString("empAdress"));
                   v1.add(rs.getInt("empContact"));
                     
               }
               Df.addRow(v1);
               
           }
           
        }
        
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_nameschKeyReleased

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
            
            tableUpdate();
        txName.setText("");
        cGender.setSelectedIndex(0);
        txSalary.setText("");     
        txAdress.setText("");
        txContact.setText("");
        txName.requestFocus();
            
        }
             catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_allActionPerformed

     private void tableUpdate() {
        int tb;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost/library","root","");
           insert=con.prepareStatement("select * from employee");
           ResultSet rs= insert.executeQuery();
           ResultSetMetaData Rss=rs.getMetaData();
           tb=Rss.getColumnCount();
           DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
           Df.setRowCount(0);
           
           while(rs.next()){
               Vector v1=new Vector();
               
               for(int a=1; a<=tb; a++)
               {
                   v1.add(rs.getString("empId"));
                   v1.add(rs.getString("empName"));
                   v1.add(rs.getInt("salary"));
                   v1.add(rs.getString("empGender"));
                   v1.add(rs.getString("empAdress"));
                   v1.add(rs.getInt("empContact"));
                     
               }
               Df.addRow(v1);
               
           }
        }
        
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
     }
    
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
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton all;
    private javax.swing.JComboBox<String> cGender;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton goHome;
    private javax.swing.JTextField idTx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField namesch;
    private javax.swing.JTextField txAdress;
    private javax.swing.JTextField txContact;
    private javax.swing.JTextField txName;
    private javax.swing.JTextField txSalary;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
