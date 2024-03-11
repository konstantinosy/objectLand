package Week05.Exercises;

import org.apache.commons.lang3.StringEscapeUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TriviaQuestions {
    public static void main(String[] args) {

        int i = 1;
        try {
            // Create url object from the API provided.
            URL url = new URL("https://opentdb.com/api.php?amount=10");
            // Create the input stream reader object. Opens the connection and starts to read.
            InputStreamReader inputStream = new InputStreamReader(url.openStream());
            // Create the parser object. Reads and analyses the text.
            JSONParser parser = new JSONParser();
            //Create a json object by typecasting to convert it.
            JSONObject json = (JSONObject) parser.parse(inputStream);
            // Create a json array object by using the .get and typecasting into an Array.
            JSONArray questionsArray = (JSONArray) json.get("results");

            // Iterate through every element.
            for (Object results : questionsArray) {
                //Typecasts results to be a json object by retrieving the value question and then casts to a string.
                String question = (String) ((JSONObject) results).get("question");
                // Decode HTML elements, so they won't show up when they are printed.
                question = StringEscapeUtils.unescapeHtml4(question);
                // Print out each question in a fashionable manner.
                System.out.println("• Question " + i + " -> " + question + "\n");
                // Iterate i.
                i++;
            }

        } catch (MalformedURLException e) {
            System.out.println("URL has a problem!");
        } catch (IOException e) {
            System.out.println("I/O problem!");
        } catch (ParseException e) {
            System.out.println("Problem parsing from URL!");
        }
    }
}
