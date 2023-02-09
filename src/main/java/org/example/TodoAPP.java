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
        List<String> lines;
        List<String> tasks= new ArrayList<>();
        tasks.add("To be done");
        try {
            lines = new ArrayList<>(Files.readAllLines(Path.of("/home/xiaozha/thought_works/step6-TDD/.todo")));
            for(int i=0;i<lines.size();i++){
                Task task= new Task(i+1,lines.get(i));
                tasks.add(task.format());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return tasks;
    }
}