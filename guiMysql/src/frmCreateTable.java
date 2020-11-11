import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * databases.java
 *
 * Created on Oct 21, 2020, 4:25:51 AM
 */

/**
 *
 * @author Amit
 */
public class frmCreateTable extends javax.swing.JFrame {

    /** Creates new form databases */
    public frmCreateTable() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jLabelDirectory = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonAdd = new javax.swing.JButton();
        jButtonEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldColumnName = new javax.swing.JTextField();
        jComboBoxColumnType = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldColumnSize = new javax.swing.JTextField();
        jCheckBoxColumnNotNull = new javax.swing.JCheckBox();
        jComboBoxColumnKey = new javax.swing.JComboBox();
        jTextFieldColumnDefault = new javax.swing.JTextField();
        jComboBoxColumnExtra = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonExecuteCreateTable = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Field", "Type", "Size", "Null", "Key", "Default", "Extra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelDirectory.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabelDirectory.setText("localhost > Database > ");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jLabel1.setText("Column name :");

        jComboBoxColumnType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "INT", "VARCHAR", "CHAR" }));

        jLabel2.setText("Type :");

        jLabel3.setText("Size :");

        jComboBoxColumnKey.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none", "PRIMARY KEY", "UNIQUE" }));

        jComboBoxColumnExtra.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "none", "AUTO_INCREMENT" }));

        jLabel4.setText("Not Null:");

        jLabel5.setText("Key :");

        jLabel6.setText("Default :");

        jLabel7.setText("Extra :");

        jButtonExecuteCreateTable.setText("Create Table");
        jButtonExecuteCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecuteCreateTableActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExecuteCreateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldColumnName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxColumnType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldColumnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxColumnNotNull)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxColumnKey, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldColumnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxColumnExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldColumnName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxColumnType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldColumnSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxColumnKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColumnExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldColumnDefault, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBoxColumnNotNull))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonBack)
                    .addComponent(jButtonExecuteCreateTable)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonDelete))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String enterUsername = null;
    String enterPassword = null;
    String useDatabase = null;
    String createTableName = null;

    int rowSelected = -1;
    

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed

        frmTables tableswindowpannel=new frmTables();
        tableswindowpannel.setVisible(true);
        tableswindowpannel.useDatabase = useDatabase;
        tableswindowpannel.enterUsername = enterUsername;
        tableswindowpannel.enterPassword = enterPassword;
        this.setVisible(false);
}//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        String columnName = jTextFieldColumnName.getText();
        String columnType = (String)jComboBoxColumnType.getSelectedItem();
        String strcolumnSize = jTextFieldColumnSize.getText();
        Boolean columnNotNull = !(jCheckBoxColumnNotNull.isSelected());
        String columnKey = (String)jComboBoxColumnKey.getSelectedItem();
        String columnDefault = jTextFieldColumnDefault.getText();
        String columnExtra = (String)jComboBoxColumnExtra.getSelectedItem();

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        String strcolumnNotNull;
        if (columnNotNull) {
            strcolumnNotNull = "true";
        }else{
            strcolumnNotNull = "false";
        }

        if (columnKey.equals("none")) {
            columnKey = "";
        }
        if (columnExtra.equals("none")) {
            columnExtra = "";
        }

        
        if (columnName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Column name must be present");
        }else{
            if ((columnExtra.equals("AUTO_INCREMENT"))&&(!columnType.equals("INT"))) {
                JOptionPane.showMessageDialog(null, "Auto increment must contain integer type.");
            }else{
                if ((columnType.contains("VARCHAR")&&(strcolumnSize.isEmpty()))) {
                    JOptionPane.showMessageDialog(null, "Enter the size of varchar.");
                }else{
                    if((columnExtra.equals("AUTO_INCREMENT"))&&(!columnKey.equals("PRIMARY KEY"))) {
                        JOptionPane.showMessageDialog(null, "Auto increment must contain primary key.");
                    }else{
                        if((columnExtra.equals("AUTO_INCREMENT"))&&(!columnDefault.isEmpty())) {
                            JOptionPane.showMessageDialog(null, "When auto increment is selected, then default should be empty");
                        }else{
                            if (rowSelected == -1) {
                                model.insertRow(model.getRowCount(), new Object[] {columnName,columnType,strcolumnSize,strcolumnNotNull,columnKey,columnDefault,columnExtra});
                            }else{
                                model.removeRow(rowSelected);
                                model.insertRow(rowSelected, new Object[] {columnName,columnType,strcolumnSize,strcolumnNotNull,columnKey,columnDefault,columnExtra});
                                rowSelected = -1;
                            }

                            jTable1.setModel(model);

                            //clearing all fields
                            jTextFieldColumnName.setText("");
                            jComboBoxColumnType.setSelectedIndex(0);
                            jTextFieldColumnSize.setText("");
                            jCheckBoxColumnNotNull.setSelected(false);
                            jComboBoxColumnKey.setSelectedIndex(0);
                            jTextFieldColumnDefault.setText("");
                            jComboBoxColumnExtra.setSelectedIndex(0);

                        }
                    }
                }
            }
        }

}//GEN-LAST:event_jButtonAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
        jLabelDirectory.setText(""+jLabelDirectory.getText()+""+useDatabase+" > "+createTableName+" [Creating table]");
    }//GEN-LAST:event_formWindowOpened

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
   
        int r = jTable1.getSelectedRow();

        if (r == -1) {
            JOptionPane.showMessageDialog(null, "Please select the table row to edit");
        }else{


//            String selectingtablerow = jTable1.getValueAt(r, 0);
            jTextFieldColumnName.setText((String)jTable1.getValueAt(r,0));
            jComboBoxColumnType.setSelectedItem((String)jTable1.getValueAt(r,1));
            jTextFieldColumnSize.setText((String)jTable1.getValueAt(r,2));
            String strNotNull = (String)jTable1.getValueAt(r, 3);
            Boolean boolNotNull;
            if (strNotNull.equals("true")) {
                boolNotNull = !true;
            }else{
                boolNotNull = !false;
            }
            jCheckBoxColumnNotNull.setSelected(boolNotNull);
            jComboBoxColumnKey.setSelectedItem((String)jTable1.getValueAt(r,4));
            jTextFieldColumnDefault.setText((String)jTable1.getValueAt(r,5));
            jComboBoxColumnExtra.setSelectedItem((String)jTable1.getValueAt(r,6));

            rowSelected = r;
        }

}//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonExecuteCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecuteCreateTableActionPerformed
   
        int row = jTable1.getRowCount();
        int col = jTable1.getColumnCount();
        

        if (row == 0) {
            JOptionPane.showMessageDialog(null, "No fields are present in table.");
        }else{
            String sql = "CREATE TABLE ";
            sql = sql.concat(createTableName+"(");
            for (int i=0; i<row; i++) {
                String field = (String)jTable1.getValueAt(i,0);
                String type = (String)jTable1.getValueAt(i,1);
                String size = (String)jTable1.getValueAt(i,2);
                if (size.isEmpty()) {
                    size = "";
                }else{
                    size = "("+size+")";
                }
                String notnull = (String)jTable1.getValueAt(i,3);
                if (notnull.equals("true")) {
                    notnull = "";
                }else{
                    notnull = "NOT NULL";
                }
                String key = (String)jTable1.getValueAt(i,4);
                String defaultvalue = (String)jTable1.getValueAt(i,5);
                if (defaultvalue.isEmpty()) {
                    defaultvalue = "";
                }else{
                    if (type.equals("VARCHAR")||type.equals("CHAR")) {
                        defaultvalue = "DEFAULT \""+defaultvalue+"\"";
                    }else{
                        defaultvalue = "DEFAULT "+defaultvalue;
                    }
                }
                String extra = (String)jTable1.getValueAt(i,6);

                sql = sql.concat(""+field+" "+type+""+size+" "+notnull+" "+key+" "+defaultvalue+" "+extra);
                if (i<row-1) {
                    sql = sql.concat(",");
                }
            }
            sql = sql.concat(");");
            System.out.println(sql);

            try {

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+useDatabase+"",enterUsername,enterPassword);

                Statement stmt = con.createStatement();
                String query = sql;
                int rs = stmt.executeUpdate(query);

                stmt.close();
                con.close();
                System.out.println("created");

                /*//////////////////////////////////////////////////////////
                          BACK BUTTON(to go back to frmTables)
                 //////////////////////////////////////////////////////////*/
                frmTables tableswindowpannel=new frmTables();
                tableswindowpannel.setVisible(true);
                tableswindowpannel.useDatabase = useDatabase;
                tableswindowpannel.enterUsername = enterUsername;
                tableswindowpannel.enterPassword = enterPassword;
                this.setVisible(false);

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error in creating table"+e);
            }
        }
        
}//GEN-LAST:event_jButtonExecuteCreateTableActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
   
        /*////////////////////////////////////////////////////////////
                     the only way rowselected != -1
                    when it is selected for editing
                     (because there in only two state adding/editing)
                     depending upon row selected
         ///////////////////////////////////////////////////////////*/
        if (rowSelected != -1) {  
            JOptionPane.showMessageDialog(null, "Please do not delete while editing.");
        }else{
            int r = jTable1.getSelectedRow();

            if (r == -1) {
                JOptionPane.showMessageDialog(null, "Please select the table row to delete");
            }else{
                int option = JOptionPane.showConfirmDialog(null, "Do you really want to delete table row : ","Delete Table row",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
                if (option == 0) {
                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    model.removeRow(r);
                    jTable1.setModel(model);
                }
            }
        }
}//GEN-LAST:event_jButtonDeleteActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDatabases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonExecuteCreateTable;
    private javax.swing.JCheckBox jCheckBoxColumnNotNull;
    private javax.swing.JComboBox jComboBoxColumnExtra;
    private javax.swing.JComboBox jComboBoxColumnKey;
    private javax.swing.JComboBox jComboBoxColumnType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDirectory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldColumnDefault;
    private javax.swing.JTextField jTextFieldColumnName;
    private javax.swing.JTextField jTextFieldColumnSize;
    // End of variables declaration//GEN-END:variables

}
