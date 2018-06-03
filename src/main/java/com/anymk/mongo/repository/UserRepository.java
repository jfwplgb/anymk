package com.anymk.mongo.repository;

import com.anymk.mongo.model.UserBean;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserBean, String> {

    UserBean findByUsername(String username);

    List<UserBean> findTop10ByUsernameLikeOrNicknameLike(String username, String nickname);

}
