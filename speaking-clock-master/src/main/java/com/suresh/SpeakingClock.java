package com.suresh;


//Common functionality for time conversion into words.
 
public interface SpeakingClock {
	
	//Convert time, in format HH:mm, into words.
	
	String convert(final String time);
}
