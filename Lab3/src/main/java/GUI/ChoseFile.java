package GUI;

import Controller.ReadFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ChoseFile extends javax.swing.JFrame {

    private ReadFile readFile;
    private GalaFrame galaFrame;

    public ChoseFile(ReadFile readFile, GalaFrame galaFrame) {
        this.readFile = readFile;
        this.galaFrame = galaFrame;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelChooseFile = new javax.swing.JPanel();
        FileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //jFileChooser1.setCurrentDirectory(new File("src//main//resources"));
        String[] extensions = {"json", "yaml", "yml", "xml"};
        CustomFilter filter = new CustomFilter(
            extensions,
            "*.json, *.yaml, *.yml, *.xml"
        );
        FileChooser.addChoosableFileFilter(filter);
        FileChooser.setFileFilter(filter);
        FileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelChooseFileLayout = new javax.swing.GroupLayout(jPanelChooseFile);
        jPanelChooseFile.setLayout(jPanelChooseFileLayout);
        jPanelChooseFileLayout.setHorizontalGroup(
            jPanelChooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChooseFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelChooseFileLayout.setVerticalGroup(
            jPanelChooseFileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelChooseFileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelChooseFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileChooserActionPerformed
        try {
            File selectedFile = FileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            readFile.run(filePath);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Файл не найден", "Ошибка", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Не удалось обработать файл", "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
        galaFrame.fillJTree();
        this.dispose();
    }//GEN-LAST:event_FileChooserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JPanel jPanelChooseFile;
    // End of variables declaration//GEN-END:variables
}
