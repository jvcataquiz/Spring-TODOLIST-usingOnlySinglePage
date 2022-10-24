package com.example.ToDoList;

import javax.persistence.*;

@Entity
@Table(name = "TodoTable")
public class TODO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "todo_string")
    private String todoString;
    @Column(name = "is_done")
    private Boolean isDone;

    public TODO() {
    }

    public TODO(Long id, String todoString, Boolean isDone) {
        this.id = id;
        this.todoString = todoString;
        this.isDone = isDone;
    }

    public TODO(String todoString) {
        this.todoString = todoString;
        this.isDone = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodoString() {
        return todoString;
    }

    public void setTodoString(String todoString) {
        this.todoString = todoString;
    }

    public Boolean getDone() {
        return isDone;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

}
