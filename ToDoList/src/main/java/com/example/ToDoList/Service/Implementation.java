package com.example.ToDoList.Service;

import com.example.ToDoList.Repository.TodoRepository;
import com.example.ToDoList.TODO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Implementation {

    public Implementation(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    private TodoRepository todoRepository;
    public List<TODO> allTodolist(){
     return todoRepository.findAll();
    }
}
