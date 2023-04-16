package com.greenfoxacademy.reddit;

import com.greenfoxacademy.reddit.models.reddit.RedditPost;
import com.greenfoxacademy.reddit.models.reddit.RedditPostExtension;
import com.greenfoxacademy.reddit.repos.RedditExtRepo;
import com.greenfoxacademy.reddit.repos.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

    private RedditRepo redditRepo;
    private RedditExtRepo redditExtRepo;


    @Autowired
    public RedditApplication(RedditRepo redditRepo, RedditExtRepo redditExtRepo) {
        this.redditRepo = redditRepo;
        this.redditExtRepo = redditExtRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(RedditApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        
    // Új redditPostot hozunk létre
        RedditPost redditPost1 = new RedditPost(91, "It works as we intended it to in Internet Explorer.");
        RedditPost redditPost2 = new RedditPost(55, "Polish history in on picture");
        RedditPost redditPost3 = new RedditPost(24, "Motion sensors were not installed the right way");

    // Elmentjük a redditPostokat
        redditRepo.save(redditPost1);
        redditRepo.save(redditPost2);
        redditRepo.save(redditPost3);

    //Új redditPostExtensionöket hozunk létre
        RedditPostExtension redditPostExtension1 = new RedditPostExtension(true);
        RedditPostExtension redditPostExtension2 = new RedditPostExtension(true);
        RedditPostExtension redditPostExtension3 = new RedditPostExtension(true);

    // Elmentjük a redditPostExtensiönöket
        redditExtRepo.save(redditPostExtension1);
        redditExtRepo.save(redditPostExtension2);
        redditExtRepo.save(redditPostExtension3);

    // Hozzárendeljük a redditPostExtensionöket a redditPostokhoz
        redditPost1.setExtension(redditPostExtension1);
        redditPost2.setExtension(redditPostExtension2);
        redditPost3.setExtension(redditPostExtension3);

    // Elmentjük a hozzárendeléseket
        redditRepo.save(redditPost1);
        redditRepo.save(redditPost2);
        redditRepo.save(redditPost3);


    // Kiírjuk a konzolba, hogy tudjuk elindult a program :)
        System.out.println("Spring Boot + SQL Application Started");
    }
}
