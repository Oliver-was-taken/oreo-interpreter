import java.util.ArrayList;
import java.util.List;

/**
 * In the first step, the ingredients go into the FactoryStation
 * <p>
 * Here the ingredients are processed to the main parts of an oreo (Dough and Cream)
 * But to do this the ingredients first must be checked for any flaws.
 **/
public class FactoryStation {

    /**
     * Everything must be checked for flaws
     *
     * Also, unused ingredients (You don't need Carrots for an oreo) get sorted out.
     * ! unused ingredients will be recycled of course !
     *
     * @param ingredients - ingredients delivered by user
     * @return produced dough and creme
     */
    public List<String> checkIngredients(String ingredients) {
        List<String> approvedIngredients = new ArrayList<>();
        for (int index = 0; index < ingredients.length(); index++) {
            char ingredient = ingredients.charAt(index);
            switch (ingredient) {
                case 'O' -> approvedIngredients.add("O");
                case 'R' -> {
                    if (ingredients.charAt(index + 1) == 'E') {
                        approvedIngredients.add("RE");
                        index++;
                    }
                }
                case '&' -> {
                    if (ingredients.charAt(index + 1) == 'O') {
                        approvedIngredients.add("&O");
                        index++;
                    }
                }
            }
        }
        return approvedIngredients;
    }
}
