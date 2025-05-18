package com.simdev.message_service.controllers;

import com.simdev.sharedlib.dto.MessageDto;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * Contrôleur REST pour la gestion des messages entrants.
 */
@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @PostMapping
    public ResponseEntity<?> receiveMessage(@RequestBody MessageDto dto) {
        if (dto.getName() == null || dto.getDetails() == null) {
            return ResponseEntity.badRequest().body("Le nom et les détails sont requis.");
        }

        var response = new MessageDto(dto.getName(),dto.getDetails()
        );

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
