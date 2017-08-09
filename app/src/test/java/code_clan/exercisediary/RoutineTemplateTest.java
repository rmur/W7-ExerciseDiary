package code_clan.exercisediary;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by R.Murzakov on 09/08/2017.
 */

public class RoutineTemplateTest {
    private RoutineTemplate routineTemplate;

    @Test
    public void testRoutineTemplate(){
        routineTemplate = new RoutineTemplate();
        assertEquals(4, routineTemplate.getList().size());
    }
}
