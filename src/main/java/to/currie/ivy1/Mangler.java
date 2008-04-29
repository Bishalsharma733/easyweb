package to.currie.ivy1;

import org.apache.commons.lang.WordUtils;

public class Mangler {

	public String mangle(String message)
	{
		return WordUtils.capitalizeFully(message);
	}
}
