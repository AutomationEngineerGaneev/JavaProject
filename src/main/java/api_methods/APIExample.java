//package api_methods;
//
//import io.qameta.allure.Step;
//import org.apache.http.HttpRequest;
//import org.apache.http.HttpResponse;
//import org.json.JSONArray;
//import org.json.JSONObject;
//import sun.net.www.http.HttpClient;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//
////Парсинг — это процесс автоматического сбора и структурирования данных.
//public class APIExample {
//
//    private static final String JSON = "application/json";
//    private static final String COOKIE = "Cookie";
//
//    //Вот пример получения данных без JSON.
//    @Step("GET: http://numbersapi.com/17/trivia")
//    public String sendRequestGetIsTestService() throws URISyntaxException, IOException, InterruptedException {
//        String fullURL = "http://numbersapi.com/17/trivia";
//        HttpRequest request =
//                HttpRequest.newBuilder()
//                        .uri(new URI(fullURL))
//                        .version(HttpClient.Version.HTTP_2)
//                        .GET()
//                        .build();
//
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        return response.body();
//    }
//
//    //И второй пример кода обработки JSON.
//    @Step("GET: http://jservice.io/api/random?count=")
//    public String sendRequestGetIsTestServiceWithJson() throws URISyntaxException, IOException, InterruptedException {
//        int n = 5;
//        HttpRequest request = HttpRequest.newBuilder().uri(new URI("http://jservice.io/api/random?count=" + n)).GET().build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        String jsonString = response.body().toString();
//        System.out.println(jsonString);
//        JSONArray array = new JSONArray(jsonString);
//        for (int i = 0; i < n; i++){
//            JSONObject obj = array.getJSONObject(i);
//            String answer = (String) obj.get("answer");
//            String question = (String) obj.get("question");
//            System.out.println(question + " - " + answer);
//        }
//        return response.body();
//    }
//
//    @Step("POST: http://numbersapi.com/17/trivia")
//    public void sendRequestService() throws URISyntaxException, IOException, InterruptedException {
//        String fullURL = "http://numbersapi.com/17/trivia";
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(new URI(fullURL))
//                .version(HttpClient.Version.HTTP_2)
//                .header("key1", "value1")
////                .header(CONTENT_TYPE, JSON)
//                .POST(HttpRequest.BodyPublishers.noBody())
//                .build();
//
//        HttpResponse<String> responsePost = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        responsePost.body();
//    }
//
//    @Step("POST: http://www.example.com/page.php")
//    public String sendRequestService1() throws IOException, InterruptedException {
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://www.example.com/page.php"))
//                .POST(HttpRequest.BodyPublishers.ofString("id=10"))
//                .build();
//
//        HttpResponse<String> responsePost = client.send(request, HttpResponse.BodyHandlers.ofString());
//        return responsePost.body();
//    }
//
//    @Step("POST: http://example.com/api")
//    public String sendRequestService2() throws IOException, InterruptedException {
//
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://example.com/api")) // Адресат
//                .headers("Content-Type", "application/x-www-form-urlencoded") // Маркировка содержимого
//                .POST(HttpRequest.BodyPublishers.ofString("param1=value1&param2=value2")) // Данные для отправки
//                .build(); // Сформированный запрос
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); // Получение ответа
//
//        return response.body();
//    }
//
//    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//
//        APIExample apiExample = new APIExample();
//
//        String apiExampleSend = apiExample.sendRequestGetIsTestService();
//        System.out.println("1." + " " + apiExampleSend);
//    }
//}
