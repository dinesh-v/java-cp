import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class MainTest {
    @Test
    public void main() throws Exception {
        File inputFile = new File(MainTest.class.getResource("input.txt").toURI());
        final FileInputStream fileInputStream = new FileInputStream(inputFile);
        System.setIn(fileInputStream);
        Main.main(null);
        Assert.assertTrue(true);

    }
}
