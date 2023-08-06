package com.canvas.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.canvas.constant.CanvasConstant;

@Component
public class WebClientComponent {
	
	Logger logger = LoggerFactory.getLogger(WebClientComponent.class);
	public String getApiResponse(String objectName) throws Exception{
		String response = "";
		WebClient webClient = WebClient.builder().build();
		response = webClient.get().uri(CanvasConstant.url + objectName).header(CanvasConstant.authorization, CanvasConstant.token).retrieve().bodyToMono(String.class).block();
		System.out.println(response);
		return response;
	}
}
