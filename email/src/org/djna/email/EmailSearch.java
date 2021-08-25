package org.djna.email;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmailSearch {

    public static void main(String[] args) {
        String fileName = "email/sample.txt";
        if (args.length > 1){
            fileName = args[1];
        }
        try {
            searchFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchFile(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);

        int counter = 0;

        String contents = Files.readString(filePath);

        String lookFor = "@softwire.com";

        for ( int start = 0, end = lookFor.length() ; end < contents.length() ;  start++, end++) {
            String candidate = contents.substring(start, end );

            if ( lookFor.equals(  candidate ) )  {
                counter++;
            }
        }

        System.out.printf("Found %s %d times", lookFor, counter);
    }


}
