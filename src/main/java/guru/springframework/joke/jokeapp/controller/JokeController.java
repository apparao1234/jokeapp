package guru.springframework.joke.jokeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.jokeapp.services.JokeService;
@Controller
public class JokeController {

	JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		this.jokeService =jokeService;
		
		
	}
	
	@RequestMapping({"/",""})
    public String getJokesView(Model model) {
		//maping of model and view with content
		model.addAttribute("joke",jokeService.getJoke());
		return "checknorris"; //it is view name
    }
}
