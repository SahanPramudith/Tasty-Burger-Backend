package edu.icet.crm.service.impl;

import edu.icet.crm.entity.PostEntity;
import edu.icet.crm.model.PostModel;
import edu.icet.crm.repository.PostRepository;
import edu.icet.crm.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository repository;
    @Autowired
    ModelMapper mapper;


    @Override
    public void save(PostModel post) {
        repository.save(mapper.map(post, PostEntity.class));
    }

    @Override
    public List<PostModel> getpost() {
        ArrayList<PostModel> post = new ArrayList<>();
        for (PostEntity postEntity : repository.findAll()) {
            post.add(mapper.map(postEntity,PostModel.class));
        }

        return post;

    }
    @Override
    public void deletepost(Integer id) {
        repository.deleteById(id);
    }


}
