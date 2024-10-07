package com.user.whatsappmessagedynamic.controller;


import com.user.whatsappmessagedynamic.service.WhatsAppMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.logging.Logger;

@RestController
@RequestMapping("/whatsapp")
public class WhatsAppMessageController {

    private Logger logger = Logger.getLogger(WhatsAppMessageController.class.getName());
    @Autowired
    private WhatsAppMessageService whatsAppMessageService;

    @PostMapping("/send")
    public String sendWhatsAppMessage(@RequestBody Map<String, Object> requestBody) {
        return whatsAppMessageService.sendMessage(requestBody);
    }

//    @PostMapping("/web-callback")
//    public ResponseEntity<Void> deleteWhatsAppMessage(@RequestBody(required = false) Map<String, Object> requestBody) {
//        logger.info("hook called");
//        logger.info("pay load", payload);
//        return ResponseEntity<>(null, HttpStatus.OK);
//
//
//    }
}
