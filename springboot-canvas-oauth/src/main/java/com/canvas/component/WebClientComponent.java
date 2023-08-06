package com.canvas.component;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.canvas.constant.CanvasConstant;

@Component
public class WebClientComponent {
	
	public  String getApiResponse(String objectName) {
		String response = "";
		try {
			WebClient webClient = WebClient.builder().build();
			response = webClient.get().uri(CanvasConstant.url + objectName).header(CanvasConstant.authorization, CanvasConstant.token).retrieve().bodyToMono(String.class).block();
			System.out.println(response);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return response;
	}

}
