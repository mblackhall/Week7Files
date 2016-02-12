package com.marcus.files.paths.visitors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author marcus
 */
public class WalkTheFiles {

    public static void main(String[] args) {

        Path path = Paths.get("/home","marcus","Music");

        try {
            Files.walkFileTree(path,new VisitMyFiles());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
