package sg.edu.rp.c346.exercise1todoitems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<ToDo> alTodoItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.lv);

        alTodoItems = new ArrayList<ToDo>();

        ToDo todo1 = new ToDo("Test Todo", "9/7/2019");
        ToDo todo2 = new ToDo("Test ToDo 2", "10/7/2019");
        alTodoItems.add(todo1);
        alTodoItems.add(todo2);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.row, alTodoItems);
        lvTodo.setAdapter(adapter);


    }
}
