package code_clan.exercisediary;

/**
 * Created by R.Murzakov on 09/08/2017.
 */

public class Exercise {
    private Integer number;
    private String name;
    private Integer sets;

    public Exercise(int number, String name, int sets){
        this.number = number;
        this.name = name;
        this.sets = sets;

    }

    public Integer getExerciseNumber() {
        return this.number;
    }

    public String getExercise() {
        return this.name;
    }

    public Integer getSet() {
        return this.sets;
    }
}
