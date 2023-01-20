 /*
* File: BottomPanel.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-11-20
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/


package views;

import java.awt.FlowLayout;
import javax.swing.*;

public class BottomPanel extends JPanel {
    
    JButton aboutButton;

    public BottomPanel(){

        this.setSize(200, 20);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.aboutButton = new JButton("Névjegy");
        this.add(aboutButton);
        
    }


}