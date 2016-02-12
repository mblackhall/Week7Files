package com.marcus.files.paths.directorystream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author marcus
 */
public class LookAtDirectoryStream {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/marcus/Downloads");

        // note directory stream only looks at current path does not go deeper
// list all files and directories in path...
        // try with resource -- dont have to manually close the stream !!
        // IMPORTANT --- the pattern is not a regular expression but can use them

      //  withoutPattern(path);

        usePattern(path, "[Hu]*.*");  // this is called a glob pattern
    }

    // you can linits entries with a pattern

    public static void usePattern(Path path, String pattern) throws IOException {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path, pattern);) {

            for (Path dirpath : stream) {
                System.out.println(dirpath);
            }

        }
    }


    public static void withoutPattern(Path path) throws IOException {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {

            for (Path dirpath : stream) {
                System.out.println(dirpath);
            }

        }
    }


}
