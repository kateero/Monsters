package GUI;

import Entities.Monster;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class MonsterInfo extends javax.swing.JFrame {
    Monster monster;

    public MonsterInfo(Monster monster) {
        this.monster = monster;
        initComponents();
        setValues(monster);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        nameValue = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        descritionLabel = new javax.swing.JLabel();
        descriptionValue = new javax.swing.JLabel();
        dangerLabel = new javax.swing.JLabel();
        habitatLabel = new javax.swing.JLabel();
        firstMentionLabel = new javax.swing.JLabel();
        heightLabel = new javax.swing.JLabel();
        weightLabel = new javax.swing.JLabel();
        activityLabel = new javax.swing.JLabel();
        immunityLabel = new javax.swing.JLabel();
        recepieLabel = new javax.swing.JLabel();
        timeCookingLabel = new javax.swing.JLabel();
        efficiencyLabel = new javax.swing.JLabel();
        vulnerabilityLabel = new javax.swing.JLabel();
        dangerValue = new javax.swing.JLabel();
        heightValue = new javax.swing.JLabel();
        weightValue = new javax.swing.JLabel();
        habitatValue = new javax.swing.JLabel();
        firstMentionValue = new javax.swing.JLabel();
        activityValue = new javax.swing.JLabel();
        immunityValue = new javax.swing.JLabel();
        recepiValue = new javax.swing.JLabel();
        cookingValue = new javax.swing.JLabel();
        efficiencyValue = new javax.swing.JLabel();
        resourceLabel = new javax.swing.JLabel();
        resourceValue = new javax.swing.JLabel();
        vulnerabilityValue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(158, 42, 43));

        nameValue.setFont(CustomFonts.getValueFont().deriveFont(28f)
        );
        nameValue.setForeground(new java.awt.Color(255, 243, 176));
        nameValue.setText("Монстр");
        nameValue.setHorizontalAlignment(SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 243, 176));

        descritionLabel.setBackground(new java.awt.Color(84, 11, 14));
        descritionLabel.setFont(CustomFonts.getTitleFont());
        descritionLabel.setForeground(new java.awt.Color(84, 11, 14));
        descritionLabel.setText("Описание");

        descriptionValue.setFont(CustomFonts.getValueFont());
        descriptionValue.setForeground(new java.awt.Color(51, 92, 103));
        descriptionValue.setText("Гибрид человека и лесного духа, охраняющий древние рощи");

        dangerLabel.setFont(CustomFonts.getTitleFont());
        dangerLabel.setForeground(new java.awt.Color(84, 11, 14));
        dangerLabel.setText("Опасность");

        habitatLabel.setFont(CustomFonts.getTitleFont());
        habitatLabel.setForeground(new java.awt.Color(84, 11, 14));
        habitatLabel.setText("Место обитания");

        firstMentionLabel.setFont(CustomFonts.getTitleFont());
        firstMentionLabel.setForeground(new java.awt.Color(84, 11, 14));
        firstMentionLabel.setText("Первое упоминание");

        heightLabel.setFont(CustomFonts.getTitleFont());
        heightLabel.setForeground(new java.awt.Color(84, 11, 14));
        heightLabel.setText("Рост");

        weightLabel.setFont(CustomFonts.getTitleFont());
        weightLabel.setForeground(new java.awt.Color(84, 11, 14));
        weightLabel.setText("Вес");

        activityLabel.setFont(CustomFonts.getTitleFont());
        activityLabel.setForeground(new java.awt.Color(84, 11, 14));
        activityLabel.setText("Время активности");

        immunityLabel.setFont(CustomFonts.getTitleFont());
        immunityLabel.setForeground(new java.awt.Color(84, 11, 14));
        immunityLabel.setText("Иммунитет");

        recepieLabel.setFont(CustomFonts.getTitleFont());
        recepieLabel.setForeground(new java.awt.Color(84, 11, 14));
        recepieLabel.setText("Рецепт яда");

        timeCookingLabel.setFont(CustomFonts.getTitleFont());
        timeCookingLabel.setForeground(new java.awt.Color(84, 11, 14));
        timeCookingLabel.setText("Время приготовления");

        efficiencyLabel.setFont(CustomFonts.getTitleFont());
        efficiencyLabel.setForeground(new java.awt.Color(84, 11, 14));
        efficiencyLabel.setText("Эффективность");

        vulnerabilityLabel.setFont(CustomFonts.getTitleFont());
        vulnerabilityLabel.setForeground(new java.awt.Color(84, 11, 14));
        vulnerabilityLabel.setText("Уязвимость");

        dangerValue.setFont(CustomFonts.getValueFont());
        dangerValue.setForeground(new java.awt.Color(51, 92, 103));
        dangerValue.setText("5");

        heightValue.setFont(CustomFonts.getValueFont());
        heightValue.setForeground(new java.awt.Color(51, 92, 103));
        heightValue.setText("2");

        weightValue.setFont(CustomFonts.getValueFont());
        weightValue.setForeground(new java.awt.Color(51, 92, 103));
        weightValue.setText("100");

        habitatValue.setFont(CustomFonts.getValueFont());
        habitatValue.setForeground(new java.awt.Color(51, 92, 103));
        habitatValue.setText("чащи Брокилона");

        firstMentionValue.setFont(CustomFonts.getValueFont());
        firstMentionValue.setForeground(new java.awt.Color(51, 92, 103));
        firstMentionValue.setText("21-08-1200");

        activityValue.setFont(CustomFonts.getValueFont());
        activityValue.setForeground(new java.awt.Color(51, 92, 103));
        activityValue.setText("ночь");

        immunityValue.setFont(CustomFonts.getValueFont());
        immunityValue.setForeground(new java.awt.Color(51, 92, 103));
        immunityValue.setText("магия");

        recepiValue.setFont(CustomFonts.getValueFont());
        recepiValue.setForeground(new java.awt.Color(51, 92, 103));
        recepiValue.setText("рецепт");

        cookingValue.setFont(CustomFonts.getValueFont());
        cookingValue.setForeground(new java.awt.Color(51, 92, 103));
        cookingValue.setText("30");

        efficiencyValue.setFont(CustomFonts.getValueFont());
        efficiencyValue.setForeground(new java.awt.Color(51, 92, 103));
        efficiencyValue.setText("высокая");

        resourceLabel.setFont(CustomFonts.getTitleFont());
        resourceLabel.setForeground(new java.awt.Color(84, 11, 14));
        resourceLabel.setText("Источник");

        resourceValue.setFont(CustomFonts.getValueFont());
        resourceValue.setForeground(new java.awt.Color(51, 92, 103));
        resourceValue.setText("xml");

        vulnerabilityValue.setBackground(new java.awt.Color(255, 243, 176));
        vulnerabilityValue.setFont(CustomFonts.getValueFont());
        vulnerabilityValue.setForeground(new java.awt.Color(51, 92, 103));
        vulnerabilityValue.setText("магия");
        vulnerabilityValue.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        vulnerabilityValue.setSelectionColor(new java.awt.Color(224, 159, 62));
        vulnerabilityValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vulnerabilityValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resourceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resourceValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descritionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dangerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weightLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstMentionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(vulnerabilityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recepieLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(efficiencyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeCookingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(immunityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(habitatLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dangerValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heightValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weightValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(habitatValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstMentionValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activityValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recepiValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cookingValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(efficiencyValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(descriptionValue, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(immunityValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vulnerabilityValue, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionValue, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descritionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dangerLabel)
                    .addComponent(dangerValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heightLabel)
                    .addComponent(heightValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weightLabel)
                    .addComponent(weightValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(habitatLabel)
                    .addComponent(habitatValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstMentionLabel)
                    .addComponent(firstMentionValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityLabel)
                    .addComponent(activityValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(immunityLabel)
                    .addComponent(immunityValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vulnerabilityLabel)
                    .addComponent(vulnerabilityValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recepieLabel)
                    .addComponent(recepiValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeCookingLabel)
                    .addComponent(cookingValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(efficiencyLabel)
                    .addComponent(efficiencyValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resourceLabel)
                    .addComponent(resourceValue))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(224, 159, 62));
        jButton1.setFont(CustomFonts.getTitleFont());
        jButton1.setForeground(new java.awt.Color(84, 11, 14));
        jButton1.setText("Изменить уязвимость");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(nameValue))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(nameValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        monster.setVulnerability(vulnerabilityValue.getText());
        JOptionPane.showMessageDialog(null, "Уязвимость успешно изменена", "Сохранено", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void vulnerabilityValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vulnerabilityValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vulnerabilityValueActionPerformed

    private void setValues(Monster monster){
        nameValue.setText(monster.getName());
        dangerValue.setText(String.valueOf( monster.getDanger()));
        descriptionValue.setText(monster.getDescription());
        habitatValue.setText(monster.getStringHabitat());
        firstMentionValue.setText(String.valueOf(monster.getFirstMention()));
        heightValue.setText(String.valueOf(monster.getHeight()));
        activityValue.setText(monster.getActivityTime());
        immunityValue.setText(monster.getStringImmunity());
        recepiValue.setText(monster.getPoison().getStringRecipe());
        cookingValue.setText(String.valueOf(monster.getPoison().getCookingTime()));
        efficiencyValue.setText(monster.getPoison().getEfficiency());
        resourceValue.setText(monster.getResource());
        vulnerabilityValue.setText(monster.getVulnerability());
        weightValue.setText(String.valueOf(monster.getWeight()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLabel;
    private javax.swing.JLabel activityValue;
    private javax.swing.JLabel cookingValue;
    private javax.swing.JLabel dangerLabel;
    private javax.swing.JLabel dangerValue;
    private javax.swing.JLabel descriptionValue;
    private javax.swing.JLabel descritionLabel;
    private javax.swing.JLabel efficiencyLabel;
    private javax.swing.JLabel efficiencyValue;
    private javax.swing.JLabel firstMentionLabel;
    private javax.swing.JLabel firstMentionValue;
    private javax.swing.JLabel habitatLabel;
    private javax.swing.JLabel habitatValue;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JLabel heightValue;
    private javax.swing.JLabel immunityLabel;
    private javax.swing.JLabel immunityValue;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel nameValue;
    private javax.swing.JLabel recepiValue;
    private javax.swing.JLabel recepieLabel;
    private javax.swing.JLabel resourceLabel;
    private javax.swing.JLabel resourceValue;
    private javax.swing.JLabel timeCookingLabel;
    private javax.swing.JLabel vulnerabilityLabel;
    private javax.swing.JTextField vulnerabilityValue;
    private javax.swing.JLabel weightLabel;
    private javax.swing.JLabel weightValue;
    // End of variables declaration//GEN-END:variables
}
