package view;

import interpreter.FactoryStation;
import transpiler.TranslateLang;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OutputView {
    private JLabel titleLabel;
    private JLabel inputLabel;
    private JLabel transLangLabel;
    private JLabel interOutputLabel;
    private JTextPane interOutTextField;
    private JTextPane transLangTextField;
    private JTextPane inputExpTextField;
    private JPanel contentPane;
    private JButton previousButton;
    private JButton nextButton;
    private JLabel infoLabel;
    private static JFrame jFrame = new JFrame("Oreo Transpiler / Interpreter"); //creating instance of JFrame;

    public OutputView(String inputLang, String outputLang, String exp) {

        TranslateLang translateLang = new TranslateLang();
        FactoryStation factoryStation = new FactoryStation();

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(720, 400);
        jFrame.setVisible(true);

        jFrame.add(contentPane);
        inputExpTextField.setEditable(false);
        transLangTextField.setEditable(false);
        interOutTextField.setEditable(false);

        //Set labels
        inputLabel.setText(inputLabel.getText().replace("§", inputLang));
        transLangLabel.setText(transLangLabel.getText().replace("§", inputLang).replace("$", outputLang));

        //Set field-values
        inputExpTextField.setText(exp);
        transLangTextField.setText(translateLang.initTranslate(inputLang, outputLang, exp));
        interOutTextField.setText(factoryStation.processIngredients(exp).toString().replace("[", "").replace("]", ""));


        //Previous Button Listener
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false);
                InputView.getjFrame().setVisible(true);
            }
        });

        //Next Button Listener
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JLabel getInputLabel() {
        return inputLabel;
    }

    public JLabel getTransLangLabel() {
        return transLangLabel;
    }

    public JLabel getInterOutputLabel() {
        return interOutputLabel;
    }

    public JTextPane getInterOutTextField() {
        return interOutTextField;
    }

    public JTextPane getTransLangTextField() {
        return transLangTextField;
    }

    public JTextPane getInputExpTextField() {
        return inputExpTextField;
    }
}
