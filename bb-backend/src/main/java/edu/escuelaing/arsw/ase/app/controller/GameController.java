package edu.escuelaing.arsw.ase.app.controller;

import edu.escuelaing.arsw.ase.app.status.GameStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    // Endpoint para obtener el estado del juego
    @GetMapping("/status")
    public GameStatus getGameStatus() {
        // Retorna el estado actual del juego
        return new GameStatus();
    }

    // Endpoint para actualizar el estado del juego
    @PostMapping("/update")
    public void updateGameStatus(@RequestBody GameStatus status) {
        // Actualiza el estado del juego basado en la información recibida
    }
}


