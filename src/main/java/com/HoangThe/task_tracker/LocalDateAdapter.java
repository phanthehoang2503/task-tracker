package com.HoangThe.task_tracker;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

import java.time.LocalDate;

public class LocalDateAdapter {
    @ToJson
    public String toJson(LocalDate date) {
        return date.toString(); // ISO format: yyyy-MM-dd
    }

    @FromJson
    public LocalDate fromJson(String json) {
        return LocalDate.parse(json);
    }
}
