import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main
{

    public static void main(String[] args)
    {
        String fileName = "text1.txt";
        Scanner keyboard = null;
        try
        {
            keyboard = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
            System.exit(0);
        }
        while (keyboard.hasNextLine())
        {
            String line = keyboard.nextLine();
            System.out.println(line);
        }
        keyboard.close();



    }
}
