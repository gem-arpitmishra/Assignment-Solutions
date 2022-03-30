//Create POST method from httpclient and use jsonbuilder or jsonobject.
//https://gorest.co.in/public/v2/users
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.util.Scanner;


public class httpClient_POST {
    public static void main(String[] args) throws IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "Arpit");
        jsonObject.put("gender", "Male");
        jsonObject.put("email", "arpit22@arpit.com");
        jsonObject.put("status", "inactive");

        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost postReq = new HttpPost("https://gorest.co.in/public/v2/users");
        postReq.addHeader("Accept","application/json");
        postReq.addHeader("Content-Type","application/json");
        postReq.addHeader("Authorization","Bearer 7cf300a3954980370df0803705cb1fb157b4dea84eecf0f2d206f41d48c4a8b5");
        StringEntity params = new StringEntity(jsonObject.toString());

        postReq.setEntity(params);
        CloseableHttpResponse response = client.execute(postReq);
        Scanner sc = new Scanner(response.getEntity().getContent());
        System.out.println(response.getStatusLine());
        while(sc.hasNext()) {
            System.out.println(sc.nextLine());
        }

        // CloseableHttpClient client1 = HttpClients.createDefault();
        // HttpGet getReq = new HttpGet("https://gorest.co.in/public/v2/users?email=arpit22@arpit.com");
        // getReq.addHeader("Authorization","Bearer 7cf300a3954980370df0803705cb1fb157b4dea84eecf0f2d206f41d48c4a8b5");

        // CloseableHttpResponse response1 = client.execute(getReq);
        // Scanner sc1 = new Scanner(response1.getEntity().getContent());
        // System.out.println(response1.getStatusLine());
        // while(sc1.hasNext()) {
        //     System.out.println(sc1.nextLine());
        // }
    }

}
