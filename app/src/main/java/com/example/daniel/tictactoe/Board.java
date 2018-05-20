package com.example.daniel.tictactoe;

/**
 * Created by Daniel on 5/21/2017.
 */

public class Board {
    private String[][] board;

    public Board() {
        board = new String[3][3];
        ClearBoard();
    }

    public void ClearBoard() {
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "";
            }
        }
    }

    public String GetTopLeft() {
        return board[0][0];
    }

    public String GetTopMid() {
        return board[0][1];
    }

    public String GetTopRight() {
        return board[0][2];
    }

    public String GetMidLeft() {
        return board[1][0];
    }

    public String GetMidMid() {
        return board[1][1];
    }

    public String GetMidRight() {
        return board[1][2];
    }

    public String GetBottomLeft() {
        return board[2][0];
    }

    public String GetBottomMid() {
        return board[2][1];
    }

    public String GetBottomRight() {
        return board[2][2];
    }

    public void SetTopLeft(String mark) {
        board[0][0] = mark;
    }

    public void SetTopMid(String mark) {
        board[0][1] = mark;
    }

    public void SetTopRight(String mark) {
        board[0][2] = mark;
    }

    public void SetMidLeft(String mark) {
        board[1][0] = mark;
    }

    public void SetMidMid(String mark) {
        board[1][1] = mark;
    }

    public void SetMidRight(String mark) {
        board[1][2] = mark;
    }

    public void SetBottomLeft(String mark) {
        board[2][0] = mark;
    }

    public void SetBottomMid(String mark) {
        board[2][1] = mark;
    }

    public void SetBottomRight(String mark) {
        board[2][2] = mark;
    }

    private boolean DidTeamWin(String selectedTeam) {
        boolean didTeamWin = false;
        if (board[0][0] == selectedTeam && board[1][0] == selectedTeam && board[2][0] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[0][1] == selectedTeam && board[1][1] == selectedTeam && board[2][1] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[0][2] == selectedTeam && board[1][2] == selectedTeam && board[2][2] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[0][0] == selectedTeam && board[0][1] == selectedTeam && board[0][2] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[1][0] == selectedTeam && board[1][1] == selectedTeam && board[1][2] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[2][0] == selectedTeam && board[2][1] == selectedTeam && board[2][2] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[0][0] == selectedTeam && board[1][1] == selectedTeam && board[2][2] == selectedTeam) {
            didTeamWin = true;
        }
        else if (board[2][0] == selectedTeam && board[1][1] == selectedTeam && board[0][2] == selectedTeam) {
            didTeamWin = true;
        }
        return didTeamWin;
    }

    public boolean DidXWin() {
        return DidTeamWin("X");
    }

    public boolean DidOWin() {
        return DidTeamWin("O");
    }

    public boolean IsBoardFull() {
        boolean isBoardFull = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == "") {
                    isBoardFull = false;
                    break;
                }
            }
        }
        return isBoardFull;
    }

    public boolean IsDraw() {
        boolean isDraw = false;
        boolean areAllSpacesUsed = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == "") {
                    areAllSpacesUsed = false;
                    break;
                }
            }
        }
        if (areAllSpacesUsed && !DidOWin() && !DidXWin()) {
            isDraw = true;
        }
        return isDraw;
    }
}
