package guru.spring.framework.spring5jokesappv2.Services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokeServiceImplTest {

	JokeServiceImpl jokeService;

	@BeforeEach
	void setUp() {
		jokeService = new JokeServiceImpl();
	}

	@Test
	void getJoke() {
		System.out.println(jokeService.getJoke());
	}
}