import helpers.TextHelper;

import java.util.List;
import java.util.Scanner;

/**
 * The Delivery is the start of every Production-Chain.
 * The Delivery-Company (User) delivers all the needed Ingredients (input) for the cookies (output) to be baked
 *
 **/
public class IngredientsDelivery {
    public static void main(String[] args) {

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

        // Give the ingredients into the factory for further processing
        FactoryStation factoryStation = new FactoryStation();
        List<String> processedIngredients = factoryStation.checkIngredients(ingredients);

        //Process approved ingredients to a OREO
        AssembleStation assembleStation = new AssembleStation();
        assembleStation.assembleCookie(processedIngredients);

    }
}
