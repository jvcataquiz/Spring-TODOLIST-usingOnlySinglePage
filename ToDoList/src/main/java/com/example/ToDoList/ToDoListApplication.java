package com.example.ToDoList;

import com.example.ToDoList.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoListApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	@Autowired
	private TodoRepository todoRepository;
	@Override
	public void run(String... args) throws Exception {
//		TODO todo1 = new TODO("Wash Dishes");
//		todoRepository.save(todo1);
//		TODO todo2 = new TODO("Take a Bath");
//		todoRepository.save(todo2);
//		TODO todo3 = new TODO("Go to shopping Store");
//		todoRepository.save(todo3);
	}
}
