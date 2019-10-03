/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingo;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;
import javax.swing.JButton;

/**
 *
 * @author Anh Vu Truong Nguyen
 */
public class Board extends javax.swing.JPanel {
    private final int BOARD_HEIGHT = 600;
    private final int BOARD_WIDTH = 600;
    private PriorityQueue <Integer> BQueue;
    private PriorityQueue <Integer> IQueue;
    private PriorityQueue <Integer> NQueue;
    private PriorityQueue <Integer> GQueue;
    private PriorityQueue <Integer> OQueue;
    private int [] BArray = new int [5];
    private int [] IArray = new int [5];
    private int [] NArray = new int [5];
    private int [] GArray = new int [5];
    private int [] OArray = new int [5];
    private Stack <Ball> ballsDrawn = new Stack ();
//    private Stack <Ball> ballsOnPool = new Stack ();
    private List <String> validChoice = new ArrayList <> ();
    private boolean [] isChosen = new boolean[25];
    private List <String> last3Balls = new ArrayList <> ();
    /**
     * Creates new form Board
     */
    public Board() {
        initComponents();
        // Instantiate the queue
        BQueue = new PriorityQueue ();
        IQueue = new PriorityQueue ();
        NQueue = new PriorityQueue ();
        GQueue = new PriorityQueue ();
        OQueue = new PriorityQueue ();
        // These lists will include numbers for different column
        // B, I, N, G, O
        List <Integer> numbersB = new ArrayList <> ();
        List <Integer> numbersI = new ArrayList <> ();
        List <Integer> numbersN = new ArrayList <> ();
        List <Integer> numbersG = new ArrayList <> ();
        List <Integer> numbersO = new ArrayList <> ();
        
        for (int i = 1; i < 16; i++) {
            numbersB.add(i);
        }
        for (int i = 16; i < 31; i++) {
            numbersI.add(i);
        }
        for (int i = 31; i < 46; i++) {
            numbersN.add(i);
        }
        for (int i = 46; i < 61; i++) {
            numbersG.add(i);
        }
        for (int i = 61; i < 76; i++) {
            numbersO.add(i);
        }
        // This is to prevent the duplicate of numbers
        Collections.shuffle(numbersB);
        Collections.shuffle(numbersI);
        Collections.shuffle(numbersN);
        Collections.shuffle(numbersG);
        Collections.shuffle(numbersO);
        
        for (int i = 0; i < 5; i++) {
            BArray[i] = numbersB.get(i);
        }
        for (int i = 0; i < 5; i++) {
            IArray[i] = numbersI.get(i);
        }
        for (int i = 0; i < 5; i++) {
            NArray[i] = numbersN.get(i);
        }
        for (int i = 0; i < 5; i++) {
            GArray[i] = numbersG.get(i);
        }
        for (int i = 0; i < 5; i++) {
            OArray[i] = numbersO.get(i);
        }
        // Add numbers to queue
        for (int i = 0; i < 5; i++) {
            BQueue.add(BArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            IQueue.add(IArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            NQueue.add(NArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            GQueue.add(GArray[i]);
        }
        for (int i = 0; i < 5; i++) {
            OQueue.add(OArray[i]);
        }
        // Label buttons with numebers
        Button1.setText(BQueue.remove().toString());
        Button6.setText(BQueue.remove().toString());
        Button11.setText(BQueue.remove().toString());
        Button16.setText(BQueue.remove().toString());
        Button21.setText(BQueue.remove().toString());
        
        Button2.setText(IQueue.remove().toString());
        Button7.setText(IQueue.remove().toString());
        Button12.setText(IQueue.remove().toString());
        Button17.setText(IQueue.remove().toString());
        Button22.setText(IQueue.remove().toString());
        
        Button3.setText(NQueue.remove().toString());
        Button8.setText(NQueue.remove().toString());
        Button13.setText(NQueue.remove().toString());
        Button18.setText(NQueue.remove().toString());
        Button23.setText(NQueue.remove().toString());
        
        Button4.setText(GQueue.remove().toString());
        Button9.setText(GQueue.remove().toString());
        Button14.setText(GQueue.remove().toString());
        Button19.setText(GQueue.remove().toString());
        Button24.setText(GQueue.remove().toString());
        
        Button5.setText(OQueue.remove().toString());
        Button10.setText(OQueue.remove().toString());
        Button15.setText(OQueue.remove().toString());
        Button20.setText(OQueue.remove().toString());
        Button25.setText(OQueue.remove().toString());
        // initialize the isChosen array with all false
        for (int i = 0; i < 25; i++) {
            isChosen[i] = false;
        }
        // the specific status should be changed later 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button10 = new javax.swing.JButton();
        Button11 = new javax.swing.JButton();
        Button12 = new javax.swing.JButton();
        Button13 = new javax.swing.JButton();
        Button14 = new javax.swing.JButton();
        Button15 = new javax.swing.JButton();
        Button16 = new javax.swing.JButton();
        Button17 = new javax.swing.JButton();
        Button18 = new javax.swing.JButton();
        Button19 = new javax.swing.JButton();
        Button20 = new javax.swing.JButton();
        Button21 = new javax.swing.JButton();
        Button22 = new javax.swing.JButton();
        Button23 = new javax.swing.JButton();
        Button24 = new javax.swing.JButton();
        Button25 = new javax.swing.JButton();

        setPreferredSize(new Dimension (BOARD_HEIGHT, BOARD_WIDTH));
        setLayout(new java.awt.GridLayout(5, 5));

        Button1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button1.setText("jButton1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        add(Button1);

        Button2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button2.setText("jButton2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        add(Button2);

        Button3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button3.setText("jButton3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        add(Button3);

        Button4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button4.setText("jButton6");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        add(Button4);

        Button5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button5.setText("jButton4");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        add(Button5);

        Button6.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button6.setText("jButton8");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        add(Button6);

        Button7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button7.setText("jButton7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        add(Button7);

        Button8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button8.setText("jButton11");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        add(Button8);

        Button9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button9.setText("jButton5");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        add(Button9);

        Button10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button10.setText("jButton12");
        Button10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button10ActionPerformed(evt);
            }
        });
        add(Button10);

        Button11.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button11.setText("jButton9");
        Button11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button11ActionPerformed(evt);
            }
        });
        add(Button11);

        Button12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button12.setText("jButton16");
        Button12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button12ActionPerformed(evt);
            }
        });
        add(Button12);

        Button13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button13.setText("jButton13");
        Button13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button13ActionPerformed(evt);
            }
        });
        add(Button13);

        Button14.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button14.setText("jButton10");
        Button14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button14ActionPerformed(evt);
            }
        });
        add(Button14);

        Button15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button15.setText("jButton21");
        Button15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button15ActionPerformed(evt);
            }
        });
        add(Button15);

        Button16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button16.setText("jButton17");
        Button16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button16ActionPerformed(evt);
            }
        });
        add(Button16);

        Button17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button17.setText("jButton14");
        Button17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button17ActionPerformed(evt);
            }
        });
        add(Button17);

        Button18.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button18.setText("jButton15");
        Button18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button18ActionPerformed(evt);
            }
        });
        add(Button18);

        Button19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button19.setText("jButton18");
        Button19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button19ActionPerformed(evt);
            }
        });
        add(Button19);

        Button20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button20.setText("jButton24");
        Button20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button20ActionPerformed(evt);
            }
        });
        add(Button20);

        Button21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button21.setText("jButton19");
        Button21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button21ActionPerformed(evt);
            }
        });
        add(Button21);

        Button22.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button22.setText("jButton20");
        Button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button22ActionPerformed(evt);
            }
        });
        add(Button22);

        Button23.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button23.setText("jButton22");
        Button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button23ActionPerformed(evt);
            }
        });
        add(Button23);

        Button24.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button24.setText("jButton23");
        Button24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button24ActionPerformed(evt);
            }
        });
        add(Button24);

        Button25.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Button25.setText("jButton25");
        Button25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button25ActionPerformed(evt);
            }
        });
        add(Button25);
    }// </editor-fold>//GEN-END:initComponents

    private void Button13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button13ActionPerformed
        if (Button13.getBackground() == Color.red) {
            isChosen[12] = false;
            Button13.setBackground(new JButton().getBackground());
        } else {
            Button13.setBackground(Color.red);
            isChosen[12] = true;
        }
    }//GEN-LAST:event_Button13ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if (Button1.getBackground() == Color.red) {
            isChosen[0] = false;
            Button1.setBackground(new JButton().getBackground());
        } else {
            Button1.setBackground(Color.red);
            isChosen[0] = true;
        }
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if (Button2.getBackground() == Color.red) {
            isChosen[1] = false;
            Button2.setBackground(new JButton().getBackground());
        } else {
            Button2.setBackground(Color.red);
            isChosen[1] = true;
        }
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        if (Button3.getBackground() == Color.red) {
            isChosen[2] = false;
            Button3.setBackground(new JButton().getBackground());
        } else {
            Button3.setBackground(Color.red);
            isChosen[2] = true;
        }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        if (Button4.getBackground() == Color.red) {
            isChosen[3] = false;
            Button4.setBackground(new JButton().getBackground());
        } else {
            Button4.setBackground(Color.red);
            isChosen[3] = true;
        }
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if (Button5.getBackground() == Color.red) {
            isChosen[4] = false;
            Button5.setBackground(new JButton().getBackground());
        } else {
            Button5.setBackground(Color.red);
            isChosen[4] = true;
        }
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if (Button6.getBackground() == Color.red) {
            isChosen[5] = false;
            Button6.setBackground(new JButton().getBackground());
        } else {
            Button6.setBackground(Color.red);
            isChosen[5] = true;
        }
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        if (Button7.getBackground() == Color.red) {
            isChosen[6] = false;
            Button7.setBackground(new JButton().getBackground());
        } else {
            Button7.setBackground(Color.red);
            isChosen[6] = true;
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        if (Button8.getBackground() == Color.red) {
            isChosen[7] = false;
            Button8.setBackground(new JButton().getBackground());
        } else {
            Button8.setBackground(Color.red);
            isChosen[7] = true;
        }
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        if (Button9.getBackground() == Color.red) {
            isChosen[8] = false;
            Button9.setBackground(new JButton().getBackground());
        } else {
            Button9.setBackground(Color.red);
            isChosen[8] = true;
        }
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button10ActionPerformed
        if (Button10.getBackground() == Color.red) {
            isChosen[9] = false;
            Button10.setBackground(new JButton().getBackground());
        } else {
            Button10.setBackground(Color.red);
            isChosen[9] = true;
        }
    }//GEN-LAST:event_Button10ActionPerformed

    private void Button11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button11ActionPerformed
        if (Button11.getBackground() == Color.red) {
            isChosen[10] = false;
            Button11.setBackground(new JButton().getBackground());
        } else {
            Button11.setBackground(Color.red);
            isChosen[10] = true;
        }
    }//GEN-LAST:event_Button11ActionPerformed

    private void Button12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button12ActionPerformed
        if (Button12.getBackground() == Color.red) {
            isChosen[11] = false;
            Button12.setBackground(new JButton().getBackground());
        } else {
            Button12.setBackground(Color.red);
            isChosen[11] = true;
        }
    }//GEN-LAST:event_Button12ActionPerformed

    private void Button14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button14ActionPerformed
        if (Button14.getBackground() == Color.red) {
            isChosen[13] = false;
            Button14.setBackground(new JButton().getBackground());
        } else {
            Button14.setBackground(Color.red);
            isChosen[13] = true;
        }
    }//GEN-LAST:event_Button14ActionPerformed

    private void Button15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button15ActionPerformed
        if (Button15.getBackground() == Color.red) {
            isChosen[14] = false;
            Button15.setBackground(new JButton().getBackground());
        } else {
            Button15.setBackground(Color.red);
            isChosen[14] = true;
        }
    }//GEN-LAST:event_Button15ActionPerformed

    private void Button16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button16ActionPerformed
        if (Button16.getBackground() == Color.red) {
            isChosen[15] = false;
            Button16.setBackground(new JButton().getBackground());
        } else {
            Button16.setBackground(Color.red);
            isChosen[15] = true;
        }
    }//GEN-LAST:event_Button16ActionPerformed

    private void Button17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button17ActionPerformed
        if (Button17.getBackground() == Color.red) {
            isChosen[16] = false;
            Button17.setBackground(new JButton().getBackground());
        } else {
            Button17.setBackground(Color.red);
            isChosen[16] = true;
        }
    }//GEN-LAST:event_Button17ActionPerformed

    private void Button18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button18ActionPerformed
        if (Button18.getBackground() == Color.red) {
            isChosen[17] = false;
            Button18.setBackground(new JButton().getBackground());
        } else {
            Button18.setBackground(Color.red);
            isChosen[17] = true;
        }
    }//GEN-LAST:event_Button18ActionPerformed

    private void Button19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button19ActionPerformed
        if (Button19.getBackground() == Color.red) {
            isChosen[18] = false;
            Button19.setBackground(new JButton().getBackground());
        } else {
            Button19.setBackground(Color.red);
            isChosen[18] = true;
        }
    }//GEN-LAST:event_Button19ActionPerformed

    private void Button20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button20ActionPerformed
        if (Button20.getBackground() == Color.red) {
            isChosen[19] = false;
            Button20.setBackground(new JButton().getBackground());
        } else {
            Button20.setBackground(Color.red);
            isChosen[19] = true;
        }
    }//GEN-LAST:event_Button20ActionPerformed

    private void Button21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button21ActionPerformed
        if (Button21.getBackground() == Color.red) {
            isChosen[20] = false;
            Button21.setBackground(new JButton().getBackground());
        } else {
            Button21.setBackground(Color.red);
            isChosen[20] = true;
        }
    }//GEN-LAST:event_Button21ActionPerformed

    private void Button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button22ActionPerformed
        if (Button22.getBackground() == Color.red) {
            isChosen[20] = false;
            Button22.setBackground(new JButton().getBackground());
        } else {
            Button22.setBackground(Color.red);
            isChosen[21] = true;
        }
    }//GEN-LAST:event_Button22ActionPerformed

    private void Button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button23ActionPerformed
        if (Button23.getBackground() == Color.red) {
            isChosen[22] = false;
            Button23.setBackground(new JButton().getBackground());
        } else {
            Button23.setBackground(Color.red);
            isChosen[22] = true;
        }
    }//GEN-LAST:event_Button23ActionPerformed

    private void Button24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button24ActionPerformed
        if (Button24.getBackground() == Color.red) {
            isChosen[23] = false;
            Button24.setBackground(new JButton().getBackground());
        } else {
            Button24.setBackground(Color.red);
            isChosen[23] = true;
        }
    }//GEN-LAST:event_Button24ActionPerformed

    private void Button25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button25ActionPerformed
        if (Button25.getBackground() == Color.red) {
            isChosen[24] = false;
            Button25.setBackground(new JButton().getBackground());
        } else {
            Button25.setBackground(Color.red);
            isChosen[24] = true;
        }
    }//GEN-LAST:event_Button25ActionPerformed

    public void undo () {
        ballsDrawn.pop();
    }
    
    public boolean bingo () {
        boolean isBingo = true;
        isBingo = (isChosen[0] && isChosen[1] && isChosen[2] && isChosen[3] && isChosen[4]) ||
                (isChosen[5] && isChosen[6] && isChosen[7] && isChosen[8] && isChosen[9]) ||
                (isChosen[10] && isChosen[11] && isChosen[12] && isChosen[13] && isChosen[14]) ||
                (isChosen[15] && isChosen[16] && isChosen[17] && isChosen[18] && isChosen[19]) ||
                (isChosen[20] && isChosen[21] && isChosen[22] && isChosen[23] && isChosen[24]) ||
                (isChosen[0] && isChosen[5] && isChosen[10] && isChosen[15] && isChosen[20]) ||
                (isChosen[1] && isChosen[6] && isChosen[11] && isChosen[16] && isChosen[21]) ||
                (isChosen[2] && isChosen[7] && isChosen[12] && isChosen[17] && isChosen[22]) ||
                (isChosen[3] && isChosen[8] && isChosen[13] && isChosen[18] && isChosen[23]) ||
                (isChosen[4] && isChosen[9] && isChosen[14] && isChosen[19] && isChosen[24]) ||
                (isChosen[0] && isChosen[6] && isChosen[12] && isChosen[18] && isChosen[24]) ||
                (isChosen[4] && isChosen[8] && isChosen[12] && isChosen[16] && isChosen[20]);
        
        return isBingo;
    }
    
    public int getNumberPressed () {
        int NumberPressed = 0;
        for (int i = 0; i < 25; i++) {
            if (isChosen[i]) {
                NumberPressed ++;
            }
        }
        return NumberPressed;
    }
    
    public void drawBalls (String BoardIndex) {
        ballsDrawn.push(new Ball (BoardIndex));
        validChoice.add(BoardIndex);
    }
    
    public String getCurrentBall () {
        return ballsDrawn.peek().getBoardIndex();
    }
    
    public boolean validation () {
        boolean isAllTrue;
        List <Integer> choseButton = new ArrayList <> ();
        List <String> choseBoardIndex = new ArrayList <> ();
        for (int i = 0; i < 25; i++) { 
            if (isChosen[i]) {
                choseButton.add(i + 1);
            }
        }
        String [] ArrayOfBoardIndex = new String [25];
        for (int i = 0; i < 25; i++) {
            ArrayOfBoardIndex[i] = " "; 
        }
        ArrayOfBoardIndex[0] = "B" + Button1.getText();
        ArrayOfBoardIndex[5] = "B" + Button6.getText();
        ArrayOfBoardIndex[10] = "B" + Button11.getText();
        ArrayOfBoardIndex[15] = "B" + Button16.getText();
        ArrayOfBoardIndex[20] = "B" + Button21.getText();
        ArrayOfBoardIndex[1] = "I" + Button2.getText();
        ArrayOfBoardIndex[6] = "I" + Button7.getText();
        ArrayOfBoardIndex[11] = "I" + Button12.getText();
        ArrayOfBoardIndex[16] = "I" + Button17.getText();
        ArrayOfBoardIndex[21] = "I" + Button22.getText();
        ArrayOfBoardIndex[2] = "N" + Button3.getText();
        ArrayOfBoardIndex[7] = "N" + Button8.getText();
        ArrayOfBoardIndex[12] = "N" + Button13.getText();
        ArrayOfBoardIndex[17] = "N" + Button18.getText();
        ArrayOfBoardIndex[22] = "N" + Button23.getText();
        ArrayOfBoardIndex[3] = "G" + Button4.getText();
        ArrayOfBoardIndex[8] = "G" + Button9.getText();
        ArrayOfBoardIndex[13] = "G" + Button14.getText();
        ArrayOfBoardIndex[18] = "G" + Button19.getText();
        ArrayOfBoardIndex[23] = "G" + Button24.getText();
        ArrayOfBoardIndex[4] = "O" + Button5.getText();
        ArrayOfBoardIndex[9] = "O" + Button10.getText();
        ArrayOfBoardIndex[14] = "O" + Button15.getText();
        ArrayOfBoardIndex[19] = "O" + Button20.getText();
        ArrayOfBoardIndex[24] = "O" + Button25.getText();
        
        for (int i = 0; i < choseButton.size(); i++) {
            if (null != choseButton.get(i)) switch (choseButton.get(i)) {
                case 1:
                    choseBoardIndex.add(ArrayOfBoardIndex[0]);
                    break;
                case 2:
                    choseBoardIndex.add(ArrayOfBoardIndex[1]);
                    break;
                case 3:
                    choseBoardIndex.add(ArrayOfBoardIndex[2]);
                    break;
                case 4:
                    choseBoardIndex.add(ArrayOfBoardIndex[3]);
                    break;
                case 5:
                    choseBoardIndex.add(ArrayOfBoardIndex[4]);
                    break;
                case 6:
                    choseBoardIndex.add(ArrayOfBoardIndex[5]);
                    break;
                case 7:
                    choseBoardIndex.add(ArrayOfBoardIndex[6]);
                    break;
                case 8:
                    choseBoardIndex.add(ArrayOfBoardIndex[7]);
                    break;
                case 9:
                    choseBoardIndex.add(ArrayOfBoardIndex[8]);
                    break;
                case 10:
                    choseBoardIndex.add(ArrayOfBoardIndex[9]);
                    break;
                case 11:
                    choseBoardIndex.add(ArrayOfBoardIndex[10]);
                    break;
                case 12:
                    choseBoardIndex.add(ArrayOfBoardIndex[11]);
                    break;
                case 13:
                    choseBoardIndex.add(ArrayOfBoardIndex[12]);
                    break;
                case 14:
                    choseBoardIndex.add(ArrayOfBoardIndex[13]);
                    break;
                case 15:
                    choseBoardIndex.add(ArrayOfBoardIndex[14]);
                    break;
                case 16:
                    choseBoardIndex.add(ArrayOfBoardIndex[15]);
                    break;
                case 17:
                    choseBoardIndex.add(ArrayOfBoardIndex[16]);
                    break;
                case 18:
                    choseBoardIndex.add(ArrayOfBoardIndex[17]);
                    break;
                case 19:
                    choseBoardIndex.add(ArrayOfBoardIndex[18]);
                    break;
                case 20:
                    choseBoardIndex.add(ArrayOfBoardIndex[19]);
                    break;
                case 21:
                    choseBoardIndex.add(ArrayOfBoardIndex[20]);
                    break;
                case 22:
                    choseBoardIndex.add(ArrayOfBoardIndex[21]);
                    break;
                case 23:
                    choseBoardIndex.add(ArrayOfBoardIndex[22]);
                    break;
                case 24:
                    choseBoardIndex.add(ArrayOfBoardIndex[23]);
                    break;
                case 25: 
                    choseBoardIndex.add(ArrayOfBoardIndex[24]);
                    break;
                default:
                    break;
            }
        }
        // loop through the choseBoardIndex to see if the element
        // is valid or not (in the valid choice array)
        System.out.print(choseBoardIndex.size());
        isAllTrue = validChoice.containsAll(choseBoardIndex);
        return isAllTrue;
    }
    
    public void getLast3Balls () {
        // The temporary array to store the last 3 balls
        // clear the array of balls
        this.last3Balls.clear();
        List <Ball> ballList = new ArrayList <> ();
        List <String> stringList = new ArrayList <> ();
        // get the top 3 balls from the stack
        if (ballsDrawn.size() < 3) {
            for (int i = 0; i < ballsDrawn.size(); i++) {
                ballList.add(ballsDrawn.pop());
            }
            for (int i = 0; i < ballList.size(); i++) {
                stringList.add(ballList.get(i).getBoardIndex());
            }
            for (int i = 0; i < ballList.size(); i++) {
                last3Balls.add(stringList.get(i));
            }
            for (int i = stringList.size() - 1; i >= 0; i--) {
                ballsDrawn.push(ballList.get(i));
            }
        } else {
            for (int i = 0; i < 3; i++) {
                ballList.add(ballsDrawn.pop());
            }
            for (int i = 0; i < ballList.size(); i++) {
                stringList.add(ballList.get(i).getBoardIndex());
            }
            for (int i = 0; i < ballList.size(); i++) {
                last3Balls.add(stringList.get(i));
            }
            for (int i = stringList.size() - 1; i >= 0; i--) {
                ballsDrawn.push(ballList.get(i));
            }
        }
    }
    
    public void getAllStack () {
        for (int i = 0; i < ballsDrawn.size(); i++) {
            System.out.print(ballsDrawn.get(i).getBoardIndex() + " ");
        }
    } 
    
    public String getBall1 () {
        if (last3Balls.size() < 1) {
            return " ";
        } else {
            return last3Balls.get(0);
        }
    } 

    public String getBall2 () {
        if (last3Balls.size() < 2) {
            return " ";
        } else {
            return last3Balls.get(1);
        }
    }
    
    public String getBall3 () {
        if (last3Balls.size() < 3) {
            return " ";
        } else {
            return last3Balls.get(2); 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button10;
    private javax.swing.JButton Button11;
    private javax.swing.JButton Button12;
    private javax.swing.JButton Button13;
    private javax.swing.JButton Button14;
    private javax.swing.JButton Button15;
    private javax.swing.JButton Button16;
    private javax.swing.JButton Button17;
    private javax.swing.JButton Button18;
    private javax.swing.JButton Button19;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button20;
    private javax.swing.JButton Button21;
    private javax.swing.JButton Button22;
    private javax.swing.JButton Button23;
    private javax.swing.JButton Button24;
    private javax.swing.JButton Button25;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    // End of variables declaration//GEN-END:variables
}
