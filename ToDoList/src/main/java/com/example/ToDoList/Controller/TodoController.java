package com.example.ToDoList.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TodoController {
    @GetMapping("/")
    public String todoList(){
        return "index";
    }
}
