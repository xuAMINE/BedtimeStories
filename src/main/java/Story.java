import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Story {

    public static StringBuilder readStoryTXT(String fileName) {
        StringBuilder story = new StringBuilder();

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null)
                story.append(String.format("%s. %s \n", lineNumber++, line));

        } catch (IOException e) {
            System.err.println("File Does not exist: " + fileName);
        }
        return story;
    }
}
