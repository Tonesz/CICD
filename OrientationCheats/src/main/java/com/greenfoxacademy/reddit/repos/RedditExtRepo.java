package com.greenfoxacademy.reddit.repos;

import com.greenfoxacademy.reddit.models.reddit.RedditPostExtension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditExtRepo extends JpaRepository<RedditPostExtension, Long> {

}