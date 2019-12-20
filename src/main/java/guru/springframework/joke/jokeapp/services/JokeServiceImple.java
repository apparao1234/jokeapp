package guru.springframework.joke.jokeapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImple  implements JokeService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	public JokeServiceImple() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
