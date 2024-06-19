package com.example.Personal_ChatBot.Controller;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("ai")

public class AiController {
 private OllamaChatModel ollamaChatModel;

 public AiController(OllamaChatModel ollamaChatModel) {
  this.ollamaChatModel = ollamaChatModel;
 }
@GetMapping("prompt")
 public Flux<String> promptResponse(
         @RequestParam("prompt") String prompt
){
Flux<String >Response=ollamaChatModel.stream(prompt);
return Response;
 }


}
