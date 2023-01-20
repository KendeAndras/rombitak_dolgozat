 /*
* File: MainWindow.java
* Author: KorcsmarosKendeAndras
* Copyright: 2023 , KorcsmarosKendeAndras
* Group: Szoft 2/N
* Date: 2023-11-20
* Github: https://github.com/KendeAndras/
* Licenc: GNU GPL
*/


package views;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class MainWindow extends JFrame {

    TopPanel topPanel;
    EdgePanel edgePanel;
    CalcPanel calcPanel;
    DistrPanel distrPanel;
    AreaPanel areaPanel;
    BottomPanel bottomPanel;
    int edge = Integer.parseInt(edgePanel.field.getText());

    public MainWindow() {

        this.topPanel= new TopPanel();
        this.edgePanel = new EdgePanel();
        this.calcPanel = new CalcPanel();
        this.areaPanel = new AreaPanel();
        this.distrPanel = new DistrPanel();
        this.bottomPanel = new BottomPanel();

        this.initComponent();
        this.initWindow();

    }

    public void initComponent(){
       
    }

    public void initWindow() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.PAGE_AXIS));
        this.addComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public void addComponents() {
        this.add(this.topPanel);
        this.add(this.edgePanel);
        this.add(this.calcPanel);
        this.add(this.distrPanel);
        this.add(this.areaPanel);
        this.add(this.bottomPanel);
    }

    public int getEdge(){
        ;
        return edge;
    };
    
    public void calcDistr(int edge) {

        int distr = edge * 4;
        setDistrdistrToString(distr);
    }

    public void setDistrdistrToString(int distr) {

        Integer newdistr = new Integer(distr);
        String strDistr = newdistr.toString();

    }

    public void setDistr(String strDistr){
        distrPanel.field.setText(strDistr);
    }

}
