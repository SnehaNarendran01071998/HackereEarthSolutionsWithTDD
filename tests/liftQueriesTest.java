import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class liftQueriesTest {

    @Test
    void shouldReturnLiftAIfCalledFromZerothFloor() {
        liftQueries liftQueries = new liftQueries();
        int floorNumber = 0;
        assertEquals('A', liftQueries.whichLift(floorNumber));
    }
}