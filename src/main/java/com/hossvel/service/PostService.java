package com.hossvel.service;

import com.hossvel.model.Post;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@ApplicationScoped
public class PostService {
    private final AtomicLong idGenerator = new AtomicLong(1);
    private List<Post> posts = new ArrayList<>();
//   private List<Post> posts = List.of(
//            new Post(1L, "Hello", "This is a post Hoss"),
//            new Post(2L, "Hello", "This is a post Hoss"),
//            new Post(3L, "Hello", "This is a post Hoss")
//    );

    public List<Post> getlistPost(){
      return posts;
    }

    public Post agregar(Post post) {
        post.id = idGenerator.getAndIncrement();
        posts.add(post);
        return post;
    }




}
