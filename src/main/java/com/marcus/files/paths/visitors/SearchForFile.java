package com.marcus.files.paths.visitors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author marcus
 */
public class SearchForFile {

    public static void main(String[] args) {
        Path path = Paths.get("/home","marcus","Music");

        String fileName = "Haiti";

        try {
            Files.walkFileTree(path,new MySimpleVisitor(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
