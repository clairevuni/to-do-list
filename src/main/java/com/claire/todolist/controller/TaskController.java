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
            Task task = new Task("Esempio Task", "Descrizione del task", false, "2023-10-01"); 

            do { 

                System.out.println("Inserisci un comando, 1 per Visualizzare i Task, 2 per Aggiungere un Task, 3 per Eliminare un Task, 4 per Modificare un Task, q per uscire:");
                input = scanner.nextLine();

                switch (input) {
                    case "1" -> VisualizzaTask();
                    case "2" -> AggiungiTask();
                    case "3" -> ModificaTask();
                    case "4" -> EliminaTask();
                    default -> {
                        if (!input.equals("q")) {
                            System.out.println("Comando non riconosciuto. Riprova.");
                        }
                    }
                }
                
                
            } while (!input.equals("q"));

    

    }


    public void VisualizzaTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Visualizzazione dei task che hai per la data di ?");
        String data = scanner.nextLine();
        System.out.println("Ecco i task per la data " + data + ":");
        for(Task task : taskList) {
            if (task.getDate().equals(data)) {
                System.out.println("Titolo: " + task.getTitle());
                System.out.println("Descrizione: " + task.getDescription());
                System.out.println("Completato: " + (task.getChecked() ? "Sì" : "No"));
                System.out.println("Data: " + task.getDate());
                System.out.println("-----------------------------");
            }
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



    }


    public void ModificaTask() {
        // Qui puoi implementare la logica per modificare un task esistente.
        // Ad esempio, potresti chiedere all'utente di selezionare un task e modificarne i dettagli.
        System.out.println("Modifica di un task non ancora implementata.");
    }


    public void EliminaTask() {
        // Qui puoi implementare la logica per eliminare un task esistente.
        // Ad esempio, potresti chiedere all'utente di selezionare un task da eliminare.
        System.out.println("Eliminazione di un task non ancora implementata.");
    }



    
    public List<Task> getTaskList() {
        return taskList;
    }
    

        

}