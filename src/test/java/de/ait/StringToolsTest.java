package de.ait;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {
//aaaaaaaaa
    @Nested
    @DisplayName("Testi dlia metoda FirstToUpperCase")

    class ForFirstToUpperCaseTests {

        @Test
        public void FirstToUpperCase_UpperFirstReturned() {
            String actual = StringTools.FirstToUpperCase("apple");
            assertEquals("Apple", actual);
        }
            @Test
            public void FirstToUpperCaseWithEmpty_UpperFirstReturned() {
            String actual1 = StringTools.FirstToUpperCase("");
            assertEquals("", actual1);
        }
    }

    @Nested
    @DisplayName("Testi dlia metoda isStartingFromCapital")

    class ForIsStartingFromCapitalTests {
        @Test
        @DisplayName("isStratringFromCapital(\"apple\") -> false")
        public void isStartingFromCapital_TrueReturned() {
            String actual = "apple";
            boolean res = StringTools.isStartingFromCapital(actual);
            assertFalse(res);
        }
            @Test
            public void isStartingFromCapitalWithCapital_TrueReturned(){

            String actual1 = "Apple";
            boolean res2 = StringTools.isStartingFromCapital(actual1);
            assertTrue(res2);
        }
    }
}