package com.claire.todolist.model;

public class Task{

    private static int nextId = 1;
    private Integer id;
    private String title;
    private String Description;
    private Boolean checked;
    private String date;



    public Task(String title, String description, Boolean checked, String date){
        this.id = nextId++;
        if (this.id < 0) {
            this.id = -this.id; // Ensure id is positive
        }
        this.title = title;
        this.Description = description;
        this.checked = checked;    
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    

}