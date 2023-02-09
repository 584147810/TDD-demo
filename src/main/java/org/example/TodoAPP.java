package org.example;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TodoAPP {
    public static void main(String[] args) {

    }

    public List<String> ShowList() {
        List<String> lines=new ArrayList<>();
        lines.add("To be done");
        try {
            lines.addAll(Files.readAllLines(Path.of("/home/xiaozha/thought_works/step6-TDD/.todo")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }
}