package api_methods;

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

    public String sendRequestService1() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.example.com/page.php"))
                .POST(HttpRequest.BodyPublishers.ofString("id=10"))
                .build();

        HttpResponse<String> responsePost = client.send(request, HttpResponse.BodyHandlers.ofString());
        return responsePost.body();
    }

    public String sendRequestService2() throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://example.com/api")) // Адресат
                .headers("Content-Type", "application/x-www-form-urlencoded") // Маркировка содержимого
                .POST(HttpRequest.BodyPublishers.ofString("param1=value1&param2=value2")) // Данные для отправки
                .build(); // Сформированный запрос

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Получение ответа

        return response.body();
    }

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        APIExample apiExample = new APIExample();

        String apiExampleSend = apiExample.sendRequestGetIsTestService();
        String apiExampleSend1 = apiExample.sendRequestService1();
        String apiExampleSend2 = apiExample.sendRequestService2();
        System.out.println("1." + " " + apiExampleSend);
        System.out.println("2." + " " + apiExampleSend1);
        System.out.println("3." + " " + apiExampleSend2);
    }
}
