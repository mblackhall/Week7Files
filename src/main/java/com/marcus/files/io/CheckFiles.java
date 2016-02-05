package com.marcus.files.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author marcus
 */
public class CheckFiles {

    public static void main(String[] args) throws IOException {

        checkFile();

        usePaths();
    }



    private static void checkFile() throws IOException {

        // create a file object
        File file = new File("afile.txt");
        // file is not created !
        System.out.println("exists ? " + file.exists());
        System.out.println("created file ? " + file.createNewFile());

        System.out.println("size of file is " + file.length());

        // now i want to write something to file !


    }

    private static void usePaths() {

        // Path is an Interface    **** concrete
        // Paths  - use to get a Path
        // Files uses Paths
        // File  --- can convert to path.

        Path path = Paths.get("/home/marcus");

        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getName(1): " + path.getName(1));
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("toString: " + path.toString());
        System.out.println(path.resolve("pgadmin.log"));
        // use Files to create paths





    }
}
