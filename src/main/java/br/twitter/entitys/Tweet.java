package br.twitter.entitys;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "tb_tweet" )
public class Tweet {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column(name = "tweet_id")
    private Long tweetId;
    
    private User user;

    private String content;

    @CreationTimestamp
    private LocalDateTime createdTimeStamp;

}
