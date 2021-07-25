package guru.spring.framework.spring5jokesappv2.controllers;

import guru.spring.framework.spring5jokesappv2.Services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

	private final JokeServiceImpl jokeService;

	public JokeController(final JokeServiceImpl jokeService) {
		this.jokeService = jokeService;
	}

	@RequestMapping({ "/", "" })
	public String getJoke(Model model) {
		model.addAttribute("joke", jokeService.getJoke());

		return "index";
	}

}
