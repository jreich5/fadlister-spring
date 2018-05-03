package com.codeup.fadlister.seeders;

import com.codeup.fadlister.models.*;
import com.codeup.fadlister.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private final Bans banDao;
    private final Categories categoryDao;
    private final Comments commentDao;
    private final Fads fadDao;
    private final Flags flagDao;
    private final Images imageDao;
    private final Messages messageDao;
    private final NotificationMessages notificationMessageDao;
    private final Profiles profileDao;
    private final Ratings ratingDao;
    private final StatusCodes statusCodeDao;
    private final Users userDao;


    @Value("${app.env}")
    private String environment;

    private int getRandomIndex(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    public DatabaseSeeder(Bans banDao, Categories categoryDao, Comments commentDao, Fads fadDao, Flags flagDao, Images imageDao, Messages messageDao, NotificationMessages notificationMessageDao, Profiles profileDao, Ratings ratingDao, StatusCodes statusCodeDao, Users userDao) {
        this.imageDao = imageDao;
        this.categoryDao = categoryDao;
        this.statusCodeDao = statusCodeDao;
        this.notificationMessageDao = notificationMessageDao;
        this.profileDao = profileDao;
        this.userDao = userDao;
        this.fadDao = fadDao;
        this.banDao = banDao;
        this.commentDao = commentDao;
        this.messageDao = messageDao;
        this.flagDao = flagDao;
        this.ratingDao = ratingDao;
    }


    // create list of images
    private List<Image> seedImages() {
        List<Image> images = Arrays.asList(
                new Image("https://images.pexels.com/photos/104827/cat-pet-animal-domestic-104827.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"),
                new Image("https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"),
                new Image("https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"),
                new Image("https://images.pexels.com/photos/127028/pexels-photo-127028.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"),
                new Image("https://images.pexels.com/photos/209037/pexels-photo-209037.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"),
                new Image("https://images.pexels.com/photos/209037/pexels-photo-209037.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260")
        );
        imageDao.save(images);
        return images;
    }


    // create list of categories
    private List<Category> seedCategories() {
        List<Category> categories = Arrays.asList(
            new Category("cats"),
            new Category("funny"),
            new Category("sad"),
            new Category("orange"),
            new Category("blue")
        );
        categoryDao.save(categories);
        return categories;
    }


    // create list of status codes
    private List<StatusCode> seedStatusCodes() {
        List<StatusCode> statusCodes = Arrays.asList(
            new StatusCode("info"),
            new StatusCode("success"),
            new StatusCode("warning"),
            new StatusCode("danger"),
            new StatusCode("reminder")
        );
        statusCodeDao.save(statusCodes);
        return statusCodes;
    }

    // create list of notification messages
    private List<NotificationMessage> seedNotificationMessages() {
        List<NotificationMessage> notificationsMessages = Arrays.asList(
            new NotificationMessage("fad_created", "test"),
            new NotificationMessage("fad_updated", "test"),
            new NotificationMessage("fad_flagged", "test"),
            new NotificationMessage("fad_deleted", "test"),
            new NotificationMessage("fad_rated", "test"),
            new NotificationMessage("comment_created", "test"),
            new NotificationMessage("comment_updated", "test"),
            new NotificationMessage("comment_flagged", "test"),
            new NotificationMessage("comment_deleted", "test"),
            new NotificationMessage("message_created", "test"),
            new NotificationMessage("message_updated", "test"),
            new NotificationMessage("message_deleted", "test"),
            new NotificationMessage("message_sent", "test"),
            new NotificationMessage("message_received", "test"),
            new NotificationMessage("fad_created", "test"),
            new NotificationMessage("fad_updated", "test"),
            new NotificationMessage("fad_flagged", "test"),
            new NotificationMessage("fad_rated", "test"),
            new NotificationMessage("fad_deleted", "test"),
            new NotificationMessage("fad_has_been_flagged", "test"),
            new NotificationMessage("user_account_created", "test"),
            new NotificationMessage("user_account_updated", "test"),
            new NotificationMessage("password_updated", "test"),
            new NotificationMessage("username_updated", "test"),
            new NotificationMessage("your_account_is_deactivated", "test"),
            new NotificationMessage("your_account_has_been_flagged", "test"),
            new NotificationMessage("your_account_has_been_deleted", "test"),
            new NotificationMessage("your_account_has_been_banned", "test"),
            new NotificationMessage("your_account_ban_has_been_lifted", "test"),
            new NotificationMessage("profile_updated", "test"),
            new NotificationMessage("profile_image_updated", "test"),
            new NotificationMessage("profile_name_updated", "test"),
            new NotificationMessage("profile_date_of_birth_updated", "test"),
            new NotificationMessage("profile_quote_updated", "test"),
            new NotificationMessage("user_account_flagged", "test"),
            new NotificationMessage("user_account_deleted", "test"),
            new NotificationMessage("user_account_banned", "test"),
            new NotificationMessage("user_account_deactivated", "test")
        );
        notificationMessageDao.save(notificationsMessages);
        return notificationsMessages;
    }

    // create list of users
    private List<User> seedUsers() {
        List<User> users = Arrays.asList(
            new User("jconner", "john@emai.com", "getmein", Role.MODERATOR, true),
            new User("smith", "smith@emai.com", "getmein", Role.USER, true),
            new User("fchild", "fred@emai.com", "getmein", Role.USER, true),
            new User("kkyle", "kelly@emai.com", "getmein", Role.USER, true),
            new User("ksnell", "kate@emai.com", "getmein", Role.USER, true)
        );

        userDao.save(users);
        return users;
    }

    // create list of profiles
    private List<Profile> seedProfiles(List<User> users, List<Image> images) {
        List<Profile> profiles = null;

        profiles = Arrays.asList(
            new Profile("John Conner", LocalDate.parse("1980-01-01"), "No fate but what me make.", images.get(0)),
            new Profile("Sam Smith", LocalDate.parse("1990-01-01"), "I love pie.", images.get(0)),
            new Profile("Fred Child", LocalDate.parse("1970-01-01"), "Where is my hat.", images.get(0)),
            new Profile("Kelly Kyle", LocalDate.parse("1985-01-01"), "Well, that's awesome!", images.get(0)),
            new Profile("Kate Snell", LocalDate.parse("1960-01-01"), "It's butter.", images.get(0))
        );

        for (int i = 0; i < users.size(); i += 1) {
            profiles.get(i).setUser(users.get(i));
        }

        profileDao.save(profiles);
        return profiles;

    }

    private List<Category> randCats(List<Category> categories) {
        return categories.stream()
            .filter((line) -> getRandomIndex(3) == 1)
            .collect(Collectors.toList());
    }

    // seed categories into fads by inserting a List<Category> as constructor argument
    // create list of fads
    private List<Fad> seedFads(List<User> users, List<Image> images, List<Category> categories) {
        List<Fad> fads = null;

        fads = Arrays.asList(
            new Fad("Dabbing", "Dabbing is an awesome thing.", "2010s", images.get(1), randCats(categories)),
            new Fad("Blahing", "Blahing is an awesome thing.", "2000s", images.get(2), randCats(categories)),
            new Fad("Camping", "Camping is an awesome thing.", "1990s", images.get(3), randCats(categories)),
            new Fad("Cooking", "Cooking is an awesome thing.", "1980s", images.get(4), randCats(categories)),
            new Fad("Running", "Running is an awesome thing.", "2010s", images.get(5), randCats(categories))
        );

        for (int i = 0; i < users.size(); i += 1) {
            fads.get(i).setUser(users.get(getRandomIndex(users.size() - 1)));
        }

        fadDao.save(fads);
        return fads;

    }

    // create list of bans
    private List<Ban> seedBans(List<User> users) {
        List<Ban> bans = null;

        bans = Arrays.asList(
            new Ban("User banned for too much dabbing.", true, users.get(0), users.get(1))
        );

        banDao.save(bans);
        return bans;
    }

    // list of comments
    private List<Comment> seedComments(List<Fad> fads, List<User> users) {
        List<Comment> comments = null;

        comments = Arrays.asList(
            new Comment("I love dabbing", users.get(2), fads.get(0)),
            new Comment("Yeah commenting is the bomb.", users.get(2), fads.get(0)),
            new Comment("Not a fan of talking too much.", users.get(2), fads.get(1)),
            new Comment("This is my only comment.",  users.get(3), fads.get(0)),
            new Comment("Hello mom", users.get(3), fads.get(0))
        );

        commentDao.save(comments);
        return comments;

    }

    // list of messages
    private List<Message> seedMessages(List<User> users) {
        List<Message> messages = null;

        messages = Arrays.asList(
            new Message("Howdy", "Well hello.", users.get(2), users.get(3)),
            new Message("RE:Howdy", "Hi; what's up?", users.get(3), users.get(2)),
            new Message("RE:RE:HOWDY", "Just thought I'd let you know you are cool.", users.get(2), users.get(3)),
            new Message("RE:RE:RE:HOWDY", "I am, aren't I?",  users.get(3), users.get(2)),
            new Message("Greetings", "This is a new message to you.", users.get(2), users.get(3))
        );

        messageDao.save(messages);
        return messages;

    }

    // list of messages
    private List<Flag> seedFlags(List<User> users, List<Fad> fads, List<Comment> comments) {
        List<Flag> flags = null;

        flags = Arrays.asList(
            new Flag(true, users.get(0), null, null, users.get(1)),
            new Flag(true, users.get(2), comments.get(0), null, null),
            new Flag(true, users.get(3), comments.get(0), null, null),
            new Flag(true, users.get(3), null, fads.get(2), null),
            new Flag(true, users.get(3), null, fads.get(3), null),
            new Flag(true, users.get(3), comments.get(3), null, null)
        );

        flagDao.save(flags);
        return flags;

    }

    // list of ratings
    private List<Rating> seedRatings(List<User> users, List<Fad> fads) {
        List<Rating> ratings = null;

        ratings = Arrays.asList(
            new Rating((byte) -2, fads.get(0), users.get(3)),
            new Rating((byte) -2, fads.get(1), users.get(3)),
            new Rating((byte) 0, fads.get(0), users.get(3)),
            new Rating((byte) 2, fads.get(0), users.get(4)),
            new Rating((byte) 2, fads.get(0), users.get(2)),
            new Rating((byte) 1, fads.get(0), users.get(4))
        );

        ratingDao.save(ratings);
        return ratings;

    }

    @Override
    public void run(String... strings) throws Exception {
        if (! environment.equals("development")) {
            log.info("app.env is not development, doing nothing.");
            return;
        }

        // ================= DELETING

        // rating
        log.info("Deleting ratings...");
        ratingDao.deleteAll();

        // flag
        log.info("Deleting flags...");
        flagDao.deleteAll();

        // message
        log.info("Deleting messages...");
        messageDao.deleteAll();

        // comment
        log.info("Deleting comments...");
        commentDao.deleteAll();

        // ban
        log.info("Deleting bans...");
        banDao.deleteAll();

        // fad
        log.info("Deleting fads...");
        fadDao.deleteAll();

        // profile
        log.info("Deleting profiles...");
        profileDao.deleteAll();

        // user
        log.info("Deleting users...");
        userDao.deleteAll();

        // notificationMessage
        log.info("Deleting notification messages...");
        notificationMessageDao.deleteAll();

        // statusCode
        log.info("Deleting status codes...");
        statusCodeDao.deleteAll();

        // category
        log.info("Deleting categories...");
        categoryDao.deleteAll();

        // image
        log.info("Deleting images");
        imageDao.deleteAll();



        // ================= SEEDING

        // image
        log.info("Seeding images...");
        List<Image> images = seedImages();

        // category
        log.info("Seeding categories...");
        List<Category> categories = seedCategories();

        // statusCode
        log.info("Seeding status codes...");
        seedStatusCodes();

        // notificationMessage
        log.info("Seeding notification messages...");
        seedNotificationMessages();

        // user
        log.info("Seeding users...");
        List<User> users = seedUsers();

        // profile
        log.info("Seeding profiles...");
        seedProfiles(users, images);

        // fad
        log.info("Seeding fads...");
        List<Fad> fads = seedFads(users, images, categories);

        // ban
        log.info("Seeding bans...");
        seedBans(users);

        // comment
        log.info("Seeding comments...");
        List<Comment> comments = seedComments(fads, users);

        // message
        log.info("Seeding messages...");
        seedMessages(users);

        // flag
        log.info("Seeding flags...");
        seedFlags(users, fads, comments);

        // rating
        log.info("Seeding ratings...");
        seedRatings(users, fads);

        log.info("Finished running seeders!");
    }
}