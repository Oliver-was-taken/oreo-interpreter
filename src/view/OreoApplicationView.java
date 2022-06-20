package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class OreoApplicationView extends JFrame {

    private JLabel inputLangTitle;
    private JLabel outputLangTitle;
    private JComboBox inputDropdown;
    private JComboBox outputDropdown;
    private JLabel titleArea;
    private JPanel contentPane;
    private JButton nextButton;
    private JLabel errorLabel;
    private static JFrame jFrame = new JFrame("Oreo Transpiler / Interpreter"); //creating instance of JFrame;

    public OreoApplicationView() throws HeadlessException {

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(720, 400);
        jFrame.setVisible(true);

        jFrame.add(contentPane);

        //Listener for next button
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputLang = (String) inputDropdown.getSelectedItem();
                String outputLang = (String) outputDropdown.getSelectedItem();

                if (Objects.equals(inputLang, outputLang)) {
                    errorLabel.setText("The two selected Languages must not be the same");
                } else {
                    errorLabel.setText("");
                    jFrame.setVisible(false);
                    new InputView(inputLang, outputLang);
                }

            }
        });
    }

    public static JFrame getjFrame() {
        return jFrame;
    }

    public JComboBox getInputDropdown() {
        return inputDropdown;
    }

    public JComboBox getOutputDropdown() {
        return outputDropdown;
    }
}
