package com.marcus.files.paths.files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author marcus
 */
public class ReadingWithFiles {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("numbers.txt");
        List<String> lines = Files.readAllLines(path,Charset.forName(StandardCharsets.UTF_8.name()));
        for (String line:lines){
            System.out.println(line);
        }





    }
}
