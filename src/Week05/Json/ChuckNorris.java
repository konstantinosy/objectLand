// ChuckNorris.java is not my work. I just have it here to use it as a reference.
// Credits: https://github.com/gprok-esc-courses/oop-java-1/blob/main/src/json/ChuckNorris.java .
package Week05.Json;

// We use the json simple library:
// com.googlecode.json-simple

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ChuckNorris {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://api.chucknorris.io/jokes/random");
            InputStreamReader is = new InputStreamReader(url.openStream());
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(is);
            System.out.println(json.get("value"));
        } catch (MalformedURLException e) {
            System.out.println("URL has a problem");
        } catch (IOException e) {
            System.out.println("IO problem");
        } catch (ParseException e) {
            System.out.println("Problem parsing from URL");
        }
    }
}

