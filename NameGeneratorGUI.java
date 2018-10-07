package namegenerator;

import javax.swing.JOptionPane;
import java.awt.datatransfer.*;
import java.awt.Toolkit;
/**
 *
 * @author BionicBarry
 */
//TO-DO: Add a History tab for a history of generated names.  
public class NameGeneratorGUI extends javax.swing.JFrame {
    //Booleans for each noun Check Box Selected
    private boolean nounAnimals, nounObjects, nounOccupations, nounMeme;
    //Booleans for each adjective checkbox selected
    private boolean adjFunny, adjGeneric, adjSerious, adjNationalities;
    Names nameGen = new Names();
    
    public NameGeneratorGUI() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerate = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        chkAnimals = new javax.swing.JCheckBox();
        chkObjects = new javax.swing.JCheckBox();
        chkOccupations = new javax.swing.JCheckBox();
        chkMeme = new javax.swing.JCheckBox();
        chkFunny = new javax.swing.JCheckBox();
        chkSerious = new javax.swing.JCheckBox();
        chkNationalities = new javax.swing.JCheckBox();
        chkGeneric = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtOutput = new javax.swing.JTextField();
        btnCopy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.setActionCommand("");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        chkAnimals.setText("Animals");

        chkObjects.setText("Objects");

        chkOccupations.setText("Occupations");

        chkMeme.setText("Memes");

        chkFunny.setText("Funny");

        chkSerious.setText("Serious");

        chkNationalities.setText("Nationalities");

        chkGeneric.setText("Generic");

        jLabel1.setText("Noun Options:");

        jLabel2.setText("Adjective Options:");

        txtOutput.setText("Your User Name Here!");

        btnCopy.setText("Copy to Clipboard");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(chkObjects)
                                                    .addComponent(chkOccupations))
                                                .addGap(118, 118, 118))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(chkMeme)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnClose)
                                                .addGap(38, 38, 38)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkGeneric)
                                            .addComponent(chkSerious)
                                            .addComponent(chkNationalities)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(chkAnimals))
                                        .addGap(138, 138, 138)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(chkFunny)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCopy))
                                .addGap(18, 18, 18)
                                .addComponent(btnGenerate)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFunny)
                    .addComponent(chkAnimals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkSerious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNationalities)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClose)
                            .addComponent(chkGeneric)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkObjects)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkOccupations)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkMeme)))
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Check to ensure at least one noun, and one adjective is selected
    private boolean selectionCheck(){
        return (!this.nounAnimals && !this.nounObjects && !this.nounOccupations && !this.nounMeme) ||
               (!this.adjFunny && !this.adjGeneric && !this.adjSerious && !this.adjNationalities);
    }
    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        this.nounAnimals = chkAnimals.isSelected();
        this.nounObjects = chkObjects.isSelected();
        this.nounOccupations = chkOccupations.isSelected();
        this.nounMeme = chkMeme.isSelected();
        this.adjFunny = chkFunny.isSelected();
        this.adjGeneric = chkGeneric.isSelected();
        this.adjSerious = chkSerious.isSelected();
        this.adjNationalities = chkNationalities.isSelected();
        
        if(this.selectionCheck()){
            JOptionPane.showMessageDialog(null, "Please Select at least one Noun and Adjective.");
        }else{
            txtOutput.setText(nameGen.startGeneration(nounAnimals, nounObjects, nounOccupations, nounMeme, adjFunny, adjGeneric, adjSerious, adjNationalities));
        } 
        
    }//GEN-LAST:event_btnGenerateActionPerformed
    //Action of the Copy Button
    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        this.copyToClipboard(txtOutput.getText());
    }//GEN-LAST:event_btnCopyActionPerformed
    //Closes the probram
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed
    //void method copying username to clipboard
    private void copyToClipboard(String username){
        StringSelection selectedName = new StringSelection(username);
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        clip.setContents(selectedName, null);
        JOptionPane.showMessageDialog(null, "Copied!");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NameGeneratorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JCheckBox chkAnimals;
    private javax.swing.JCheckBox chkFunny;
    private javax.swing.JCheckBox chkGeneric;
    private javax.swing.JCheckBox chkMeme;
    private javax.swing.JCheckBox chkNationalities;
    private javax.swing.JCheckBox chkObjects;
    private javax.swing.JCheckBox chkOccupations;
    private javax.swing.JCheckBox chkSerious;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtOutput;
    // End of variables declaration//GEN-END:variables
}
