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
                    new StringReader("{“entries”:[\n" +
                            "\t{\n" +
                            "\t“user”: “features not bugs”,\n" +
                            "\t“time” : ”04:00”,\n" +
                            "\t“building” : “MCLD”,\n" +
                            "\t“roomNumber” : “439”,\n" +
                            "\t“errorType”: “Water”,  // this should be an ennum\n" +
                            "“specifics”: “leaky faucet”, // another ennum for each error type\n" +
                            "“notes”: “yo dawg, this faucet was super leaky”,\n" +
                            "}\n" +
                            "{\n" +
                            "“user”: “A Science Student”,\n" +
                            "\t“time” : ”04:00”,\n" +
                            "\t“building” : “BIOL”,\n" +
                            "\t“roomNumber” : “2000”,\n" +
                            "\t“errorType”: “Power”,  // this should be an ennum\n" +
                            "“specifics”: “flickering light”, // another ennum for each error type\n" +
                            "“notes”: “yo dawg, this light was super flickery”,\n" +
                            "}\n" +
                            "]\n" +
                            "}\n"));

            //convert the json string back to object
            Problem problem = gson.fromJson(br, Problem.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}