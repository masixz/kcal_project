package com.cal.kcal.repo;

import com.cal.kcal.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
