package eu.deustotech.semanticreasoning.reasoner;

import eu.deustotech.clips.CLIPSError;
import eu.deustotech.clips.MultifieldValue;

public interface ResultsFilter {
	public boolean isRetained(MultifieldValue triple) throws CLIPSError;
}
