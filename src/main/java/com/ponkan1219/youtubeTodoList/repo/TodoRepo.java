package com.ponkan1219.youtubeTodoList.repo;

import com.ponkan1219.youtubeTodoList.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {


}
