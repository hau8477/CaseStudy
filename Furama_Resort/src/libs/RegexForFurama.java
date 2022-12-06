package libs;

import java.util.regex.Pattern;

public class RegexForFurama {
    public static final String ID_SERVICE = "^SV+VL|RO-\\d{4}";

    public static final String NAME_SERVICE = "^[A-Z][a-z]+$";

    public static final String AREA = "";

    public static boolean validateIDService(String string) {
        return Pattern.matches(ID_SERVICE,string);
    }

    public static boolean validateNameService(String string){
        return Pattern.matches(NAME_SERVICE,string);
    }


}
