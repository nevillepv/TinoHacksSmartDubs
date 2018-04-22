import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class driver {

    public static void main(String[] args) throws IOException, InterruptedException {

        String command = "/Library/Frameworks/Python.framework/Versions/3.6/bin/python3 /Users/mainTriad/PycharmProjects/Baseball/program.py";

        Process proc = Runtime.getRuntime().exec(command);
        
        // Read the output

        BufferedReader reader =  
              new BufferedReader(new InputStreamReader(proc.getInputStream()));

        String line = "";
        while((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
        }

        proc.waitFor();   

    }
} 