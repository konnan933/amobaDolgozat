/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Amoba extends javax.swing.JFrame {

    private String[] pinSzamok = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
    private JButton[] gombok = new JButton[10];
    String kezdoBetu = "X";

    public Amoba() {
        initComponents();
        pinGombGenralas();
        amobaGeneralas();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        bejelntkezesPanel = new javax.swing.JPanel();
        pinPanel = new javax.swing.JPanel();
        settingsPanel = new javax.swing.JPanel();
        shuffleCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        kodTextfield = new javax.swing.JTextField();
        jatekPanel = new javax.swing.JPanel();
        amobaPanel = new javax.swing.JPanel();
        amobaSettingsPanel = new javax.swing.JPanel();
        xRadioButton = new javax.swing.JRadioButton();
        oRadioButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        palyaMeretLista = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM));

        bejelntkezesPanel.setPreferredSize(new java.awt.Dimension(410, 350));
        bejelntkezesPanel.setLayout(new java.awt.GridLayout(1, 0, 20, 20));

        pinPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Pin kód"));
        pinPanel.setLayout(new java.awt.GridLayout(4, 3, 5, 5));
        bejelntkezesPanel.add(pinPanel);

        settingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Beállítás"));

        shuffleCheckBox.setText("kever");
        shuffleCheckBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shuffleCheckBoxStateChanged(evt);
            }
        });

        jLabel1.setText("kód:");

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kodTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(shuffleCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shuffleCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kodTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        bejelntkezesPanel.add(settingsPanel);

        jTabbedPane2.addTab("Bejelntkezés", bejelntkezesPanel);

        jatekPanel.setPreferredSize(new java.awt.Dimension(410, 350));
        jatekPanel.setLayout(new javax.swing.BoxLayout(jatekPanel, javax.swing.BoxLayout.X_AXIS));

        amobaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Amőba"));
        amobaPanel.setLayout(new java.awt.GridLayout(1, 0));
        jatekPanel.add(amobaPanel);

        amobaSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Beállítás"));

        buttonGroup2.add(xRadioButton);
        xRadioButton.setSelected(true);
        xRadioButton.setText("\"X\" kezd");
        xRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioButtonHandler(evt);
            }
        });

        buttonGroup2.add(oRadioButton);
        oRadioButton.setText("\"O\" kezd");
        oRadioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radioButtonHandler(evt);
            }
        });

        palyaMeretLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "3*3", "4*4", "5*5",};
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        palyaMeretLista.setSelectedIndex(0);
        palyaMeretLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                palyaMeretListaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(palyaMeretLista);

        javax.swing.GroupLayout amobaSettingsPanelLayout = new javax.swing.GroupLayout(amobaSettingsPanel);
        amobaSettingsPanel.setLayout(amobaSettingsPanelLayout);
        amobaSettingsPanelLayout.setHorizontalGroup(
            amobaSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amobaSettingsPanelLayout.createSequentialGroup()
                .addGroup(amobaSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amobaSettingsPanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(amobaSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oRadioButton)
                            .addComponent(xRadioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(amobaSettingsPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        amobaSettingsPanelLayout.setVerticalGroup(
            amobaSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, amobaSettingsPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(oRadioButton)
                .addGap(35, 35, 35))
        );

        jatekPanel.add(amobaSettingsPanel);

        jTabbedPane2.addTab("Játék", jatekPanel);

        jMenu1.setText("Program");

        jMenuItem3.setText("Újra");
        jMenu1.add(jMenuItem3);

        jMenuItem2.setText("Kilépés");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Játék elrendezés");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shuffleCheckBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shuffleCheckBoxStateChanged
        if (shuffleCheckBox.isSelected()) {
            pinKeveres();
        } else {
            alapAllapot();
        }
    }//GEN-LAST:event_shuffleCheckBoxStateChanged

    private void palyaMeretListaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_palyaMeretListaMouseReleased
        amobaGeneralas();
    }//GEN-LAST:event_palyaMeretListaMouseReleased

    private void radioButtonHandler(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radioButtonHandler
        JRadioButton rButton = (JRadioButton) evt.getSource();
        kezdoBetu = Character.toString(rButton.getText().charAt(1));
    }//GEN-LAST:event_radioButtonHandler

    private void amobaGeneralas() {
        amobaPanel.removeAll();
        String kijelolt = palyaMeretLista.getSelectedValue();
        int meret = (int) kijelolt.charAt(0) - '0';
        for (int i = 0; i < meret * meret; i++) {
            amobaPanel.add(new JButton());
        }
        GridLayout layout = new GridLayout(meret, meret, 5, 5);
        amobaPanel.setLayout(layout);
        getAmobaComponents();
        pack();
    }
    
    private JButton[] getAmobaComponents(){
        Component[] comps = amobaPanel.getComponents();
        for (Component comp : comps) {
            JButton btn = (JButton)comp;
            btn.addActionListener(new GombAmobaLenyomas());
        }
        return null;
    }

    private void alapAllapot() {
        Color alapHatter = new Color(200, 218, 235);
        for (int i = 0; i < gombok.length; i++) {
            gombok[i].setText(pinSzamok[i]);
            gombok[i].setBackground(alapHatter);
        }
        kodTextfield.setText("");
    }

    private void pinKeveres() {
        ArrayList<String> keveresLista = new ArrayList<>();
        for (int i = 0; i < gombok.length; i++) {
            keveresLista.add(pinSzamok[i]);
        }
        Collections.shuffle(keveresLista);
        for (int i = 0; i < gombok.length; i++) {
            gombok[i].setText(keveresLista.get(i));
        }
    }
    class GombAmobaLenyomas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton gomb = (JButton) e.getSource();
            gomb.setText(kezdoBetu);
            gomb.removeActionListener(this);
            if(kezdoBetu.equals("X")){
                kezdoBetu = "O";
            }else{
                kezdoBetu = "X";
            }
        }
    }

    class GombPinLenyomas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            JButton gomb = (JButton) e.getSource();
            kodTextfield.setText(kodTextfield.getText() + gomb.getText());
            gomb.setBackground(Color.CYAN);
        }
    }

    private void pinGombGenralas() {
        for (int i = 0; i < gombok.length; i++) {
            gombok[i] = new JButton(pinSzamok[i]);
            gombok[i].addActionListener(new GombPinLenyomas());
            pinPanel.add(gombok[i]);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel amobaPanel;
    private javax.swing.JPanel amobaSettingsPanel;
    private javax.swing.JPanel bejelntkezesPanel;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel jatekPanel;
    private javax.swing.JTextField kodTextfield;
    private javax.swing.JRadioButton oRadioButton;
    private javax.swing.JList<String> palyaMeretLista;
    private javax.swing.JPanel pinPanel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JCheckBox shuffleCheckBox;
    private javax.swing.JRadioButton xRadioButton;
    // End of variables declaration//GEN-END:variables
}
