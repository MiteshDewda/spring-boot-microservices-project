package io.mitesh.springbootstarter.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	@Autowired
	private TopicRepository topicRepository;
	
    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Core Java", "Core Java Description"),
			new Topic("Java Script", "JavaSrcipt", "Java Script Description")));
	
	public List<Topic> getAllTopics()
	{
		//return Topics
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
}