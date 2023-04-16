package com.greenfoxacademy.reddit.models.reddit;



import javax.persistence.*;



// table name = SQL DB's name
@Entity
@Table
public class RedditPost {


    // id for each Row
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

      private int counter;

      private String title;



//     @OneToOne(cascade = CascadeType.All) // < mindent töröl, ami összevan köttve// csak leválasztja, törlésnél megszünik a kapcsolat
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "extension_id", referencedColumnName = "id")
    private RedditPostExtension redditPostExtension;



//    @JoinTable(name = "createdAt")



    // üres mindig kell!
    public RedditPost() {
    }

    // kell az id kivételével minden, kezdőérték(construktorba), getter-setter, ID-hoz csak getter
    public RedditPost(int counter, String title) {
        this.counter = counter;
        this.title = title;
//        this.redditPostExtension = redditPostExtension;
    }




    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }



    public Long getId() {
        return id;
    }

    public RedditPostExtension getExtension() {
        return redditPostExtension;
    }

    public void setExtension(RedditPostExtension extension) {
        this.redditPostExtension = extension;
    }



}
