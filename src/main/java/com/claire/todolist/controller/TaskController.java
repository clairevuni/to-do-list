package com.claire.todolist.controller;
import java.util.Scanner;

public class TaskController {
    // Qui puoi aggiungere variabili per gestire i task, come una lista di task o un database.
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
        // Qui puoi implementare la logica per visualizzare i task.
        // Ad esempio, potresti stampare una lista di task esistenti.
        System.out.println("Visualizzazione dei task non ancora implementata.");
    }


    public void AggiungiTask() {
        // Qui puoi implementare la logica per aggiungere un nuovo task.
        // Ad esempio, potresti chiedere all'utente di inserire i dettagli del task e salvarlo.
        System.out.println("Aggiunta di un task non ancora implementata.");
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


    

        

}