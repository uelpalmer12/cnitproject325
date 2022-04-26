/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wordle;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author sampa
 */
public class wordle extends JFrame implements ActionListener//, KeyListener
{
    public wordle() {
        initComponents();
    }
  private void initComponents() {

        btnQ = new javax.swing.JButton();
        btnQ.addActionListener(this);
        btnW = new javax.swing.JButton();
        btnW.addActionListener(this);
        btnE = new javax.swing.JButton();
        btnE.addActionListener(this);
        btnR = new javax.swing.JButton();
        btnR.addActionListener(this);
        btnT = new javax.swing.JButton();
        btnT.addActionListener(this);
        btnY = new javax.swing.JButton();
        btnY.addActionListener(this);
        btnU = new javax.swing.JButton();
        btnU.addActionListener(this);
        btnI = new javax.swing.JButton();
        btnI.addActionListener(this);
        btnO = new javax.swing.JButton();
        btnO.addActionListener(this);
        btnP = new javax.swing.JButton();
        btnP.addActionListener(this);
        btnA = new javax.swing.JButton();
        btnA.addActionListener(this);
        btnS = new javax.swing.JButton();
        btnS.addActionListener(this);
        btnD = new javax.swing.JButton();
        btnD.addActionListener(this);
        btnF = new javax.swing.JButton();
        btnF.addActionListener(this);
        btnG = new javax.swing.JButton();
        btnG.addActionListener(this);
        btnH = new javax.swing.JButton();
        btnH.addActionListener(this);
        btnJ = new javax.swing.JButton();
        btnJ.addActionListener(this);
        btnK = new javax.swing.JButton();
        btnK.addActionListener(this);
        btnL = new javax.swing.JButton();
        btnL.addActionListener(this);
        btnClear = new javax.swing.JButton();
        btnClear.addActionListener(this);
        btnZ = new javax.swing.JButton();
        btnZ.addActionListener(this);
        btnX = new javax.swing.JButton();
        btnX.addActionListener(this);
        btnC = new javax.swing.JButton();
        btnC.addActionListener(this);
        btnV = new javax.swing.JButton();
        btnV.addActionListener(this);
        btnB = new javax.swing.JButton();
        btnB.addActionListener(this);
        btnN = new javax.swing.JButton();
        btnN.addActionListener(this);
        btnM = new javax.swing.JButton();
        btnM.addActionListener(this);
        btnEnt = new javax.swing.JButton();
        btnEnt.addActionListener(this);
        txtG1T1 = new javax.swing.JTextField();
        txtG1T2 = new javax.swing.JTextField();
        txtG1T3 = new javax.swing.JTextField();
        txtG1T4 = new javax.swing.JTextField();
        txtG1T5 = new javax.swing.JTextField();
        txtG1T6 = new javax.swing.JTextField();
        txtG2T1 = new javax.swing.JTextField();
        txtG2T2 = new javax.swing.JTextField();
        txtG2T3 = new javax.swing.JTextField();
        txtG2T4 = new javax.swing.JTextField();
        txtG2T5 = new javax.swing.JTextField();
        txtG2T6 = new javax.swing.JTextField();
        txtG3T1 = new javax.swing.JTextField();
        txtG3T2 = new javax.swing.JTextField();
        txtG3T3 = new javax.swing.JTextField();
        txtG3T4 = new javax.swing.JTextField();
        txtG3T5 = new javax.swing.JTextField();
        txtG3T6 = new javax.swing.JTextField();
        txtG4T1 = new javax.swing.JTextField();
        txtG4T2 = new javax.swing.JTextField();
        txtG4T3 = new javax.swing.JTextField();
        txtG4T4 = new javax.swing.JTextField();
        txtG4T5 = new javax.swing.JTextField();
        txtG4T6 = new javax.swing.JTextField();
        txtG5T1 = new javax.swing.JTextField();
        txtG5T2 = new javax.swing.JTextField();
        txtG5T3 = new javax.swing.JTextField();
        txtG5T4 = new javax.swing.JTextField();
        txtG5T5 = new javax.swing.JTextField();
        txtG5T6 = new javax.swing.JTextField();
        txtG6T1 = new javax.swing.JTextField();
        txtG6T2 = new javax.swing.JTextField();
        txtG6T3 = new javax.swing.JTextField();
        txtG6T4 = new javax.swing.JTextField();
        txtG6T5 = new javax.swing.JTextField();
        txtG6T6 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        
         alphabet = new JButton[]{btnQ,btnW,btnE,btnR,btnT,btnA,btnY,btnU,btnS,btnI,btnO,btnD,btnP,btnF,btnG,btnH,btnJ,btnK,btnL,btnZ,btnX,btnC,btnV,btnB,btnN,btnM};

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(520, 350));

        btnQ.setText("Q");

        btnW.setText("W");

        btnE.setText("E");

        btnR.setText("R");

        btnT.setText("T");

        btnY.setText("Y");

        btnU.setText("U");

        btnI.setText("I");

        btnO.setText("O");

        btnP.setText("P");

        btnA.setText("A");

        btnS.setText("S");

        btnD.setText("D");

        btnF.setText("F");

        btnG.setText("G");

        btnH.setText("H");

        btnJ.setText("J");

        btnK.setText("K");

        btnL.setText("L");

        btnClear.setText("Clear");

        btnZ.setText("Z");

        btnX.setText("X");

        btnC.setText("C");

        btnV.setText("V");

        btnB.setText("B");

        btnN.setText("N");

        btnM.setText("M");

        btnEnt.setText("Enter");

        txtG2T1.setEditable(false);

        txtG2T2.setEditable(false);

        txtG2T3.setEditable(false);

        txtG2T4.setEditable(false);

        txtG2T5.setEditable(false);

        txtG2T6.setEditable(false);

        txtG3T1.setEditable(false);

        txtG3T2.setEditable(false);

        txtG3T3.setEditable(false);

        txtG3T4.setEditable(false);

        txtG3T5.setEditable(false);

        txtG3T6.setEditable(false);

        txtG4T1.setEditable(false);

        txtG4T2.setEditable(false);

        txtG4T3.setEditable(false);

        txtG4T4.setEditable(false);

        txtG4T5.setEditable(false);

        txtG4T6.setEditable(false);

        txtG5T1.setEditable(false);

        txtG5T2.setEditable(false);

        txtG5T3.setEditable(false);

        txtG5T4.setEditable(false);

        txtG5T5.setEditable(false);

        txtG5T6.setEditable(false);

        txtG6T1.setEditable(false);

        txtG6T2.setEditable(false);

        txtG6T3.setEditable(false);

        txtG6T4.setEditable(false);

        txtG6T5.setEditable(false);

        txtG6T6.setEditable(false);

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("jMenuItem2");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(btnA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnH))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnX)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnV)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnB)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnK)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnL))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnQ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnW)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnY)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnO))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtG2T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG2T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG2T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG2T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG2T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG2T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtG1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG1T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtG3T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG3T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG3T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG3T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG3T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG3T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtG4T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG4T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG4T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG4T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG4T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG4T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtG5T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG5T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG5T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG5T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG5T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG5T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtG6T1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG6T2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG6T3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG6T4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG6T5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtG6T6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtG1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG1T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtG2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG2T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtG3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG3T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtG4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG4T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG4T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG4T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG4T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtG5T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG5T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG5T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG5T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG5T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG5T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtG6T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG6T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG6T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG6T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG6T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtG6T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQ)
                    .addComponent(btnW)
                    .addComponent(btnE)
                    .addComponent(btnR)
                    .addComponent(btnT)
                    .addComponent(btnY)
                    .addComponent(btnU)
                    .addComponent(btnI)
                    .addComponent(btnO)
                    .addComponent(btnP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnA)
                    .addComponent(btnS)
                    .addComponent(btnD)
                    .addComponent(btnF)
                    .addComponent(btnG)
                    .addComponent(btnH)
                    .addComponent(btnJ)
                    .addComponent(btnK)
                    .addComponent(btnL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnZ)
                    .addComponent(btnX)
                    .addComponent(btnC)
                    .addComponent(btnV)
                    .addComponent(btnB)
                    .addComponent(btnN)
                    .addComponent(btnM)
                    .addComponent(btnEnt))
                .addContainerGap())
        );

        pack();
    }
  
  public void attempt()
  {
      JTextField letters[] = new JTextField[6];
      String guess ="";
      
      if(tries == 1 )
      {                
          letters[0] = txtG1T1;
          letters[1] = txtG1T2;
          letters[2] = txtG1T3;
          letters[3] = txtG1T4;
          letters[4] = txtG1T5;
          letters[5] = txtG1T6;
          int correct=0;


          guess = letters[0].getText()+letters[1].getText()+letters[2].getText()+letters[3].getText()+letters[4].getText()+letters[5].getText();
          
          for (int i = 0; i < 6; i++) 
          {
              for(int j = 0; j<6;j++)
              {
                  letters[i].setBackground(Color.GRAY);
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.GRAY);
                            }
                        }
              }
              
              if(guess.charAt(i)==word.charAt(i))
              {
                  letters[i].setBackground(Color.green);
                  correct = correct +1;
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.green);
                            }
                        }
                  
              }
              for(int j = 0; j<6;j++)
              {
                        if (guess.charAt(i) == word.charAt(j) && guess.charAt(i) != word.charAt(i)) {
                        letters[i].setBackground(Color.yellow);
                        for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.yellow);
                            }
                        }
                    } 
              }

          }
          
          if (correct == 6)
          {
              JOptionPane.showMessageDialog(this,"You win");
          }
          
          tries = tries +1;
               for(int j = 0; j<6;j++)
              {
                  letters[j].setEditable(false);
              }
               txtG2T1.setEditable(true);
               txtG2T2.setEditable(true);
               txtG2T3.setEditable(true);
               txtG2T4.setEditable(true);
               txtG2T5.setEditable(true);
               txtG2T6.setEditable(true);
          
      }
      
      if(tries == 2 )
      {                
          letters[0] = txtG2T1;
          letters[1] = txtG2T2;
          letters[2] = txtG2T3;
          letters[3] = txtG2T4;
          letters[4] = txtG2T5;
          letters[5] = txtG2T6;
          int correct=0;


          guess = letters[0].getText()+letters[1].getText()+letters[2].getText()+letters[3].getText()+letters[4].getText()+letters[5].getText();
          
          for (int i = 0; i < 6; i++) 
          {
              if(guess.charAt(i)==word.charAt(i))
              {
                  letters[i].setBackground(Color.green);
                  correct = correct +1;
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.green);
                            }
                        }
              }
              for(int j = 0; j<6;j++)
              {
                        if (guess.charAt(i) == word.charAt(j) && guess.charAt(i) != word.charAt(i)) {
                        letters[i].setBackground(Color.yellow);
                        for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.yellow);
                            }
                        }
                    } 
              }

          }
          
          if (correct == 6)
          {
              JOptionPane.showMessageDialog(this,"You win");
          }
          
          tries = tries +1;
               for(int j = 0; j<6;j++)
              {
                  letters[j].setEditable(false);
              }
               txtG3T1.setEditable(true);
               txtG3T2.setEditable(true);
               txtG3T3.setEditable(true);
               txtG3T4.setEditable(true);
               txtG3T5.setEditable(true);
               txtG3T6.setEditable(true);
      }
       
      if(tries == 3 )
      {                
          letters[0] = txtG3T1;
          letters[1] = txtG3T2;
          letters[2] = txtG3T3;
          letters[3] = txtG3T4;
          letters[4] = txtG3T5;
          letters[5] = txtG3T6;
          int correct=0;


          guess = letters[0].getText()+letters[1].getText()+letters[2].getText()+letters[3].getText()+letters[4].getText()+letters[5].getText();
          
          for (int i = 0; i < 6; i++) 
          {
              if(guess.charAt(i)==word.charAt(i))
              {
                  letters[i].setBackground(Color.green);
                  correct = correct +1;
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.green);
                            }
                        }
              }
              for(int j = 0; j<6;j++)
              {
                        if (guess.charAt(i) == word.charAt(j) && guess.charAt(i) != word.charAt(i)) {
                        letters[i].setBackground(Color.yellow);
                        for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.yellow);
                            }
                        }
                    } 
              }

          }
          
          if (correct == 6)
          {
              JOptionPane.showMessageDialog(this,"You win");
          }
          
          tries = tries +1;
               for(int j = 0; j<6;j++)
              {
                  letters[j].setEditable(false);
              }
               txtG4T1.setEditable(true);
               txtG4T2.setEditable(true);
               txtG4T3.setEditable(true);
               txtG4T4.setEditable(true);
               txtG4T5.setEditable(true);
               txtG4T6.setEditable(true);
      }
      
      if(tries == 4 )
      {                
          letters[0] = txtG4T1;
          letters[1] = txtG4T2;
          letters[2] = txtG4T3;
          letters[3] = txtG4T4;
          letters[4] = txtG4T5;
          letters[5] = txtG4T6;
          int correct=0;


          guess = letters[0].getText()+letters[1].getText()+letters[2].getText()+letters[3].getText()+letters[4].getText()+letters[5].getText();
          
          for (int i = 0; i < 6; i++) 
          {
              if(guess.charAt(i)==word.charAt(i))
              {
                  letters[i].setBackground(Color.green);
                  correct = correct +1;
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.green);
                            }
                        }
              }
              for(int j = 0; j<6;j++)
              {
                        if (guess.charAt(i) == word.charAt(j) && guess.charAt(i) != word.charAt(i)) {
                        letters[i].setBackground(Color.yellow);
                        for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.yellow);
                            }
                        }
                    } 
              }

          }
          
          if (correct == 6)
          {
              JOptionPane.showMessageDialog(this,"You win");
          }
          
          tries = tries +1;
               for(int j = 0; j<6;j++)
              {
                  letters[j].setEditable(false);
              }
               txtG5T1.setEditable(true);
               txtG5T2.setEditable(true);
               txtG5T3.setEditable(true);
               txtG5T4.setEditable(true);
               txtG5T5.setEditable(true);
               txtG5T6.setEditable(true);
      }
 
      if(tries == 5 )
      {                
          letters[0] = txtG5T1;
          letters[1] = txtG5T2;
          letters[2] = txtG5T3;
          letters[3] = txtG5T4;
          letters[4] = txtG5T5;
          letters[5] = txtG5T6;
          int correct=0;


          guess = letters[0].getText()+letters[1].getText()+letters[2].getText()+letters[3].getText()+letters[4].getText()+letters[5].getText();
          
          for (int i = 0; i < 6; i++) 
          {
              if(guess.charAt(i)==word.charAt(i))
              {
                  letters[i].setBackground(Color.green);
                  correct = correct +1;
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.green);
                            }
                        }
              }
              for(int j = 0; j<6;j++)
              {
                        if (guess.charAt(i) == word.charAt(j) && guess.charAt(i) != word.charAt(i)) {
                        letters[i].setBackground(Color.yellow);
                        for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.yellow);
                            }
                        }
                    } 
              }

          }
          
          if (correct == 6)
          {
              JOptionPane.showMessageDialog(this,"You win");
          }
          
          tries = tries +1;
               for(int j = 0; j<6;j++)
              {
                  letters[j].setEditable(false);
              }
               txtG6T1.setEditable(true);
               txtG6T2.setEditable(true);
               txtG6T3.setEditable(true);
               txtG6T4.setEditable(true);
               txtG6T5.setEditable(true);
               txtG6T6.setEditable(true);
      }
      
      if(tries == 6 )
      {                
          letters[0] = txtG6T1;
          letters[1] = txtG6T2;
          letters[2] = txtG6T3;
          letters[3] = txtG6T4;
          letters[4] = txtG6T5;
          letters[5] = txtG6T6;
          int correct=0;


          guess = letters[0].getText()+letters[1].getText()+letters[2].getText()+letters[3].getText()+letters[4].getText()+letters[5].getText();
          
          for (int i = 0; i < 6; i++) 
          {
              if(guess.charAt(i)==word.charAt(i))
              {
                  letters[i].setBackground(Color.green);
                  correct = correct +1;
                  for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.green);
                            }
                        }
              }
              for(int j = 0; j<6;j++)
              {
                        if (guess.charAt(i) == word.charAt(j) && guess.charAt(i) != word.charAt(i)) {
                        letters[i].setBackground(Color.yellow);
                        for(int k=0;k<26;k++)
                        {
                            if(letters[i].getText().equals(alphabet[k].getText().toLowerCase()))
                            {
                                alphabet[k].setBackground(Color.yellow);
                            }
                        }
                    } 
              }

          }
          
          if (correct == 6)
          {
              JOptionPane.showMessageDialog(this,"You win");
          }
          
          tries = tries +1;
               for(int j = 0; j<6;j++)
              {
                  letters[j].setEditable(false);
              }
               txtG6T1.setEditable(false);
               txtG6T2.setEditable(false);
               txtG6T3.setEditable(false);
               txtG6T4.setEditable(false);
               txtG6T5.setEditable(false);
               txtG6T6.setEditable(false);
      }

  }
  
    public static void main(String[] args) {
        
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wordle().setVisible(true);
            }
        });
    }
    
    private javax.swing.JButton btnQ;
    private javax.swing.JButton btnP;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnJ;
    private javax.swing.JButton btnK;
    private javax.swing.JButton btnL;
    private javax.swing.JButton btnW;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnZ;
    private javax.swing.JButton btnX;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnV;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnM;
    private javax.swing.JButton btnEnt;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnR;
    private javax.swing.JButton btnT;
    private javax.swing.JButton btnY;
    private javax.swing.JButton btnU;
    private javax.swing.JButton btnI;
    private javax.swing.JButton btnO;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField txtG1T1;
    private javax.swing.JTextField txtG2T4;
    private javax.swing.JTextField txtG2T5;
    private javax.swing.JTextField txtG2T6;
    private javax.swing.JTextField txtG3T1;
    private javax.swing.JTextField txtG3T2;
    private javax.swing.JTextField txtG3T3;
    private javax.swing.JTextField txtG3T4;
    private javax.swing.JTextField txtG3T5;
    private javax.swing.JTextField txtG3T6;
    private javax.swing.JTextField txtG4T1;
    private javax.swing.JTextField txtG1T2;
    private javax.swing.JTextField txtG4T2;
    private javax.swing.JTextField txtG4T3;
    private javax.swing.JTextField txtG4T4;
    private javax.swing.JTextField txtG4T5;
    private javax.swing.JTextField txtG4T6;
    private javax.swing.JTextField txtG5T1;
    private javax.swing.JTextField txtG5T2;
    private javax.swing.JTextField txtG5T3;
    private javax.swing.JTextField txtG5T4;
    private javax.swing.JTextField txtG5T5;
    private javax.swing.JTextField txtG1T3;
    private javax.swing.JTextField txtG5T6;
    private javax.swing.JTextField txtG6T1;
    private javax.swing.JTextField txtG6T2;
    private javax.swing.JTextField txtG6T3;
    private javax.swing.JTextField txtG6T4;
    private javax.swing.JTextField txtG6T5;
    private javax.swing.JTextField txtG6T6;
    private javax.swing.JTextField txtG1T4;
    private javax.swing.JTextField txtG1T5;
    private javax.swing.JTextField txtG1T6;
    private javax.swing.JTextField txtG2T1;
    private javax.swing.JTextField txtG2T2;
    private javax.swing.JTextField txtG2T3;
    private int tries =1;
    private String word = "suffer";
    JButton alphabet[];
    

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource() == btnEnt)
        {
            attempt();
        }
        if(evt.getSource()==btnQ)
        {
            
        }
 
    }
}



