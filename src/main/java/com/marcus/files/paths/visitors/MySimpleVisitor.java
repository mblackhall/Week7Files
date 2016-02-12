package com.marcus.files.paths.visitors;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author marcus
 */
public class MySimpleVisitor extends SimpleFileVisitor<Path> {
    String searchFile;

    public MySimpleVisitor(String searchFile){

        this.searchFile = searchFile;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        if (file.getFileName().toString().contains(searchFile) ){
            System.out.println("It exists at " + file.toAbsolutePath());
        }

        return FileVisitResult.CONTINUE;
    }
}
