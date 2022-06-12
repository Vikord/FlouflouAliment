/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mhafo
 */
public class Fen extends JFrame {
    
    public Fen() {
        run();
    }
    
    private void run() {
        
        JTable tab = new JTable(); 
        String[] colonnes = { "Id","Nom","Niveau","Description", "Montant","Remboursement"};
        DefaultTableModel tblMode = new DefaultTableModel(
            new Object [][] {
            },
            colonnes)
        ;
        //créer table 
      //  String[] colonnes = { "Id","Nom","Niveau","Description", "Montant","Remboursement"};
        tab.setModel(new DefaultTableModel(
            new Object [][] {
            },
            colonnes
        ));
        //Afficher table         
        DefaultTableModel model = (DefaultTableModel) tab.getModel();
        //Vider JTable table
        model.setRowCount(0);      
            model.addRow(new Object[]{01,"Pauline","super","transport",12.45,12.45});
            model.addRow(new Object[]{02,"Joe","junior","hebergement",90.56,90.56});
         //ajout dans un scrollpane
        JScrollPane p = new JScrollPane(tab); 
    
        this.add(p);
        
    }
    
}
