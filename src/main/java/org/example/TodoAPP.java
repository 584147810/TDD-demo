package org.example;
import java.util.ArrayList;
import java.util.List;

public class TodoAPP {
    TaskRepository taskRepository=new TaskRepository();
    public static void main(String[] args) {

    }

    public List<String> ShowList() {
        List<String> result=new ArrayList<>();
        List<List<String>> tasks= taskRepository.LoadTasks();
        result.add("To be done");
        result.addAll(tasks.get(0));
        result.add("Completed");
        result.addAll(tasks.get(1));
        return result;
    }


}