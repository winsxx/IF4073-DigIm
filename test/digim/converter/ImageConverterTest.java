
package digim.converter;

import digim.common.ImageMatrix;
import java.awt.image.BufferedImage;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author winsxx
 */
public class ImageConverterTest {
    
    public ImageConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toRgbaImageMatrix method, of class ImageConverter.
     */
    @Test
    public void testToImageMatrix() {
        System.out.println("toImageMatrix");
        BufferedImage bufferedImage = null;
        ImageConverter instance = new ImageConverter();
        ImageMatrix expResult = null;
        ImageMatrix result = instance.toRgbaImageMatrix(bufferedImage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
