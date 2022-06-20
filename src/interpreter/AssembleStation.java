package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * In the interpreter.AssembleStation all produced end-ingredients get assembled
 * (Assemblers have a good payment and are over 18 of course)
 **/
public class AssembleStation {

    /**
     * Processing of assembling
     *
     * @param processedIngredients - End-Ingredients for assembling of oreos
     **/
    public List<Integer> assembleCookie(List<String> processedIngredients) {
        // assembled cookie
        List<Integer> assembledCookie = new ArrayList<Integer>();

        int accumulator = 0;
        int pointerIndex = 0;

        for (String ingredient : processedIngredients) {
            switch (ingredient) {
                case "O" -> {
                    pointerIndex++;
                    try {
                        accumulator = assembledCookie.get(pointerIndex);
                    } catch (IndexOutOfBoundsException e) {
                        accumulator = 0;
                    }
                }
                case "RE" -> accumulator++;
                case "&O" -> {
                    try {
                        assembledCookie.set(pointerIndex, accumulator);
                    } catch (IndexOutOfBoundsException e){
                        assembledCookie.add(accumulator);
                    }

                }
            }

        }
        CookieShop cookieShop = new CookieShop();
        cookieShop.displayCookie(assembledCookie);

        return assembledCookie;
    }

}
