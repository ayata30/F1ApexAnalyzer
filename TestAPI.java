// api requests ...


import java.net.http.*;
import java.net.URI;

public class TestAPI {
    public static void main(String[] args) throws Exception {

        HttpClient client = HttpClient.newHttpClient();

        String url = "https://api.openf1.org/v1/laps?session_key=9158&driver_number=1";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Status Code: " + response.statusCode());
        System.out.println(response.body());
    }
}
