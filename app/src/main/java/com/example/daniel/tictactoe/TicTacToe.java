package com.example.daniel.tictactoe;

import java.util.Random;

/**
 * Created by Daniel on 5/16/2017.
 */
public class TicTacToe {
    private Board gameBoard;
    private Team team;

    public TicTacToe() {
        team = Team.X;
        gameBoard = new Board();
    }

    // Basic algorithm for computer player (choose open random spot to move to)
    private void ComputerMove() {
        Random rand = new Random();
        int numBoardSquares = 9;
        boolean isOpenSpotSelected = false;
        while (!isOpenSpotSelected && !gameBoard.IsBoardFull()) {
            int computerChoice = rand.nextInt(numBoardSquares) + 1;
            if (computerChoice == 1 && gameBoard.GetTopLeft().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetTopLeft(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 2 && gameBoard.GetTopMid().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetTopMid(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 3 && gameBoard.GetTopRight().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetTopRight(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 4 && gameBoard.GetMidLeft().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetMidLeft(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 5 && gameBoard.GetMidMid().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetMidMid(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 6 && gameBoard.GetMidRight().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetMidRight(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 7 && gameBoard.GetBottomLeft().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetBottomLeft(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 8 && gameBoard.GetBottomMid().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetBottomMid(team == Team.X ? "O": "X");
            }
            else if (computerChoice == 9 && gameBoard.GetBottomRight().equals("")) {
                isOpenSpotSelected = true;
                gameBoard.SetBottomRight(team == Team.X ? "O": "X");
            }
        }
    }

    public void ResetGameAsX() {
        team = Team.X;
        gameBoard.ClearBoard();
    }

    public void ResetGameAsO() {
        team = Team.O;
        gameBoard.ClearBoard();
        ComputerMove();
    }

    public Team GetTeam() { return team; }

    public boolean DidXWin() {
        return gameBoard.DidXWin();
    }

    public boolean DidOWin() {
        return gameBoard.DidOWin();
    }

    public boolean IsDraw() {
        return gameBoard.IsDraw();
    }

    public Board GetBoard() { return gameBoard; }

    public void PlayerMove(int row, int col) {
        if (row == 0) {
            if (col == 0) {
                gameBoard.SetTopLeft(team == Team.X ? "X": "O");
            }
            else if (col == 1) {
                gameBoard.SetTopMid(team == Team.X ? "X": "O");
            }
            else if (col == 2) {
                gameBoard.SetTopRight(team == Team.X ? "X": "O");
            }
        }
        else if (row == 1) {
            if (col == 0) {
                gameBoard.SetMidLeft(team == Team.X ? "X": "O");
            }
            else if (col == 1) {
                gameBoard.SetMidMid(team == Team.X ? "X": "O");
            }
            else if (col == 2) {
                gameBoard.SetMidRight(team == Team.X ? "X": "O");
            }
        }
        else if (row == 2) {
            if (col == 0) {
                gameBoard.SetBottomLeft(team == Team.X ? "X": "O");
            }
            else if (col == 1) {
                gameBoard.SetBottomMid(team == Team.X ? "X": "O");
            }
            else if (col == 2) {
                gameBoard.SetBottomRight(team == Team.X ? "X": "O");
            }
        }
        ComputerMove();
    }
}
