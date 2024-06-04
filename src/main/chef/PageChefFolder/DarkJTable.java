/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.chef.PageChefFolder;

/**
 *
 * @author 21261
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import main.connection_BD;

public class DarkJTable extends JTable {
    
    public DarkJTable() {
        // Create a DefaultTableModel with no initial data
        super(new DefaultTableModel(new Object[][]{}, new String[]{"ID", "Item", "Quantite", "Commentaire"}));
        initializeUI();
    }

   public void initializeUI() {
    this.getTableHeader().setBackground(new Color(32, 32, 32));
    this.getTableHeader().setForeground(Color.WHITE);
    this.setBackground(new Color(45, 45, 45));
    this.setForeground(Color.WHITE);
    this.setSelectionBackground(new Color(70, 70, 70));
    this.setSelectionForeground(Color.WHITE);
    this.setGridColor(new Color(60, 60, 60));
    this.setShowGrid(true);
    this.setShowVerticalLines(true);

    // Set custom renderer for the table header
    JTableHeader header = this.getTableHeader();
    header.setDefaultRenderer(new DefaultTableCellRenderer() {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            setBackground(new Color(32, 32, 32));
            setForeground(Color.WHITE);
            return this;
        }
    });
}
  public static void chargerCommandes(DefaultTableModel tableModel) {
        try (Connection conn = connection_BD.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT c.id_Commande, i.nom_item, ci.quantity, c.commentaire FROM Commande c NATURAL JOIN commande_items ci NATURAL JOIN Item i where c.Status=\"pas_encore_traitee\" order by c.id_commande DESC")) {

            ResultSet rs = ps.executeQuery();
            tableModel.setRowCount(0); // Clear existing data

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("id_Commande"),
                    rs.getString("nom_item"),
                    rs.getInt("quantity"),
                    rs.getString("commentaire")
                };
                tableModel.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erreur lors du chargement des données: " + ex.getMessage());
        }
    }

}