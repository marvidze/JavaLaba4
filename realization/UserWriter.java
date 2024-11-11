package realization;

import java.io.FileWriter;
import java.io.IOException;

public class UserWriter {

    public UserWriter() {}

    public boolean WriteIntoFile(String[] arrStrings)
    {
        try(FileWriter writer = new FileWriter("InputInfoVector.txt", true))
        {
            for (String str : arrStrings) {
                writer.write(str + '\n');
            }
            writer.flush();
            writer.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return false;
        } 

        return true;
    }
}
