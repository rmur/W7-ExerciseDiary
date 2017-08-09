package code_clan.exercisediary;

import java.util.ArrayList;

/**
 * Created by R.Murzakov on 09/08/2017.
 */

public class RoutineTemplate {
    private ArrayList<Exercise>list;

    public RoutineTemplate() {
        list = new ArrayList<Exercise>();
        list.add(new Exercise(1, "Bench Press", 4));
        list.add(new Exercise(2, "45D Inclined Bench Press", 4));
        list.add(new Exercise(3, "Crossover", 4));
        list.add(new Exercise(4, "Dips", 4));
    }

    public ArrayList getSize(){

        return (new ArrayList<Exercise>(list));
    }
}
