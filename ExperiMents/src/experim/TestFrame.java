package experim;

import javax.swing.*;

public class TestFrame {

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }

            private void createAndShowGUI() {
                JFrame frame = new JFrame("Test");
                System.out.println(SwingUtilities.isEventDispatchThread());
                frame.getContentPane().add(new JButton("hello"));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }
}