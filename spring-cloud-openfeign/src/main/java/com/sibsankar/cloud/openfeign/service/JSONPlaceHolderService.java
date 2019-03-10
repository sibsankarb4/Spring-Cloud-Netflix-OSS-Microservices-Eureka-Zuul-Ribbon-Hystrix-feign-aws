package com.sibsankar.cloud.openfeign.service;

import com.sibsankar.cloud.openfeign.model.Post;

import java.util.List;

public interface JSONPlaceHolderService {

    List<Post> getPosts();

    Post getPostById(Long id);
}
