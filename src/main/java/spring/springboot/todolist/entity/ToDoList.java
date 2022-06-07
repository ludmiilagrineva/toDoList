package spring.springboot.todolist.entity;

import spring.springboot.todolist.methods.Methods;

import javax.persistence.*;

@Entity
@Table(name = "todolist")
public class ToDoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "action")
    private String description;
    @Column(name = "flag")
    private int flag;

    public ToDoList(String action, int flag) {
        this.description = action;
        this.flag = flag;
    }

    public ToDoList() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String action) {
        this.description = action;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Actions{" +
                "id=" + id +
                ", action='" + description + '\'' +
                ", flag=" + flag +
                '}';
    }
    public static String showFlag(int flag){
        return Methods.showFlag(flag);
    }
    public void changeFlag(int flag){
       if(flag==0){
           this.setFlag(1);
       }
    }
}
