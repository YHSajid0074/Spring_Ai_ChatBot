package com.example.Personal_ChatBot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/huggingface")
public class HuggingFaceController {

    @Autowired
    private HuggingFaceService huggingFaceService;

    @PostMapping("/ask")
    public String askQuestion(@RequestParam String message) {
        return huggingFaceService.getChatbotResponse(message);
    }
}

