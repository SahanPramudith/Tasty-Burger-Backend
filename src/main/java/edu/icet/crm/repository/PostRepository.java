package edu.icet.crm.repository;

import edu.icet.crm.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<PostEntity,Integer> {

}
