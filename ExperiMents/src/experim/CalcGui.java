package experim;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcGui extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton buttonZero;
    private JButton buttonOne;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFour;
    private JButton buttonFive;
    private JButton buttonSix;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonNine;

    private JButton opButtonPlus;
    private JButton opButtonMinus;
    private JButton opButtonDivide;
    private JButton opButtonMultiply;
    private JButton opButtonEquals;
    private JButton opButtonClear;

    private TextField tf;

    private JPanel numButtonPanel;
    private JPanel opButtonPanel;
    private JPanel basePanel;

    public CalcGui(){
        super("Scientific Calculator");
        basePanel = new JPanel();
        numButtonPanel = new JPanel(new GridLayout(0,4));
        opButtonPanel = new JPanel(new GridLayout(0,1));

        tf = new TextField(20);
        tf.setEditable(false);
        basePanel.add(tf);

         buttonZero = new JButton("0");
         numButtonPanel.add(buttonZero);
         buttonOne = new JButton("1");
         numButtonPanel.add(buttonOne);
         buttonTwo = new JButton("2");
         numButtonPanel.add(buttonTwo);
         buttonThree = new JButton("3");
         numButtonPanel.add(buttonThree);
         buttonFour = new JButton("4");
         numButtonPanel.add(buttonFour);
         buttonFive = new JButton("5");
         numButtonPanel.add(buttonFive);
         buttonSix = new JButton("6");
         numButtonPanel.add(buttonSix);
         buttonSeven = new JButton("7");
         numButtonPanel.add(buttonSeven);
         buttonEight = new JButton("8");
         numButtonPanel.add(buttonEight);
         buttonNine = new JButton("9");
         numButtonPanel.add(buttonNine);

         basePanel.add(numButtonPanel);

        opButtonPlus = new JButton("+");
        opButtonMinus = new JButton("-");
        opButtonDivide = new JButton("/");
        opButtonMultiply = new JButton("*");
        opButtonEquals = new JButton("=");
        opButtonClear = new JButton("C");

        opButtonPanel.add(opButtonPlus);
        opButtonPanel.add(opButtonMinus);
        opButtonPanel.add(opButtonDivide);
        opButtonPanel.add(opButtonMultiply);
        opButtonPanel.add(opButtonEquals);
        opButtonPanel.add(opButtonClear);

        basePanel.add(opButtonPanel);

        add(basePanel);

        HandlerClass handler = new HandlerClass();

        buttonZero.addActionListener(handler);
        buttonOne.addActionListener(handler);
        buttonTwo.addActionListener(handler);
        buttonThree.addActionListener(handler);
        buttonFour.addActionListener(handler);
        buttonFive.addActionListener(handler);
        buttonSix.addActionListener(handler);
        buttonSeven.addActionListener(handler);
        buttonEight.addActionListener(handler);
        buttonNine.addActionListener(handler);

        opButtonPlus.addActionListener(handler);
        opButtonMinus.addActionListener(handler);
        opButtonDivide.addActionListener(handler);
        opButtonMultiply.addActionListener(handler);
        opButtonEquals.addActionListener(handler);
        opButtonClear.addActionListener(handler);

    }


    private class HandlerClass implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String alreadyDisplayed = tf.getText();
            if(e.getSource()==buttonZero){
                String buttonZeroText = alreadyDisplayed + buttonZero.getText();
                tf.setText(buttonZeroText);
            }else if(e.getSource()==buttonOne){
                String buttonOneText = alreadyDisplayed + buttonOne.getText();
                tf.setText(buttonOneText);
            }else if(e.getSource()==buttonTwo){
                String buttonTwoText = alreadyDisplayed + buttonTwo.getText();
                tf.setText(buttonTwoText);
            }else if(e.getSource()==buttonThree){
                String buttonThreeText = alreadyDisplayed + buttonThree.getText();
                tf.setText(buttonThreeText);
            }else if(e.getSource()==buttonFour){
                String buttonFourText = alreadyDisplayed + buttonFour.getText();
                tf.setText(buttonFourText);
            }else if(e.getSource()==buttonFive){
                String buttonFiveText = alreadyDisplayed + buttonFive.getText();
                tf.setText(buttonFiveText);
            }else if(e.getSource()==buttonSix){
                String buttonSixText = alreadyDisplayed + buttonSix.getText();
                tf.setText(buttonSixText);
            }else if(e.getSource()==buttonSeven){
                String buttonSevenText = alreadyDisplayed + buttonSeven.getText();
                tf.setText(buttonSevenText);
            }else if(e.getSource()==buttonEight){
                String buttonEightText = alreadyDisplayed + buttonEight.getText();
                tf.setText(buttonEightText);
            }else if(e.getSource()==buttonNine){
                String buttonNineText = alreadyDisplayed + buttonNine.getText();
                tf.setText(buttonNineText);
            }else if(e.getSource()==opButtonPlus){
                String opButtonPlusText = alreadyDisplayed + opButtonPlus.getText();
                tf.setText(opButtonPlusText);
            }else if(e.getSource()==opButtonEquals){
                String opButtonEqualsText = alreadyDisplayed + opButtonEquals.getText();
                tf.setText(opButtonEqualsText);
            }else if(e.getSource()==opButtonMinus){
                String opButtonMinusText = alreadyDisplayed + opButtonMinus.getText();
                tf.setText(opButtonMinusText);
            }else if(e.getSource()==opButtonMultiply){
                String opButtonMultiplyText = alreadyDisplayed + opButtonMultiply.getText();
                tf.setText(opButtonMultiplyText);
            }else if(e.getSource()==opButtonDivide){
                String opButtonDivideText = alreadyDisplayed + opButtonDivide.getText();
                tf.setText(opButtonDivideText);
            }else if(e.getSource()==opButtonClear){
                String opButtonClearText = "";
                tf.setText(opButtonClearText);
            }

            double result=0.0;
            for(int i=0; i<alreadyDisplayed.length();i++){

                if(e.getSource()==opButtonEquals){

                    if(alreadyDisplayed.charAt(i)=='+'){
                        result = Double.parseDouble(alreadyDisplayed.substring(0,i)) + Double.parseDouble(alreadyDisplayed.substring(i+1,alreadyDisplayed.length()));
                        tf.setText(alreadyDisplayed + "=" + result);
                    }else if(alreadyDisplayed.charAt(i)=='-'){
                        result = Double.parseDouble(alreadyDisplayed.substring(0,i)) - Double.parseDouble(alreadyDisplayed.substring(i+1,alreadyDisplayed.length()));
                        tf.setText(alreadyDisplayed + "=" + result);
                    }else if(alreadyDisplayed.charAt(i)=='/'){
                        result = Double.parseDouble(alreadyDisplayed.substring(0,i)) / Double.parseDouble(alreadyDisplayed.substring(i+1,alreadyDisplayed.length()));
                        tf.setText(alreadyDisplayed + "=" + result);
                    }else if(alreadyDisplayed.charAt(i)=='*'){
                        result = Double.parseDouble(alreadyDisplayed.substring(0,i)) * Double.parseDouble(alreadyDisplayed.substring(i+1,alreadyDisplayed.length()));
                        tf.setText(alreadyDisplayed + "=" + result);
                    }
                }
            }

        }
    }}
