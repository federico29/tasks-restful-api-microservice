package lab.ieti.microservice.tasks.controller;

import lab.ieti.microservice.tasks.data.Task;
import lab.ieti.microservice.tasks.dto.TaskDto;
import lab.ieti.microservice.tasks.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController {

    private final TaskService taskService;

    public TaskController(@Autowired TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public ResponseEntity<List<Task>> all() {
        return new ResponseEntity<>(this.taskService.all(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> findById(@PathVariable String id) {
        return new ResponseEntity<>(this.taskService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto) {
        return new ResponseEntity<>(this.taskService.create(new Task(taskDto)), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id) {
        return new ResponseEntity<>(this.taskService.update(new Task(taskDto), id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable String id) {
        return new ResponseEntity<>(this.taskService.deleteById(id), HttpStatus.OK);
    }
}
