package Builder;

import Builder.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Kirill", "Kap")
                .age(36)
                .phone("890536995")
                .address("Saratov, Shelk")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Ivan", "Prokofief")
                .age(32)
                .phone("893745226")
                .build();

        System.out.println(user2);

        User user3 = new User.UserBuilder("Sergej", "Ivanov")
                .build();

        System.out.println(user3);
    }
    }
