/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Amiga
 */
public class Form3 extends javax.swing.JFrame {
    DefaultTableModel Test;
    /**
     * Creates new form Form3
     */
    public Form3() {
        initComponents();
        this.Test=new DefaultTableModel();
        Test.addColumn("Name");
        Test.addColumn("Sec Name");
        Test.addColumn("AdvisorId");
        Test.addColumn("EmailID");
        Test.addColumn("CNIC");
        Test.addColumn("Gender");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ADLName = new javax.swing.JTextField();
        ADCNIC = new javax.swing.JTextField();
        ADID = new javax.swing.JTextField();
        ADFName = new javax.swing.JTextField();
        ADEmail = new javax.swing.JTextField();
        AdGender = new javax.swing.JComboBox<>();
        Delete = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        noaction = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to the School Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Advisor ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Advisor CNIC");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");

        ADLName.setBackground(new java.awt.Color(204, 204, 204));

        ADCNIC.setBackground(new java.awt.Color(204, 204, 204));

        ADID.setBackground(new java.awt.Color(204, 204, 204));

        ADFName.setBackground(new java.awt.Color(204, 204, 204));

        ADEmail.setBackground(new java.awt.Color(204, 204, 204));

        AdGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ADID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADLName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADFName, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ADEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdGender, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ADFName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADLName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ADID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(ADCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdGender, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Delete.setText("Delete Advioser");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setText("Add Advisor");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update Advisor");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        noaction.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noaction.setText("donot perform any action");
        noaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noactionActionPerformed(evt);
            }
        });

        Table.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Table.setGridColor(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(Table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(noaction, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(Add)
                        .addGap(30, 30, 30)
                        .addComponent(Update))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add)
                    .addComponent(Update))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(noaction))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(765, 765, 765))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//////////////////////Validators//////////////////
    public boolean isValidAdvisorFirstName(String AdvisorFirstName)
        {
           boolean flag=false;
           char[] ch=AdvisorFirstName.toCharArray();
           int size=ch.length;
           for(int i=0; i<size; i++){
               if((ch[i]>='a' && ch[i]<='z') || (ch[i]>='A' && ch[i]>='Z'))
               {
                   flag=true;
               }
               else{
                   flag=false;
               }
           }
           return flag;
        }
    public  boolean isValidAdvisorLastName(String AdvisorLastName){
          boolean flag=false;
          char [] SLN=AdvisorLastName.toCharArray();
          int size=SLN.length;
          for(int i=0; i<size; i++){
              if((SLN[i]>='a' && SLN[i]<='z')&&(SLN[i]>='A' && SLN[i]<='Z'))
              {
                  flag=true;
              }
              else{
                  flag=false;
              }
          }
          return flag;
      }
    public boolean isValidAdvisorid(String AdvisorId) {
        boolean flag = false;
        char[] ch = AdvisorId.toCharArray();
        int size = ch.length;
        if (size > 11) {
            for (int i = 0; i < 4; i++) {
                if (ch[i] >= '0' && ch[i] <= 0) {
                    if (ch[4] == '-' && ch[7] == '-') {
                        if (ch[5] == 'C' && ch[6] == 'S') {
                            for (int j = 8; j < size; j++) {
                                if (ch[i] >= '0' && ch[i] <= '9') {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            flag = false;
        }
        return flag;
    }
    public boolean isValidCNICNum(String AdCNIC){
        boolean flag=false;
        char [] ch=AdCNIC.toCharArray();
        int size=ch.length;
        for(int i=0; i<size; i++){
            if((ch[i]>='0' && ch[i]<='9')&& (ch[i]=='-')){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        return flag;
    }
    public boolean IsValiEmaild(String AdEmailId){
        boolean flag=false;
        char []ch =AdEmailId.toCharArray();
        int size=ch.length;
        for(int i=0; i<size; i++){
            if((ch[i]>='0' && ch[i]<='9') 
                    && (ch[i]>='a' && ch[i]<='z')
                    && (ch[i]>='A' && ch[i]<='Z')
                    &&(ch[i]=='@' && ch[i]=='.')){
                flag=true;
            }
            else{
                flag=false;
            }
        }
        return flag;
    }
    public boolean IsValidGender(String adGender){
        boolean flag;
        if(adGender.equals("Male") || adGender.equals("Female")){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
          Test.insertRow(Test.getRowCount(),new Object[]{ADFName.getText(),ADLName.getText(),
            ADID.getText(), ADCNIC.getText(),ADEmail.getText(),AdGender.getSelectedItem(),
        });
        String AdvisorFirstName=ADFName.getText();
        String AdvisorLastName=ADLName.getText();
        String AdvisorId=ADID.getText();
        String AdCNIC=ADCNIC.getText();
        String adGender=(String) AdGender.getSelectedItem();
        String AdEmailId=ADEmail.getText();
        String DOB=null;
         ArrayList<Advisor> list=new ArrayList<Advisor>();
                 Advisor aq= new Advisor(AdvisorFirstName,AdvisorLastName,AdvisorId,AdCNIC,AdEmailId, DOB);
                list.add(aq);  
        boolean Gender=IsValidGender(adGender);
        boolean EmailId=IsValiEmaild(AdEmailId);
        boolean FirstName=isValidAdvisorFirstName(AdvisorFirstName);
        boolean LastName=isValidAdvisorLastName(AdvisorLastName);
        boolean AdvisorCNIC=isValidCNICNum(AdCNIC);
        boolean Id=isValidAdvisorid(AdvisorId);
        if(Gender==true && EmailId==true
                && FirstName==true && LastName==true
                && AdvisorCNIC==true && Id==true){
           System.out.println("student has been added");
        }
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here
        String AdvisorFirstName=ADFName.getText();
        String AdvisorLastName=ADLName.getText();
        String AdvisorId=ADID.getText();
        String AdCNIC=ADCNIC.getText();
        String adGender=(String) AdGender.getSelectedItem();
        String AdEmailId=ADEmail.getText();
        String DOB=null;
        boolean Gender=IsValidGender(adGender);
        boolean EmailId=IsValiEmaild(AdEmailId);
        boolean FirstName=isValidAdvisorFirstName(AdvisorFirstName);
        boolean LastName=isValidAdvisorLastName(AdvisorLastName);
        boolean AdvisorCNIC=isValidCNICNum(AdCNIC);
        boolean Id=isValidAdvisorid(AdvisorId);
        if(Gender==true && EmailId==true
                && FirstName==true && LastName==true
                && AdvisorCNIC==true && Id==true){
            
            DeleteRow(AdvisorFirstName,AdvisorLastName, AdvisorId,
            AdCNIC,adGender,AdEmailId,DOB);
        }
    }//GEN-LAST:event_DeleteActionPerformed
    public void DeleteRow(String AdvisorFirstName,String AdvisorLastName,String AdvisorId,
            String AdCNIC,String adGender,String AdEmailId,String DOB){
        int i=Table.getSelectedRow();
        if(i>0){
            Test.removeRow(i);
        }
    }
    private void noactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noactionActionPerformed
        // TODO add your handling code here:
        Form3 F3=new Form3();
        F3.setVisible(false);
    }//GEN-LAST:event_noactionActionPerformed
     
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        String AdvisorFirstName=ADFName.getText();
        String AdvisorLastName=ADLName.getText();
        String AdvisorId=ADID.getText();
        String AdCNIC=ADCNIC.getText();
        String adGender=(String) AdGender.getSelectedItem();
        String AdEmailId=ADEmail.getText();
        String DOB=null;
        boolean Gender=IsValidGender(adGender);
        boolean EmailId=IsValiEmaild(AdEmailId);
        boolean FirstName=isValidAdvisorFirstName(AdvisorFirstName);
        boolean LastName=isValidAdvisorLastName(AdvisorLastName);
        boolean AdvisorCNIC=isValidCNICNum(AdCNIC);
        boolean Id=isValidAdvisorid(AdvisorId);
        if(Gender==true && EmailId==true
                && FirstName==true && LastName==true
                && AdvisorCNIC==true && Id==true){
            updateRow(AdvisorFirstName,AdvisorLastName,AdvisorId,
            AdCNIC,adGender,AdEmailId,DOB);
        }
    }//GEN-LAST:event_UpdateActionPerformed
   public void updateRow(String AdvisorFirstName,String AdvisorLastName,String AdvisorId,
            String AdCNIC,String adGender,String AdEmailId,String DOB){
          int i=Table.getSelectedRow();
          if(i>0){
                ArrayList<Advisor> list=new ArrayList<Advisor>();
            Advisor aq= new Advisor(AdvisorFirstName,AdvisorLastName,AdvisorId,AdCNIC,AdEmailId, DOB);
            list.set(i, aq);
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
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADCNIC;
    private javax.swing.JTextField ADEmail;
    private javax.swing.JTextField ADFName;
    private javax.swing.JTextField ADID;
    private javax.swing.JTextField ADLName;
    private javax.swing.JComboBox<String> AdGender;
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JTable Table;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton noaction;
    // End of variables declaration//GEN-END:variables
}