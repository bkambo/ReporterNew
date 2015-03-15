import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Pdante on 2015-03-14.
 */
public class GSONReader {
    public GSONReader() {
        Gson gson = new Gson();

        try {

            BufferedReader br = new BufferedReader(
                    new StringReader("{'Problem'{)"));

            //convert the json string back to object
            Problem problem = gson.fromJson(br, Problem.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}