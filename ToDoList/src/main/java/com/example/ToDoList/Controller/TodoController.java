package com.example.ToDoList.Controller;

import com.example.ToDoList.Service.Implementation;
import com.example.ToDoList.TODO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TodoController {
    private Implementation implementation;
    public TodoController(Implementation implementation) {
        this.implementation = implementation;
    }


    @GetMapping("/")
    public String todoList(Model model, Model newmodel){

        model.addAttribute("all",implementation.allTodolist());
        TODO todo = new TODO();
        newmodel.addAttribute("newToDo", todo);
        return "index";
    }
}
