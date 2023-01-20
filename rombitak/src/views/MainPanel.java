 /*
* File: MainPanel.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-11-20
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/


package views;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainPanel extends JPanel {
    
    JLabel label;
    JTextField field;

    public MainPanel() {
        this.label = new JLabel("MainPanel");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(10, 15, 10, 15));
    }

    public void addComponent() {
        this.add(label);
        this.add(field);
    }
    
    public MainPanel(JLabel label) {
        this.label = label;
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    public String getText() {
        return this.label.getText();
    }   

    public void setValue(String value) {
        this.field.setText(value);
    }

    public String getValue() {
        return this.field.getText();
    }

}

