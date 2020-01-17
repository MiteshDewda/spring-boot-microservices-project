package io.mitesh.springbootstarter.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("Java", "Core Java", "Core Java Description"),
				new Topic("Java Script", "JavaSrcipt", "Java Script Description"));
	}
}
