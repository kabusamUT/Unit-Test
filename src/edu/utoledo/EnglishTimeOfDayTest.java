package edu.utoledo;

import org.junit.jupiter.api.Test;
import com.sun.tools.javac.util.Assert;

public class EnglishTimeOfDayTest {

    @Test
    public void tellTimeOfDay() throws Exception{
        EnglishTimeOfDay englishTimeOfDay = new EnglishTimeOfDay();
        String retValue = englishTimeOfDay.tellTimeOfDay(12);

        Assert.check(retValue == "Afternoon");
    }
}
