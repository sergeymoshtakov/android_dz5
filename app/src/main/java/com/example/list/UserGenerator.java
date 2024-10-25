package com.example.list;

import com.example.list.models.UserModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserGenerator {
    private static final int[] AVATARS = { R.drawable.avatar1, R.drawable.avatar2, R.drawable.avatar3, R.drawable.avatar4, R.drawable.avatar5 };
    private static final String[] FIRST_NAMES = { "John", "Alice", "Bob", "Anna", "Mark", "Emma", "Luke", "Sophia", "Tom", "Olivia" };
    private static final String[] LAST_NAMES = { "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor" };
    private static final String[] COUNTRIES = { "USA", "Canada", "Australia" };
    private static final String[][] CITIES = {
            { "New York", "Los Angeles", "Chicago", "Houston", "Phoenix" },
            { "Toronto", "Vancouver", "Montreal", "Calgary", "Ottawa" },
            { "Sydney", "Melbourne", "Brisbane", "Perth", "Adelaide" }
    };

    public static List<UserModel> generateUsers(int count) {
        List<UserModel> users = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            int avatarId = AVATARS[random.nextInt(AVATARS.length)];
            String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            int age = 14 + random.nextInt(86); // age from 14 to 99
            int countryIndex = random.nextInt(COUNTRIES.length);
            String country = COUNTRIES[countryIndex];
            String city = CITIES[countryIndex][random.nextInt(CITIES[countryIndex].length)];

            users.add(new UserModel(avatarId, firstName, lastName, age, country, city));
        }

        return users;
    }
}
