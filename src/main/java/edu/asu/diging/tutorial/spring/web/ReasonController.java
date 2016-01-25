package edu.asu.diging.tutorial.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.tutorial.spring.service.MoodServiceInterface;

@Controller
public class ReasonController {

	
	@Autowired
	private MoodServiceInterface moodService;

	@RequestMapping(value="/reason/{mood}")
	public String showExplanation(@PathVariable("mood") String mood, Model model) {
		model.addAttribute("mood", mood);
		model.addAttribute("reason", moodService.getCurrentMoodReason());
		
		return "reason";
	}
}
