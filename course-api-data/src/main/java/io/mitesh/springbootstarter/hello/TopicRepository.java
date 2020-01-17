package io.mitesh.springbootstarter.hello;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String>
{
	
}  
