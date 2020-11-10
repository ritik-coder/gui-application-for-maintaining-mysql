import java.sql.*;
import java.util.ArrayList;
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
public class frmTables extends javax.swing.JFrame {

    /** Creates new form databases */
    public frmTables() {
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
        jButtonCreateTable = new javax.swing.JButton();
        jButtonDeleteTable = new javax.swing.JButton();
        jButtonUseTable = new javax.swing.JButton();
        jButtonRenameTable = new javax.swing.JButton();
        jButtonAlterTable = new javax.swing.JButton();

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

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelDirectory.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabelDirectory.setText("localhost > Database > ");

        jButtonCreateTable.setText("Create Table");
        jButtonCreateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateTableActionPerformed(evt);
            }
        });

        jButtonDeleteTable.setText("Delete Table");
        jButtonDeleteTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteTableActionPerformed(evt);
            }
        });

        jButtonUseTable.setText("Use Table");
        jButtonUseTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUseTableActionPerformed(evt);
            }
        });

        jButtonRenameTable.setText("Rename Table");
        jButtonRenameTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRenameTableActionPerformed(evt);
            }
        });

        jButtonAlterTable.setText("Alter Table");
        jButtonAlterTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonDeleteTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlterTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCreateTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButtonUseTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButtonRenameTable, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonCreateTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonUseTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAlterTable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeleteTable)
                        .addGap(11, 11, 11)
                        .addComponent(jButtonRenameTable)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String enterUsername = null;
    String enterPassword = null;
    String useDatabase = null;


    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        frmDatabases databaseswindowpannel=new frmDatabases();
        databaseswindowpannel.setVisible(true);
        databaseswindowpannel.enterUsername = enterUsername;
        databaseswindowpannel.enterPassword = enterPassword;
        this.setVisible(false);
}//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonCreateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateTableActionPerformed
        // TODO add your handling code here:
        String createTableInput=JOptionPane.showInputDialog(this, "Enter the name of table", "Create Table", JOptionPane.OK_CANCEL_OPTION);
        if (createTableInput != null) {
            if(createTableInput.isEmpty()) {
                System.out.println("empty");
            }else if (createTableInput.contains(" ")){
                System.out.println("space");
                JOptionPane.showMessageDialog(null, "Table name should not contain spaces.");
            }else{
//                System.out.println("create table : "+createTableInput);
                int r = jTable1.getRowCount();
                ArrayList tablesname = new ArrayList();

                for (int i=0;i<r;i++) {
                    tablesname.add(jTable1.getValueAt(i, 0));
                }

                //checking if table with particular name already exist
                if (tablesname.contains(createTableInput)) {
                    JOptionPane.showMessageDialog(null, "This table name already exist, please try different name");
                }else{
                    frmCreateTable createtablewindowpannel=new frmCreateTable();
                    createtablewindowpannel.setVisible(true);
                    createtablewindowpannel.createTableName = createTableInput;
                    createtablewindowpannel.useDatabase = useDatabase;
                    createtablewindowpannel.enterUsername = enterUsername;
                    createtablewindowpannel.enterPassword = enterPassword;
                    this.setVisible(false);
                }
            }
        }else{
            System.out.println("null");
        }
}//GEN-LAST:event_jButtonCreateTableActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        jLabelDirectory.setText(""+jLabelDirectory.getText()+""+useDatabase);
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+useDatabase+"",enterUsername,enterPassword);

            Statement stmt = con.createStatement();
            String query = "Show tables;";
            ResultSet rs = stmt.executeQuery(query);

            model.setRowCount(0);
            model.setColumnCount(0);
            String heading[] = {"Tables_in_"+useDatabase+""};
            model.setColumnIdentifiers(heading);
            while(rs.next()) {
                String databasesName = rs.getString("Tables_in_"+useDatabase+"");
                model.insertRow(model.getRowCount(), new Object[] {databasesName});
            }

            jTable1.setModel(model);
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error in connectivity"+e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonDeleteTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteTableActionPerformed
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        int c = jTable1.getSelectedColumn();

        if (r == -1 || c == -1) {
            JOptionPane.showMessageDialog(null, "Please select the table to delete");
        }else{
            String deletingtablename = (String)jTable1.getValueAt(r, c);
            int option = JOptionPane.showConfirmDialog(null, "Do you really want to delete table : "+deletingtablename,"Delete Table",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
            if (option == 0) {
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+useDatabase+"",enterUsername,enterPassword);

                    Statement stmt = con.createStatement();
                    String query1 = "Drop table "+deletingtablename+";";
                    int rs1 = stmt.executeUpdate(query1);
                    String query2 = "Show tables;";
                    ResultSet rs2 = stmt.executeQuery(query2);

                    model.setRowCount(0);
                    while(rs2.next()) {
                        String tablesName = rs2.getString("Tables_in_"+useDatabase+"");
                        model.insertRow(model.getRowCount(), new Object[] {tablesName});
                    }

                    jTable1.setModel(model);
                    rs2.close();
                    stmt.close();
                    con.close();
                }catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in connectivity"+e);
                }
            }
        }
}//GEN-LAST:event_jButtonDeleteTableActionPerformed

    private void jButtonUseTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUseTableActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jButtonUseTableActionPerformed

    private void jButtonRenameTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRenameTableActionPerformed
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        int c = jTable1.getSelectedColumn();

        if (r == -1 || c == -1) {
            JOptionPane.showMessageDialog(null, "Please select the table to rename");
        }else{
            String renamingtablename = (String)jTable1.getValueAt(r, c);
            String renameTableInput= (String)JOptionPane.showInputDialog(this, "Enter the new name of table", "Create Database", JOptionPane.OK_CANCEL_OPTION,null,null,renamingtablename);

            if (renameTableInput != null) {
                if(renameTableInput.isEmpty()) {
                    System.out.println("empty");
                }else if (renameTableInput.contains(" ")){
                    System.out.println("space");
                    JOptionPane.showMessageDialog(null, "Table name should not contain spaces.");
                }else if (renameTableInput.contains(renamingtablename)){
                    JOptionPane.showMessageDialog(null, "i dont think you really want to rename the table.");
                }else{
                    System.out.println("rename table : "+renameTableInput);

                    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+useDatabase+"",enterUsername,enterPassword);

                        Statement stmt = con.createStatement();
                        String query1 = "RENAME TABLE "+renamingtablename+" TO "+renameTableInput+";";
                        int rs1 = stmt.executeUpdate(query1);
                        String query2 = "SHOW TABLES;";
                        ResultSet rs2 = stmt.executeQuery(query2);

                        model.setRowCount(0);
                        while(rs2.next()) {
                            String tablesName = rs2.getString("Tables_in_"+useDatabase+"");
                            model.insertRow(model.getRowCount(), new Object[] {tablesName});
                        }

                        jTable1.setModel(model);
                        rs2.close();
                        stmt.close();
                        con.close();
                    }catch(Exception e) {
                        JOptionPane.showMessageDialog(null, "Error in connectivity"+e);
                    }
                }
            }
        }
}//GEN-LAST:event_jButtonRenameTableActionPerformed

    private void jButtonAlterTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterTableActionPerformed
        // TODO add your handling code here:
        int r = jTable1.getSelectedRow();
        int c = jTable1.getSelectedColumn();

        if (r == -1 || c == -1) {
            JOptionPane.showMessageDialog(null, "Please select the table to alter");
        }else{
            String altertablename = (String)jTable1.getValueAt(r, c);

            frmAlterTable altertablewindowpannel=new frmAlterTable();
            altertablewindowpannel.setVisible(true);
            altertablewindowpannel.selectTable = altertablename;
            altertablewindowpannel.useDatabase = useDatabase;
            altertablewindowpannel.enterUsername = enterUsername;
            altertablewindowpannel.enterPassword = enterPassword;
            this.setVisible(false);
        }
}//GEN-LAST:event_jButtonAlterTableActionPerformed

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
    private javax.swing.JButton jButtonAlterTable;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreateTable;
    private javax.swing.JButton jButtonDeleteTable;
    private javax.swing.JButton jButtonRenameTable;
    private javax.swing.JButton jButtonUseTable;
    private javax.swing.JLabel jLabelDirectory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
