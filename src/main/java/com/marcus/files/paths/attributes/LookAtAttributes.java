package com.marcus.files.paths.attributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author marcus
 */
public class LookAtAttributes {

    public static void main(String[] args) {

        Path path = Paths.get("/home","marcus","Downloads","thuiswerk.pdf");

        try {
            BasicFileAttributes attributes = Files.readAttributes(path,BasicFileAttributes.class);

            System.out.println(attributes.creationTime());
            System.out.println(attributes.lastModifiedTime());
            System.out.println(attributes.lastAccessTime());
            System.out.println(attributes.isDirectory());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
