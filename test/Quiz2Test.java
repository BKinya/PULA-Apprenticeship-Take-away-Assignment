import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Quiz2Test {
    @Test
    public void testIsValidIPTrue(){
        boolean isValid = Quiz2.isValidIPv4("0.0.0.0");
        assertTrue(isValid);

    }
    @Test
    public void testIsValidIPFalse(){
        boolean isNotValid = Quiz2.isValidIPv4("123.128.56");
        assertFalse(isNotValid);
        boolean isNotValid1 = Quiz2.isValidIPv4("198.162.10.10.");
        assertFalse(isNotValid1);
        boolean isNotValid2 = Quiz2.isValidIPv4("198.257.10.10");
        assertFalse(isNotValid2);


    }

}