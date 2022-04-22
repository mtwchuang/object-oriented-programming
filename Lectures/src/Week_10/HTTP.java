package Week_10;
import java.net.URI;
import java.net.http.*;
public class HTTP 
{
    public static void main(String[] args) throws Exception
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(
            HttpRequest
                .newBuilder(new URI("http://www.foo.com/"))
                .headers("param1","foovalue","param2","barvalue")
                .GET()
                .build(), 
                HttpResponse.BodyHandlers.ofString());
        int statusCode = response.statusCode();
        String body = response.body();
        System.out.println("Status code "+statusCode);
        System.out.println("Content "+body);
    }
}
