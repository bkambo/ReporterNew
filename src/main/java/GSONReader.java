import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.sun.xml.internal.ws.api.message.Header;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.loopj.android.*;
import sun.misc.BASE64Encoder;


/**
 * Created by Pdante on 2015-03-14.
 */
public class GSONReader {
    public GSONReader() throws IOException {
        Gson gson = new Gson();

        //!!! get the raw string from the API


        String urlString = "http://preview.layer7tech.com:8080/hacks/v1/appstates?appid=team3&userid=team3";
//        Header auth = new BasicHeader ("Authorization", "Basic <replace with your credential>");
//        Header contentType = basicHeader("Content-Type", "application/json");

        URL url = new URL(urlString);

        URLConnection conn = url.openConnection();

        conn.addRequestProperty("Authorization", "Basic " + new BASE64Encoder().encode("".getBytes()));// loook up base64 encoding of header

        InputStream inputStream = (InputStream) conn.getContent(); //look up read url connection

        JsonReader reader = new JsonReader(
                new InputStreamReader(inputStream));

        JsonElement root = new JsonParser().parse(reader);

        JsonObject rootObject = root.getAsJsonObject();

        JsonArray statesArray = rootObject.getAsJsonArray("states");

        for (int i=0; (i < statesArray.length(); i++) {
            Problem aProblem;


        }

        //convert the json string back to object

        Problem problem = gson.fromJson(reader);
    }
}