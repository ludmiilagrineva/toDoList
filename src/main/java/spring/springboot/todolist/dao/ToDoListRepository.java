package spring.springboot.todolist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.springboot.todolist.entity.ToDoList;

public interface ToDoListRepository extends JpaRepository<ToDoList, Integer> {


}
