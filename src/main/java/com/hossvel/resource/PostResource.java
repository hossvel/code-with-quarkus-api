package com.hossvel.resource;

import com.hossvel.service.PostService;
import com.hossvel.model.Post;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.inject.Inject;

import java.util.List;

@Path("/posts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostResource {

    @Inject
    public PostService postService;

    @GET
    public List<Post> getPosts() {

        return postService.getlistPost();
    }
    @POST
    public Post agregarPost(Post post) {
       //return postService.getlistPost().getFirst();
       return postService.agregar(post);
    }


}
