package lab.ieti.microservice.tasks.service.implementation;

import lab.ieti.microservice.tasks.data.Task;
import lab.ieti.microservice.tasks.service.TaskService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMap implements TaskService {

    private final HashMap<String, Task> tasks = new HashMap<>();

    @Override
    public Task create(Task task) {
        return this.tasks.put(task.getId(), task);
    }

    @Override
    public Task findById(String id) {
        if (this.tasks.containsKey(id)) {
            return this.tasks.get(id);
        }
        return null;
    }

    @Override
    public List<Task> all() {
        return new ArrayList<>(this.tasks.values());
    }

    @Override
    public boolean deleteById(String id) {
        if (this.tasks.containsKey(id)) {
            this.tasks.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public Task update(Task task, String id) {
        if (this.tasks.containsKey(id)) {
            this.tasks.put(id, task);
            return task;
        }
        return null;
    }
}
