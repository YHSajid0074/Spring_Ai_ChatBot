//package com.example.Personal_ChatBot;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.http.*;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//public class HuggingFaceService {
//
//
//    private final RestTemplate restTemplate;
//
//    @Value("${huggingface.api.url}")
//    private String apiUrl;
//
//    @Value("${huggingface.api.key}")
//    private String apiKey;
//
//    public HuggingFaceService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//
//    public String getChatbotResponse(String message) {
//        String url = apiUrl + "/models/microsoft/DialoGPT-medium";  // Make sure this is the correct model endpoint.
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Authorization", "Bearer " + apiKey);
//        headers.setContentType(MediaType.APPLICATION_JSON);  // Set the Content-Type to application/json
//
//        // Ensure the request body is properly formatted as JSON
//        String requestPayload = "{\n" +
//                "\"inputs\": \"" + message + "\"\n" +
//                "}";
//
//        HttpEntity<String> entity = new HttpEntity<>(requestPayload, headers);
//
//        try {
//            // Send the request to Hugging Face API
//            ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);
//            return response.getBody();
//        } catch (Exception e) {
//            return "Error calling Hugging Face API: " + e.getMessage();
//        }
//    }
//}

