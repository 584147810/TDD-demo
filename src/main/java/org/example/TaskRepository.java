package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public List<List<String>> LoadTasks() {
        List<String> lines;
        List<String> CompletedTasks = new ArrayList<>();
        List<String> TodoListTasks = new ArrayList<>();
        try {
            lines = new ArrayList<>(Files.readAllLines(Path.of("/home/xiaozha/thought_works/step6-TDD/.todo")));
            for(int i=0;i<lines.size();i++){
                Task task=createTask(i,lines.get(i));
                if(task.isCompleted()){
                    CompletedTasks.add((task.getId()+1)+" "+task.getName());
                }
                else {
                    TodoListTasks.add((task.getId()+1)+" "+task.getName());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return List.of(TodoListTasks,CompletedTasks);
    }

    private Task createTask(Integer id,String line) {
        var field=line.split(" ",2);
        var taskStatus=field[0];
        var taskContent=field[1];
        if(taskStatus.equals("+")){
            return new Task(id,false,taskContent);
        }
        else {
            return new Task(id,true,taskContent);
        }
    }
}
