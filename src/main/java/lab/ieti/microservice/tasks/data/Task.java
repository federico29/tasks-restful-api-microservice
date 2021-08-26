package lab.ieti.microservice.tasks.data;

import lab.ieti.microservice.tasks.dto.TaskDto;
import java.time.LocalDateTime;
import java.util.UUID;

public class Task {

    private String id;
    private String name;
    private String description;
    private String status;
    private String assignedTo;
    private LocalDateTime dueDate;
    private LocalDateTime createdAt;

    public Task(TaskDto taskDto) {
        this.id = UUID.randomUUID().toString();
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.assignedTo = taskDto.getAssignedTo();
        this.dueDate = taskDto.getDueDate();
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
