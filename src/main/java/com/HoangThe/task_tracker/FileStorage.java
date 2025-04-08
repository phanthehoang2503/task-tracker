package com.HoangThe.task_tracker;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class FileStorage {
    private static final String FILE_NAME = "tasks.json";

    private static final Moshi moshi = new Moshi.Builder()
            .add(new LocalDateAdapter())
            .build();

    private static final Type type = Types.newParameterizedType(List.class, Task.class);
    private static final JsonAdapter<List<Task>> adapter = moshi.adapter(type);

    public static void saveTasks(List<Task> tasks) {
        try {
            String json = adapter.toJson(tasks);
            Files.writeString(new File(FILE_NAME).toPath(), json);
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }

    public static List<Task> loadTasks() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return new ArrayList<>();

        try {
            String json = Files.readString(file.toPath());
            List<Task> tasks = adapter.fromJson(json);
            return tasks != null ? tasks : new ArrayList<>();
        } catch (IOException e) {
            System.out.println("Error loading tasks: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}