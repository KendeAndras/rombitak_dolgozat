 /*
* File: CalcPanel.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-11-20
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/


package views;

import javax.swing.JButton;


public class CalcPanel extends MainPanel {
    JButton calcButton;    

    public CalcPanel() {

        this.calcButton = new JButton("Számítás");
        this.addComponent();
    }

    public void addComponent() {
        this.add(calcButton);
    }


}
