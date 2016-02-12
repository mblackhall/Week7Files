package com.marcus.files.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

/**
 * @author marcus
 */
public class ExaminePaths {


    public static void main(String[] args) {

        // you get a path by using the Paths class
        Path myhome = Paths.get("/home/marcus/blob.txt");
        examinePath(myhome);

       // or can break your path down into parts (easier to use
        Path parts = Paths.get("/home","marcus","what.txt");
        examinePath(parts);

       // create a file

        try {
            Path createDirPath = Paths.get("/home/marcus/mydir");
            Path newPath;
            if ( Files.notExists(createDirPath)) {
                  Files.createDirectory(createDirPath);
            }
            System.out.println("Directory exists : " + Files.exists(createDirPath));

            // create a file in this dir
            Files.createFile(Paths.get(createDirPath.toString(),"myfile.txt"));


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void examinePath(Path path) {
        writePathInfo(path);
        writeFileInfo(path);
    }

    private static void writeFileInfo(Path myhome) {

        System.out.println("* BEGIN Files info ***************");

        System.out.println("Is Directory : " + Files.isDirectory(myhome));
        System.out.println("Is executable : " + Files.isExecutable(myhome));
        try {
            System.out.println("Is hidden : " + Files.isHidden(myhome));
        } catch (IOException e) {
            System.out.println("Is hidden can throw Ioexceptions");
        }
        System.out.println("Exists : " +  Files.exists(myhome));
        System.out.println("Is writable : " + Files.isWritable(myhome));

        System.out.println("* END Files info ***************");


    }

    /**
     * write out all path information
     *
     * @param path
     */
    public static void writePathInfo(Path path) {

        System.out.println("* BEGIN *********************\nPath info for : " + path.toString() );
        System.out.println("Is absolute : " + path.isAbsolute());
        System.out.println("Path normalized : " + path.normalize());
        System.out.println("Root :" + path.getRoot());
        System.out.println("Parent :" + path.getParent());
        System.out.println("Name count : " +  path.getNameCount());
        System.out.println("File name : " + path.getFileName());
        Iterator<Path> iterator = path.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iteration .... " + iterator.next());

        }
        System.out.println("* END *********************");

    }


}
