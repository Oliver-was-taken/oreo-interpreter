package helpers;

public class TextHelper {

    //Color Codes for colored console
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_PURPLE = "\u001B[35m";

    public void generateStartText() {
        System.out.println(ANSI_BLUE);
        System.out.println("(/////////////////////////)");
        System.out.println(" (\\                     /)");
        System.out.println("  (\\ " + ANSI_PURPLE + "OREO Interpreter" + ANSI_BLUE + "  /) ");
        System.out.println("   (\\                 /) ");
        System.out.println("    (/////////////////)   ");
        System.out.println(ANSI_RESET);
    }

    public void setTextColor() {
        System.out.println(ANSI_PURPLE);
    }
}
