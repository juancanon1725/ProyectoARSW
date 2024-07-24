package edu.escuelaing.arsw.ase.app.status;

public class GameStatus {
    private int score;
    private boolean gameOver;

    // Constructor sin parámetros
    public GameStatus() {}

    // Constructor con parámetros
    public GameStatus(int score, boolean gameOver) {
        this.score = score;
        this.gameOver = gameOver;
    }

    // Getters y setters
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    // Método toString para fácil visualización
    @Override
    public String toString() {
        return "GameStatus{" +
                "score=" + score +
                ", gameOver=" + gameOver +
                '}';
    }
}

