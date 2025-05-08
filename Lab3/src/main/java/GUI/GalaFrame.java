package GUI;

import Controller.ReadFile;
import Entities.Monster;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

public class GalaFrame extends javax.swing.JFrame {

    private ReadFile readFile;

    public GalaFrame(ReadFile readFile) {
        this.readFile = readFile;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        ImportButton = new javax.swing.JButton();
        ExportButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Загрузите данные");
        jTreeMonsters = new javax.swing.JTree(root);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(84, 11, 14));

        ImportButton.setBackground(new java.awt.Color(224, 159, 62));
        ImportButton.setText("Прочитать файл");
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        ExportButton.setBackground(new java.awt.Color(224, 159, 62));
        ExportButton.setText("Записать данные");
        ExportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportButtonActionPerformed(evt);
            }
        });

        jTreeMonsters.setBackground(new java.awt.Color(255, 243, 176));
        jTreeMonsters.setBorder(null);
        jTreeMonsters.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jTreeMonsters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTreeMonstersMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(jTreeMonsters);

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addComponent(ImportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(ExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
        ChoseFile chooseFile = new ChoseFile(readFile, this);
        chooseFile.setLocationRelativeTo(null);
        chooseFile.setVisible(true);
    }//GEN-LAST:event_ImportButtonActionPerformed

    private void ExportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExportButtonActionPerformed

    private void jTreeMonstersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTreeMonstersMouseClicked
        if (evt.getClickCount() == 2) {
            TreePath path = jTreeMonsters.getPathForLocation(evt.getX(), evt.getY());
            if (path != null) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) path.getLastPathComponent();
                Monster monster = (Monster) node.getUserObject();
                MonsterInfo monsterInfo = new MonsterInfo(monster);
            }
        }

    }//GEN-LAST:event_jTreeMonstersMouseClicked

    public void fillJTree() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Монстры");
        DefaultMutableTreeNode witcherBranch = new DefaultMutableTreeNode("Ведьмак");
        DefaultMutableTreeNode gravityFallsBranch = new DefaultMutableTreeNode("Гравити Фолз");
        ArrayList<Monster> monsters = readFile.getStorage().getMonsters();

        for (int i = 0; i < monsters.size(); i++) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(monsters.get(i));
            if (i < 5) {
                witcherBranch.add(node);
            } else {
                gravityFallsBranch.add(node);
            }
        }

        root.add(witcherBranch);
        root.add(gravityFallsBranch);

        DefaultTreeModel model = (DefaultTreeModel) jTreeMonsters.getModel();
        model.setRoot(root);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportButton;
    private javax.swing.JButton ImportButton;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTree jTreeMonsters;
    // End of variables declaration//GEN-END:variables
}
