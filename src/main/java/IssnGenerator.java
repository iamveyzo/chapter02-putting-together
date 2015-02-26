import java.util.Random;
import java.util.logging.Logger;

import javax.inject.Inject;

@EightDigits
public class IssnGenerator implements NumberGenerator {

	@Inject
	private Logger logger;

	@Loggable
	public String generateNumber() {
		String issn = "8-" + Math.abs(new Random().nextInt());
		logger.info("Generate ISSN : " + issn);
		return issn;
	}

}
