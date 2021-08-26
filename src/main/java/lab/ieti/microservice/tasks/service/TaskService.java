package lab.ieti.microservice.tasks.service;

import lab.ieti.microservice.tasks.data.Task;

import java.util.List;

public interface TaskService {

    Task create(Task task );

    Task findById( String id );

    List<Task> all();

    boolean deleteById( String id );

    Task update( Task task, String id );
}
