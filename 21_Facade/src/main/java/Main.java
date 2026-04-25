import Client.APIFacade;

import java.io.IOException;

public class Main {
    static void main() throws IOException {
        APIFacade apif = new APIFacade();

        System.out.println(apif.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value"));
    }
}
