package spring.springboot.todolist.service;



import spring.springboot.todolist.entity.ToDoList;

import java.util.List;

public interface ToDoListService {
    public List<ToDoList>getAllActions();
    public void saveAction(ToDoList actions);
    public void deleteAction(int id);
    public ToDoList getToDoList(int id);

}
