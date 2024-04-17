import java.util.*;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é " + loc.getDisplayLanguage() + " do " + loc.getDisplayCountry());
    }
}
