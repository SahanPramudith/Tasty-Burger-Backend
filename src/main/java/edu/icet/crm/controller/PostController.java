package edu.icet.crm.controller;

import edu.icet.crm.model.PostModel;
import edu.icet.crm.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
public class PostController {
    @Autowired
    PostService service;

    @PostMapping("/save")
    void savePost(@RequestBody PostModel post){
        service.save(post);
    }
    @GetMapping("/getpost")
    List<PostModel> getpost(){
        List<PostModel> getpost = service.getpost();
        return getpost;
    }
    @DeleteMapping("/delete{id}")
    void deletepsot(@PathVariable Integer id){
        service.deletepost(id);
    }


}
