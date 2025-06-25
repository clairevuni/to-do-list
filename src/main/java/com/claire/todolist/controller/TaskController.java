package com.claire.todolist.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.claire.todolist.model.Task;

public class TaskController {
    // Qui puoi aggiungere variabili per gestire i task, come una lista di task o un database.
    private List<Task> taskList = new ArrayList<>();

        public void Start() {
            System.out.println("Inizio gestione dei task! Premi 'q' per uscire");
            Scanner scanner = new Scanner(System.in);
            String input;

            do { 

                System.out.println("Inserisci un comando, 1 per Visualizzare i Task, 2 per Aggiungere un Task, 3 per Eliminare un Task, 4 per Modificare un Task, q per uscire:");
                input = scanner.nextLine();

                switch (input) {
                    case "1" -> VisualizzaTask();
                    case "2" -> AggiungiTask();
                    case "3" -> EliminaTask();
                    case "4" -> ModificaTask();
                    default -> {
                        if (!input.equals("q")) {
                            System.out.println("Comando non riconosciuto. Riprova.");
                        }
                    }
                }
                
                
            } while (!input.equals("q"));

    

    }


    public void VisualizzaTask() {
        for(Task task : taskList) {
                System.out.println("ID: " + task.getId());
                System.out.println("Titolo: " + task.getTitle());
                System.out.println("Descrizione: " + task.getDescription());
                System.out.println("Completato: " + (task.getChecked() ? "Sì" : "No"));
                System.out.println("Data: " + task.getDate());
                System.out.println("-----------------------------");
            }
        }
        


    public void AggiungiTask() {
        System.out.println("Aggiungiamo un nuovo task!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci il titolo del task:");
        String title = scanner.nextLine();
        System.out.println("inserisci la descrizione del task:");
        String description = scanner.nextLine();
        System.out.println("inserisci la data del task (formato YYYY-MM-DD):");
        String date = scanner.nextLine();
        Task newTask = new Task(title, description, false, date);
        taskList.add(newTask);
        VisualizzaTask();
        System.out.println("Task aggiunto con successo!");



    }


    public void ModificaTask() {
        System.out.println("Modifica di un task! Quale Vuoi modificare?");
        VisualizzaTask();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'ID del task da modificare:");
        int taskId = scanner.nextInt();
        for (Task task : taskList) {
            if (task.getId() == taskId) {
                System.out.println("Lo hai Completato? (true/false):");
                boolean isChecked = scanner.nextBoolean();
                scanner.nextLine(); // Consuma il newline rimasto
                task.setChecked(isChecked);
                System.out.println("Task modificato con successo!");
                VisualizzaTask();
                return;
            }
        }
    }


    public void EliminaTask() {
        System.out.println("Eliminazione di un task! Quale Vuoi eliminare?");
        VisualizzaTask();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'ID del task da eliminare:");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline rimasto
        for (Task task : taskList) {
            if (task.getId() == taskId) {
                taskList.remove(task);
                // l'id deve decrescere cosi!
                for (int i = taskId - 1; i < taskList.size(); i++) {
                    Task t = taskList.get(i);
                    t.setId(t.getId() - 1);
                }
                System.out.println("Task eliminato con successo!");
                VisualizzaTask();
                return;
            }
        }
 }



    
    public List<Task> getTaskList() {
        return taskList;
    }
    

        

}