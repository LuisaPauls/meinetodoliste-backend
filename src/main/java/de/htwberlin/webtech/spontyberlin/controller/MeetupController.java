package de.htwberlin.webtech.spontyberlin.controller;

import de.htwberlin.webtech.spontyberlin.model.Meetup;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MeetupController {

    @GetMapping("/meetup")
    public ResponseEntity<Meetup> getMeetup() {

        Meetup meetup = new Meetup("Coffee Meetup", "Alexanderplatz", "Coffee", "15.10.2026", "15:00", 5);

        return ResponseEntity.ok(meetup);
    }
}
