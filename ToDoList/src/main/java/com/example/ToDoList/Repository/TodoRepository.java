package com.example.ToDoList.Repository;

import com.example.ToDoList.TODO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TODO,Long> {
}
