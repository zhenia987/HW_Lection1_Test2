import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {
    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        Assert.assertTrue("Error metod getClassNumber less than 45 ", mainClass.getClassNumber() > 45);
    }
}
