//package com.codeup.fadlister.seeders;
//
//import com.codeup.fadlister.models.Image;
//import com.codeup.fadlister.repositories.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Random;
//
//@Component
//public class DatabaseSeeder implements CommandLineRunner {
//    private final Logger log = LoggerFactory.getLogger(this.getClass());
//    private final Bans banDao;
//    private final Categories categoryDao;
//    private final Comments commentDao;
//    private final Fads fadDao;
//    private final Flags flagDao;
//    private final Images imageDao;
//    private final Messages messageDao;
//    private final NotificationMessages notificationMessageDao;
//    private final Notifications notificationDao;
//    private final Profiles profileDao;
//    private final Ratings ratingDao;
//    private final StatusCodes statusCodeDao;
//    private final Users userDao;
//
//
//    @Value("${app.env}")
//    private String environment;
//
//    public DatabaseSeeder(Bans banDao, Categories categoryDao, Comments commentDao, Fads fadDao, Flags flagDao, Images imageDao, Messages messageDao, NotificationMessages notificationMessageDao, Notifications notificationDao, Profiles profileDao, Ratings ratingDao, StatusCodes statusCodeDao, Users userDao) {
//        this.imageDao = imageDao;
//        this.categoryDao = categoryDao;
//        this.statusCodeDao = statusCodeDao;
//        this.notificationMessageDao = notificationMessageDao;
//        this.profileDao = profileDao;
//        this.userDao = userDao;
//        this.fadDao = fadDao;
//        this.banDao = banDao;
//        this.commentDao = commentDao;
//        this.messageDao = messageDao;
//        this.notificationDao = notificationDao;
//        this.flagDao = flagDao;
//        this.ratingDao = ratingDao;
//    }
//
//
//    // create list of images
////    private List<Image> seedUsers() {
////        List<Image> images = Arrays.asList(
////                new Image("zach"),
////                new Image("luis"),
////                new Image("fer"),
////                new Image("ryan"),
////                new Image("justin")
////        );
////        userDao.save(users);
////        return users;
////    }
//
//
//    // create list of categories
//
//    // create list of status codes
//
//    // create list of notification messages
//
//    // create list of users
//
//    // create list of profiles
//
//    // create list of fads
//
//    // create list of bans
//
//    // create list of comments
//
//    // create list of messages
//
//    // create list of notifications
//
//    // create list of flags
//
//    // create list of ratings
//
//
////    // generate a list of users and return it after saving
////    private List<User> seedUsers() {
////        List<User> users = Arrays.asList(
////                new User("zach"),
////                new User("luis"),
////                new User("fer"),
////                new User("ryan"),
////                new User("justin")
////        );
////        userDao.save(users);
////        return users;
////    }
////
////    // generate a handful of posts, and randomly assign a user to each one
////    private void seedPosts(List<User> users) {
////        Post longPost = new Post(
////                "Example 1",
////                "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci atque commodi eligendi necessitatibus voluptates. At distinctio dolores minus molestiae mollitia nemo sapiente ut veniam voluptates! Corporis distinctio error quaerat vel!"
////        );
////        List<Post> posts = Arrays.asList(
////                new Post("Title 1", "Body 1"),
////                new Post("Title 2", "Body 2"),
////                new Post("Title 3", "Body 3"),
////                new Post("Title 4", "Body 4"),
////                new Post("Example 2", "QWE Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci atque commodi eligendi necessitatibus voluptates. At distinctio dolores minus molestiae mollitia nemo sapiente ut veniam voluptates! Corporis distinctio error quaerat vel!"),
////                new Post("Example 3", "ASD Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci atque commodi eligendi necessitatibus voluptates. At distinctio dolores minus molestiae mollitia nemo sapiente ut veniam voluptates! Corporis distinctio error quaerat vel!"),
////                longPost
////        );
////        Random r = new Random();
////        for (Post p : posts) {
////            User randomUser = users.get(r.nextInt(users.size()));
////            p.setUser(randomUser);
////        }
////        postDao.save(posts);
////    }
//
//    @Override
//    public void run(String... strings) throws Exception {
//        if (! environment.equals("development")) {
//            log.info("app.env is not development, doing nothing.");
//            return;
//        }
//        log.info("Deleting posts...");
//        postDao.deleteAll();
//        log.info("Deleting users...");
//        userDao.deleteAll();
//        log.info("Seeding users...");
//        List<User> users = seedUsers();
//        log.info("Seeding posts...");
//        seedPosts(users);
//        log.info("Finished running seeders!");
//    }
//}