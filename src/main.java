import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //https://www.exchanges-api.com/
        //https://v6.exchangerate-api.com/v6/a64b42b4879753ad48873795/latest/USD
        String core = "Core";
        String exchangeURL_API = "https://v6.exchangerate-api.com/v6/a64b42b4879753ad48873795/latest/USD";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(exchangeURL_API))
                .build();

        HttpResponse response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
