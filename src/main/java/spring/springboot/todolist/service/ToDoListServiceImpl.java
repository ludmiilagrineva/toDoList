package spring.springboot.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.springboot.todolist.dao.ToDoListRepository;
import spring.springboot.todolist.entity.ToDoList;


import java.util.List;

@Service
public class ToDoListServiceImpl implements ToDoListService{

    @Autowired
    private ToDoListRepository toDoListRepository;

    @Override
    public List<ToDoList> getAllActions() {
        return toDoListRepository.findAll();
    }

    @Override
    public void saveAction(ToDoList actions) {
toDoListRepository.save(actions);
    }

    @Override
    public void deleteAction(int id) {
toDoListRepository.deleteById(id);
    }

    @Override
    public ToDoList getToDoList(int id) {
       return toDoListRepository.findById(id).get();
    }


}
