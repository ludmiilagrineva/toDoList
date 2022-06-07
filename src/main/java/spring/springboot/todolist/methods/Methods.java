package spring.springboot.todolist.methods;

import spring.springboot.todolist.entity.ToDoList;

public class Methods {
    public static void changeFlag(ToDoList toDoList){
        if(toDoList.getFlag()==0){
            toDoList.setFlag(1);
        }
        else {
            toDoList.setFlag(0);
        }
    }
    public  static String showFlag(int flag){
        if(flag==0){
            return ("not done");
        }
        else {
            return ("done");
        }
    }
}
