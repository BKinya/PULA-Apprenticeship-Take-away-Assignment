import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class Quiz3Test {
    @Test
    public void testVolumeCylinder(){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String resultVolume = decimalFormat.format(Quiz3.volumeOfCylinder(0.71, 4.94));
        assertEquals(7.82, Double.valueOf(resultVolume));
    }

    @Test
    public void testSurfaceAreaOpenCylinder(){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String resultVolume = decimalFormat.format(Quiz3.areaOfCylinderOpen(0.71, 4.94));
        assertEquals(23.62, Double.valueOf(resultVolume));
    }

    @Test
    public void testSurfaceAreaClosedCylinder(){
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String resultVolume = decimalFormat.format(Quiz3.areaOfCylinderClosed(0.71, 4.94));
        assertEquals(25.21, Double.valueOf(resultVolume));
    }

}