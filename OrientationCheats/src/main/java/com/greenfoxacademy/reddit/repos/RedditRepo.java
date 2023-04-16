package com.greenfoxacademy.reddit.repos;

import com.greenfoxacademy.reddit.models.reddit.RedditPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// Repo, mindig JPA, ha valami
// Ez kezeli az adatbázist, a megírt entity ide kerül, egy sora lesz a reponak
@Repository
public interface RedditRepo extends JpaRepository<RedditPost, Long> {


    // Ide jön minden ami adatbázis lekérdezés, ide teszed be, van egy csomó elöre megirt metódus.

    List<RedditPost> findAll();

    // ezek elöre megirt metódusok, én csak használom
    // ez innen átugrik a service-be és onnan meghívhatjuk a kontrollerbe
    List<RedditPost> deleteRedditPostById(Long Id);



}
