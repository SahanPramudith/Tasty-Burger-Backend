package edu.icet.crm.service;

import edu.icet.crm.model.PostModel;

import java.util.List;

public interface PostService {
    void save(PostModel post);

    List<PostModel> getpost();

    void deletepost(Integer id);
}
