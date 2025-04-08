package com.HoangThe.task_tracker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = FileStorage.loadTasks(); // Load from JSON
    }

    public void addTask(String title, String description, LocalDate dueDate) {
        Task task = new Task(title, description, dueDate);
        tasks.add(task);
        save(); // Auto-save after adding
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
            save(); // Auto-save after update
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            save();
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private void save() {
        FileStorage.saveTasks(tasks);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks); // Return copy to prevent external mutation
    }
}