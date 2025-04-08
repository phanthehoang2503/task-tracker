# 📝 Task Tracker CLI

A simple and clean command-line Task Tracker built with Java 11, Maven, and Moshi. Tasks are stored in a local `tasks.json` file for persistence.

---

## ⚙️ Features

- ✅ Add tasks with title, description, and due date
- 📋 List all tasks with status
- ☑️ Mark tasks as completed
- ❌ Delete tasks
- 💾 All tasks are saved to `tasks.json` (via Moshi)

---

## 🚀 Getting Started

### 📦 Requirements

- Java 11+
- Maven
- IntelliJ IDEA (recommended)

### 🔧 Build the JAR

```bash
git clone https://github.com/phanthehoang2503/task-tracker.git
cd task-tracker
mvn clean package
```
After build, your executable JAR will be located in:
```bash
target/task-tracker-1.0-SNAPSHOT-shaded.jar
```

▶️ Run the App
```bash
java -jar target/task-tracker-1.0-SNAPSHOT-shaded.jar
```
---
## 🧪 Sample Usage
```bash
=== Task Tracker ===

Options: add, list, complete, delete, exit
> add
Title: Finish README
Description: Write instructions for GitHub
Due date (yyyy-mm-dd): 2025-04-09
```
---
##💽 File Storage
All tasks are saved in tasks.json in your project root:
```json
[
  {
    "title": "Finish README",
    "description": "Write instructions for GitHub",
    "dueDate": "2025-04-09",
    "isCompleted": false
  }
]
```
---
🛠 Tech Stack
Java 11 (Temurin)

Maven

Moshi (by Square)

IntelliJ IDEA
---
##📁 Project Structure

```css
src/
└── main/
    └── java/
        └── com/
            └── HoangThe/
                └── task_tracker/
                    ├── Main.java
                    ├── Task.java
                    └── TaskManager.java
tasks.json
pom.xml
```
---
## 🪪 License
MIT License – free to use, modify, and distribute.
