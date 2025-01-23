package apiMethods;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


//Парсинг — это процесс автоматического сбора и структурирования данных.
public class APIExample {

    private static final String JSON = "application/json";
    private static final String COOKIE = "Cookie";

    public String sendRequestGetIsTestService() throws URISyntaxException, IOException, InterruptedException {
        String fullURL = "http://numbersapi.com/17/trivia";
        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(new URI(fullURL))
                        .version(HttpClient.Version.HTTP_2)
                        .GET()
                        .build();

        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println("1. " + response.body());
        return response.body();
    }

    public void sendRequestService() throws URISyntaxException, IOException, InterruptedException {
        String fullURL = "http://numbersapi.com/17/trivia";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI(fullURL))
                .version(HttpClient.Version.HTTP_2)
                .header("key1", "value1")
//                .header(CONTENT_TYPE, JSON)
                .POST(HttpRequest.BodyPublishers.noBody())
                .build();

        HttpResponse<String> responsePost = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        responsePost.body();
    }

    public String sendRequestService1() throws URISyntaxException, IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.example.com/page.php"))
                .POST(HttpRequest.BodyPublishers.ofString("id=10"))
                .build();

        HttpResponse<String> responsePost = client.send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(responsePost.body());

        return responsePost.body();
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        APIExample apiExample = new APIExample();

        String apiExampleSend = apiExample.sendRequestGetIsTestService();
        String apiExampleSend1 = apiExample.sendRequestService1();
        System.out.println("1." + " " + apiExampleSend);
        System.out.println("2." + " " + apiExampleSend1);
    }
}
