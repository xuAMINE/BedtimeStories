import java.util.Scanner;

public class BedtimeStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of the story: ");
        String storyName = sc.nextLine();

        System.out.println(Story.readStoryTXT(storyName));
    }
}
