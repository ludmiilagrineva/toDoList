package spring.springboot.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.springboot.todolist.entity.ToDoList;
import spring.springboot.todolist.service.ToDoListService;


import java.util.List;

@Controller
public class MyController {

    @Autowired
    private ToDoListService toDoListService;


    @GetMapping("/actions")
    public String getActions(Model model) {
        ToDoList actions = new ToDoList();
        List<ToDoList> allActions = toDoListService.getAllActions();
        model.addAttribute("allActions", allActions);
        model.addAttribute("action", actions);

        return "showActions";
    }

    @PostMapping("/actions")
    public String addAction(@ModelAttribute ToDoList actions, Model model) {
        model.addAttribute("action", actions);
        toDoListService.saveAction(actions);
        return "redirect:/actions";
    }

    @GetMapping("/delete")
    public String deleteAction(@RequestParam("idAction") int id) {
        toDoListService.deleteAction(id);
        return "redirect:/actions";
    }

    @GetMapping("/done")
    public String doneAction(@RequestParam("idAction") int id){
        ToDoList toDoList=toDoListService.getToDoList(id);
        if(toDoList.getFlag()==0){
            toDoList.setFlag(1);
        }
        return "redirect:/actions";
    }

}

