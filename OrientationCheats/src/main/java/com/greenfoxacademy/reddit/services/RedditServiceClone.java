package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.reddit.RedditPost;
import com.greenfoxacademy.reddit.repos.RedditRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Component("Clone")
@Service
public class RedditServiceClone implements RedditService {

    // Bekötjük a repot, hogy elérjük a metódusait, és vissza adhassuk azok értékét
    private RedditRepo redditRepo;
    @Autowired
    public RedditServiceClone(RedditRepo redditRepo) {
        this.redditRepo = redditRepo;
    }


    @Override
    public List<RedditPost> findAll() {
        return redditRepo.findAll();
    }

    @Override
    public void createPost(RedditPost redditPost) {
        redditRepo.save(redditPost);
    }

    @Override
    public void createPost(int counter, String title) {
        redditRepo.save(new RedditPost(counter, title));
    }

//    @Override
//    public List<RedditPost> minusOne(Long id_) {
//        return redditRepo.decreaseCounter(id_);
//    }

    @Override
    public List<RedditPost> deletePostWithId(Long id){
        return redditRepo.deleteRedditPostById(id);
    }

    @Override
    public void updatePostById(Long id) {
        Optional<RedditPost> post = redditRepo.findById(id);
        if(post.isPresent()){
            RedditPost b = post.get();
            b.setCounter(b.getCounter() + 2);
            redditRepo.save(b);
        }
    }


}
