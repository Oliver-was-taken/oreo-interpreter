package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputView {
    private JLabel titleLabel;
    private JLabel inputFieldLabel;
    private JTextArea inputFieldArea;
    private JPanel contentPane;
    private JButton previousButton;
    private JButton nextButton;
    private static JFrame jFrame = new JFrame("Oreo Transpiler / Interpreter"); //creating instance of JFrame;

    public InputView(String inputLang, String outputLang) {

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(720, 400);
        jFrame.setVisible(true);

        inputFieldLabel.setText(inputFieldLabel.getText().replace("§", inputLang));

        jFrame.add(contentPane);

        //Previous Button Listener
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                OreoApplicationView.getjFrame().setVisible(true);
            }
        });

        //Next Button Listener
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                new OutputView(inputLang, outputLang, inputFieldArea.getText());
            }
        });
    }

    public static JFrame getjFrame() {
        return jFrame;
    }
}
