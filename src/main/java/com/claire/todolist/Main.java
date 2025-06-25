package com.claire.todolist;
import com.claire.todolist.controller.TaskController;


public class Main {

    public static void main(String[] args) {
        System.out.println("Benvenuto nella To-Do List!");
        System.out.println("Per iniziare, crea un nuovo task o visualizza quelli esistenti.");

        
        TaskController taskController = new TaskController();
        taskController.Start();
        System.out.println("Grazie per aver utilizzato la To-Do List! Arrivederci!");
    }
}