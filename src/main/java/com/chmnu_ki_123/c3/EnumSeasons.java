package com.chmnu_ki_123.c3;

public class EnumSeasons {
    public static void main(String[] args) {
        SeasonType currentSeason = SeasonType.WINTER;

        System.out.println("It is winter now, we need to go play snowballs.");

        // Обхід усіх сезонів за допомогою values()
        for (SeasonType season : SeasonType.values()) {
            System.out.println("Season: " + season + " - " + season.getDescription());
        }

        // Використання switch для конкретного сезону
        switch (currentSeason) {
            case SPRING, SUMMER, AUTUMN, WINTER ->
                    System.out.println("Currently: " + currentSeason.getDescription());
            default ->
                    System.out.println("Unknown season.");
        }
    }

    public enum SeasonType {
        SPRING("Spring", "Blooming flowers"),
        SUMMER("Summer", "Beach trips"),
        AUTUMN("Autumn", "Harvest time"),
        WINTER("Winter", "Snowy landscapes");

        private final String name;
        private final String description;

        SeasonType(String name, String description) {
            this.name = name;
            this.description = description;
        }

        /**
         * Отримати повний опис сезону.
         */
        public String getDescription() {
            return name + ": " + description;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
