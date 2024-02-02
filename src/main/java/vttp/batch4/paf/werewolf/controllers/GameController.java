package vttp.batch4.paf.werewolf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class GameController {

	@PostMapping("/game")
	public ModelAndView postGame() {
		ModelAndView mav = new ModelAndView();
		return mav;
	}
}
