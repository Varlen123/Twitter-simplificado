package br.twitter.entitys;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
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
