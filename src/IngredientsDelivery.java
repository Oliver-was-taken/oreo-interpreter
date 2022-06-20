import helpers.TextHelper;
import interpreter.FactoryStation;
import view.OreoApplicationView;

import javax.swing.*;
import java.util.Scanner;

/**
 * The Delivery is the start of every Production-Chain.
 * The Delivery-Company (User) delivers all the needed Ingredients (input) for the cookies (output) to be baked
 **/
public class IngredientsDelivery {
    public static void main(String[] args) {

        //Create OptionPane
        String message = "Continue in GUI? \n (Transpiler only available in GUI)";
        String title = "GUI option";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            OreoApplicationView oreoApplicationView = new OreoApplicationView();
            // Add input selections
            oreoApplicationView.getInputDropdown().addItem("OREO");
            oreoApplicationView.getInputDropdown().addItem("Cow");
            oreoApplicationView.getInputDropdown().addItem("BrainFuck");

            //Add output selections
            oreoApplicationView.getOutputDropdown().addItem("OREO");
            oreoApplicationView.getOutputDropdown().addItem("Cow");
            oreoApplicationView.getOutputDropdown().addItem("BrainFuck");

        } else {
            // Console Styling
            TextHelper textHelper = new TextHelper();
            textHelper.generateStartText();
            textHelper.setTextColor();

            System.out.println();
            // Reading user input
            String ingredients = "";

            // getting ready to warmly receive the incoming ingredients
            Scanner deliverCheck = new Scanner(System.in);
            System.out.println("Please give me your delivery.. ");
            // receive the delivery
            ingredients = deliverCheck.nextLine();
            System.out.println("Processing your delivery.. Please wait.");

            FactoryStation factoryStation = new FactoryStation();
            factoryStation.processIngredients(ingredients);

        }
    }

}
