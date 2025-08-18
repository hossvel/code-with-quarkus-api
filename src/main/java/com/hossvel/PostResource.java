package com.hossvel;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.inject.Inject;

import java.util.ArrayList;
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
