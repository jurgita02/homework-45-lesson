package de.ait;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToolsTest {
@Test
    public void FirstToUpperCase_UpperFirstReturned(){
    String actual=StringTools.FirstToUpperCase("apple");
    assertEquals("Apple", actual);

    String actual1 =StringTools.FirstToUpperCase(" ");
    assertEquals("", actual1);
    }

    @Test
   public void isStartingFromCapital_TrueReturned(){
     String actual= "apple";
     boolean res=StringTools.isStartingFromCapital(actual);
     assertFalse(res);

        String actual1 = "Apple";
        boolean res2 = StringTools.isStartingFromCapital(actual1);
        assertTrue(res2);
   }

}