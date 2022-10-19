package com.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardRepository extends MongoRepository<Board, String> {

}
