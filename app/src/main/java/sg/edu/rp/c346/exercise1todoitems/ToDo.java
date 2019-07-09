package sg.edu.rp.c346.exercise1todoitems;

public class ToDo {
    private String name;
    private String date;

    public ToDo(String name, String date){
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String toString(){
        return name + " " + date;
    }
}
