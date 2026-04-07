import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    @Test
    public void testSearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.searchBogie(bogies, "BG309"));
    }

    @Test
    public void testSearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(TrainConsistManagementApp.searchBogie(bogies, "BG999"));
    }

    @Test
    public void testSearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.searchBogie(bogies, "BG101"));
    }

    @Test
    public void testSearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(TrainConsistManagementApp.searchBogie(bogies, "BG550"));
    }

    @Test
    public void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(TrainConsistManagementApp.searchBogie(bogies, "BG101"));
    }
}
