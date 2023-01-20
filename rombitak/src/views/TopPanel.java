 /*
* File: TopPanel.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-11-20
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/


package views;

import javax.swing.*;
import java.awt.FlowLayout;

public class TopPanel extends JPanel {
    
    JLabel titleLabel;

    public TopPanel(){

        this.setSize(200, 20);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.titleLabel = new JLabel("Rombusz kerület/terület");
        this.add(titleLabel);
        
    }
}