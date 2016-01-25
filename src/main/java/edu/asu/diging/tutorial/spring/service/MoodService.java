package edu.asu.diging.tutorial.spring.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements MoodServiceInterface {
	
	
	private List<String> moodList;
	private List<String> reasonList;
	private int moodId;
	private Random random;	
 
	@PostConstruct
	public void init() {
		moodList = new LinkedList<String>();
		moodList.add("happy");
		moodList.add("sad");
		moodList.add("angry");
		
		reasonList = new LinkedList<String>();
		reasonList.add("Reason for happy");
		reasonList.add("Reason for sad");
		reasonList.add("Reason for angry");
		
	}
	
	
	
    public Mood getCurrentMood() {
    	random = new Random();
    	moodId = random.nextInt(moodList.size());
        return new Mood(moodList.get(moodId));
    }


	public String getCurrentMoodReason() {
		// TODO Auto-generated method stub
		return reasonList.get(moodId);
	}
}
