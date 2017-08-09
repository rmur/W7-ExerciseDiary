package code_clan.exercisediary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import java.util.ArrayList;

public class ExerciseTemplateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise_list);

        RoutineTemplate routineTemplate = new RoutineTemplate();
        ArrayList<Exercise> list = routineTemplate.getList();

        RoutineTemplaAdapter exerciseAdapter = new RoutineTemplaAdapter(this,list);

        ListView listView = (ListView) findViewById(R.id.exercise_list);
        listView.setAdapter(exerciseAdapter);
    }
}
