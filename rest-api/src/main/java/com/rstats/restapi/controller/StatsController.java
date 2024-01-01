package com.rstats.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rstats.restapi.model.Stats;
import com.rstats.restapi.service.StatsService;

@RestController
@RequestMapping("/api/stats")
public class StatsController {

    @Autowired
    private StatsService statsService;

    @GetMapping("/{id}")
    public ResponseEntity<Stats> getStatsById(@PathVariable("id") Long id) {
        Stats stats = statsService.getStatsById(id);
        if (stats != null) {
            return ResponseEntity.ok(stats);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Stats> createStats(@RequestBody Stats stats) {
        Stats createdStats = statsService.createStats(stats);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdStats);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Stats> updateStats(@PathVariable("id") Long id, @RequestBody Stats stats) {
        Stats updatedStats = statsService.updateStats(id, stats);
        if (updatedStats != null) {
            return ResponseEntity.ok(updatedStats);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStats(@PathVariable("id") Long id) {
        boolean deleted = statsService.deleteStats(id);
        if (deleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
