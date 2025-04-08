package com.HoangThe.task_tracker;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("=== Task Tracker ===");

        while (true) {
            System.out.println("\nOptions: add, list, complete, delete, exit");
            System.out.print("> ");
            input = scanner.nextLine().trim();

            switch (input) {
                case "add":
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String desc = scanner.nextLine();
                    System.out.print("Due date (yyyy-mm-dd): ");
                    LocalDate dueDate = LocalDate.parse(scanner.nextLine());
                    manager.addTask(title, desc, dueDate);
                    break;

                case "list":
                    manager.listTasks();
                    break;

                case "complete":
                    System.out.print("Task number to complete: ");
                    int completeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.markTaskCompleted(completeIndex);
                    break;

                case "delete":
                    System.out.print("Task number to delete: ");
                    int deleteIndex = Integer.parseInt(scanner.nextLine()) - 1;
                    manager.deleteTask(deleteIndex);
                    break;

                case "exit":
                    System.out.println("Bye!");
                    return;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }
    }
}