package com.greenfoxacademy.reddit.models.reddit;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity
@Table
public class RedditPostExtension {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column
    private boolean postable;

    @Column
    private String createdAt;


    @OneToOne(mappedBy = "redditPostExtension") // field neve, nem a típusa, CASE sensitive
    private RedditPost redditPost;


    public RedditPostExtension() {
    }

    public RedditPostExtension(boolean postable) {
        this.postable = postable;
        // Date and time formázás -> 4m teljes hónapnév, 3m jan, 2m 01 <szám
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy. MMMM dd. HH:mm:ss");
        // Stringet ad vissza
        this.createdAt = LocalDateTime.now().format(formatter);
        // Új RedditPost Objectet Kreál
//        this.redditPost = new RedditPost(2, "name");
    }

    public boolean getPostable() {
        return postable;
    }

    public void setPostable(boolean postable) {
        this.postable = postable;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RedditPost getRedditPost() {
        return redditPost;
    }

    public void setRedditPost(RedditPost redditPost) {
        this.redditPost = redditPost;
    }

    public Long getId() {
        return id;
    }


}
