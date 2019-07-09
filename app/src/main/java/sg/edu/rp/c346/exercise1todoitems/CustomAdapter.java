package sg.edu.rp.c346.exercise1todoitems;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ToDo> todoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDo> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        todoList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvDate = rowView.findViewById(R.id.tvDate);

        // Obtain the to do information based on the position
        ToDo currentToDo = todoList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentToDo.getName());
        tvDate.setText(currentToDo.getDate());

        return rowView;
    }



}



