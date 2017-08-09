package code_clan.exercisediary;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by R.Murzakov on 09/08/2017.
 */

public class RoutineTemplaAdapter extends ArrayAdapter<Exercise> {

    public RoutineTemplaAdapter (Context context, ArrayList<Exercise> exercise){
        super(context, 0 , exercise);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.exercise_item,parent, false);
        }
      Exercise currentExercise = getItem(position);

        TextView exerciseNumber = (TextView) listItemView.findViewById(R.id.exercise_number);
        exerciseNumber.setText(currentExercise.getExerciseNumber().toString());

        TextView exercise = (TextView) listItemView.findViewById(R.id.exercise);
        exercise.setText(currentExercise.getExercise());

        TextView sets = (TextView) listItemView.findViewById(R.id.sets);
        sets.setText("Working sets: " + currentExercise.getSet().toString());

        return listItemView;



    }

}
