package edu.utoledo;

public class EnglishTimeOfDay {

    public static String tellTimeOfDay(int currentHour) {

        if (currentHour >= 0 && currentHour < 6) {
            return "Night";
        }
        if (currentHour >= 6 && currentHour < 12) {
            return "Morning";
        }
        if (currentHour >= 12 && currentHour < 18) {
            return "Afternoon";
        }
        return "Evening";
    }
}

