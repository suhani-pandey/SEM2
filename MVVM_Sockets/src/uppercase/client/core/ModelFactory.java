package uppercase.client.core;


import uppercase.client.model.TextConverter;
import uppercase.client.model.TextConverterManager;

public class ModelFactory {

    private final ClientFactory cf;
    private TextConverter textConverter;

    public ModelFactory(ClientFactory cf) {
        this.cf = cf;
    }

    public TextConverter getTextConverter() {
        if(textConverter == null)
            textConverter = new TextConverterManager(cf.getClient());
        return textConverter;
    }
}


