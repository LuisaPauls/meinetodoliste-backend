package de.htwberlin.webtech.spontyberlin.controller;

import de.htwberlin.webtech.spontyberlin.model.Meetup;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class MeetupController {

    @GetMapping("/meetup")
    public Meetup getMeetup() {

        return new Meetup("Coffee Meetup", "Alexanderplatz", "Coffee", "15.10.2026", "15:00", 5);
    }
}
