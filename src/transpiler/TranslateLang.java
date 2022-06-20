package transpiler;

import java.util.Objects;

public class TranslateLang {
    public String initTranslate(String inLang, String outLang, String exp) {
        String transpiledLang = "";

        switch (outLang) {
            case "OREO" -> transpiledLang = transpileToOreo(inLang, exp);
            case "Cow" -> transpiledLang = transpileToCow(inLang, exp);
            case "BrainFuck" -> transpiledLang = transpileToBF(inLang, exp);
            default -> throw new RuntimeException("invalid language" + outLang);
        }
        return transpiledLang;
    }

    private String transpileToBF(String inLang, String exp) {
        String transpiledLang = "";

        //OREO -> BrainFuck
        if (Objects.equals(inLang, "OREO")) {
            transpiledLang = exp.replace("&O", ".")
                    .replace("O", ">")
                    .replace("RE", "+");

            //Cow -> brainfuck
        } else if (Objects.equals(inLang, "Cow")) {
            transpiledLang = exp.replace("mOo", "<")
                    .replace("moO", ">")
                    .replace("Moo", ".")
                    .replace("MOo", "-")
                    .replace("MoO", "+")
                    .replace("OOO", "[-]")
                    .replace("OOM", ".")
                    .replace("oom", ",")
                    .replace(" ", "");

        }

        return transpiledLang;
    }

    private String transpileToOreo(String inLang, String exp) {
        String transpiledLang = "";
        if (Objects.equals(inLang, "Cow")) {
            exp = transpileToBF(inLang, exp);
        }
        transpiledLang = exp.replace(".", "&O")
                .replace(">", "O")
                .replace("+", "RE");


        return transpiledLang;
    }

    private String transpileToCow(String inLang, String exp) {
        String transpiledLang = "";
        if (Objects.equals(inLang, "OREO")) {
            exp = transpileToBF(inLang, exp);
        }
        transpiledLang = exp.replace("<", "mOo ")
                .replace(">", "moO ")
                .replace(".", "Moo ")
                .replace("-", "MOo ")
                .replace("+", "MoO ")
                .replace("[-]", "OOO ")
                .replace(".", "OOM ")
                .replace(",", "oom ");
        return transpiledLang;
    }

}
