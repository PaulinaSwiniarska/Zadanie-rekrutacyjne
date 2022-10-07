package Exercise3;
import java.net.http.HttpClient;

public abstract class KayneRest<T, Gson> {

    protected final String quote;

    public KayneRest(String quote) {
        this.quote = quote;
    }

    public final T execute() {
        Gson gson = new Gson();
        HttpClient httpClient = HttpClient.newHttpClient();
        return null;
    }}