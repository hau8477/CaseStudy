package libs;

import java.util.regex.Pattern;

public class RegexForFurama {
    public static final String ID_SERVICE_VILLA = "^SV+VL-\\d{4}$";

    public static final String ID_SERVICE_ROOM = "^SV+RO-\\d{4}$";

    public static final String NAME_SERVICE = "^[A-Z][a-z]+$";

    public static final String DOUBLE_NUMBER = "^([3-9]\\d|\\d{3,}).\\d{1,2}$";

    public static final String POSITIVE_NUMBER = "^[1-9]+.\\d{1,2}$";

    public static final String MAX_PEOPLE = "^[1-9]{1}|1\\d{1}$";

    public static final String POSITIVE_INTEGER = "^[1-9]+$";

    public static final String DATE_OF_BIRTH = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)" +
            "?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])" +
            "(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";



    public static boolean validateIDServiceVilla(String string) {
        return Pattern.matches(ID_SERVICE_VILLA,string);
    }

    public static boolean validateIDServiceRoom(String string) {
        return Pattern.matches(ID_SERVICE_ROOM,string);
    }

    public static boolean validateNameService(String string){
        return Pattern.matches(NAME_SERVICE,string);
    }

    public static boolean validateDoubleNumber(String string){
        return Pattern.matches(DOUBLE_NUMBER,string);
    }

    public static boolean validatePositiveNumber(String string){
        return Pattern.matches(POSITIVE_NUMBER,string);
    }

    public static boolean validateMaxPeople(String string){
        return Pattern.matches(MAX_PEOPLE,string);
    }

    public static boolean validatePositiveInteger(String string){
        return Pattern.matches(POSITIVE_INTEGER,string);
    }

    public static boolean validateDateOfBirth(String string){
        return Pattern.matches(DATE_OF_BIRTH,string);
    }



}
