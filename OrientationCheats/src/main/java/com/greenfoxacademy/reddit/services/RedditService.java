package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.reddit.RedditPost;
import org.springframework.stereotype.Service;

import java.util.List;

// Ez tök üres, ide CSAK PULLOLUNK! shift+alt+enter a megirt metódusra az IMPL-ben
// Methods to implement <-

@Service
public interface RedditService {
    List<RedditPost> findAll();

    void createPost(RedditPost redditPost);

    void createPost(int counter, String title);

    List<RedditPost> deletePostWithId(Long id);

    void updatePostById(Long id);

//    List<RedditPost> updatePostById(Long id);


//    void plusOne();

//    List<RedditPost> minusOne(Long id_);
}
