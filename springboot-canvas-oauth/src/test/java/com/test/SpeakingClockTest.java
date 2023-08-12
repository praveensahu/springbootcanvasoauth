package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

import com.speakingclock.service.SpeakingClockService;
@SpringBootConfiguration
@SpringBootTest
public class SpeakingClockTest {

	@Autowired
	private SpeakingClockService speakingClockService;

	@Test
	public void testSpeakingClockToWords() throws Exception {
		String output = speakingClockService.convertTimeToWords("11:25");
		Assertions.assertEquals("output", output);
	}

}
