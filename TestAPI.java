// api requests ...


import java.net.URI;
import java.net.http.*;

public class TestAPI {
    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();
        //cretaes an objevt knows how to send htpp requests over interbet

        //String url = "https://api.openf1.org/v1/laps?session_key=9158&driver_number=1";

        HttpRequest request = HttpRequest.newBuilder()
                //.uri(URI.create(url))
                .uri(URI.create("https://f1api.dev/api/current/last/race"))
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println(response.body());
    }
}
