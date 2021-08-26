package lab.ieti.microservice.tasks.dto;

import java.time.LocalDateTime;

public class TaskDto {

    private String name;
    private String description;
    private String status;
    private String assignedTo;
    private LocalDateTime dueDate;

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
}
