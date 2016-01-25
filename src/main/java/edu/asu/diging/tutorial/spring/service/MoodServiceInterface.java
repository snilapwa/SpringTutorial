package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface MoodServiceInterface {
	
	public abstract Mood getCurrentMood();

	public abstract String getCurrentMoodReason();

}
