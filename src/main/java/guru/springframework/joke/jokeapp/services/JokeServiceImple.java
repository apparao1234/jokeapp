package guru.springframework.joke.jokeapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImple  implements JokeService{
	
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	@Autowired
	public JokeServiceImple(ChuckNorrisQuotes chuckNorrisQuotes ) {
		this.chuckNorrisQuotes = chuckNorrisQuotes;
		
	}
	
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
