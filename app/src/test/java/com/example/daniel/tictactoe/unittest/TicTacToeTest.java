package com.example.daniel.tictactoe.unittest;

/**
 * Created by Daniel on 5/21/2017.
 */
import com.example.daniel.tictactoe.TicTacToe;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TicTacToeTest {

    private int GetCount(TicTacToe ticTacToe, String val) {
        int count = 0;
        if (ticTacToe.GetBoard().GetTopLeft() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetTopMid() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetTopRight() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetMidLeft() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetMidMid() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetMidRight() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetBottomLeft() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetBottomMid() == val) {
            count++;
        }
        if (ticTacToe.GetBoard().GetBottomRight() == val) {
            count++;
        }
        return count;
    }

    private int GetXCount(TicTacToe ticTacToe) {
        return GetCount(ticTacToe, "X");
    }

    private int GetOCount(TicTacToe ticTacToe) {
        return GetCount(ticTacToe, "O");
    }

    @Test
    public void ComputerMovesToEmptySpotAfterPlayerMovesTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.PlayerMove(0,0);
        int xCount = GetXCount(ticTacToe);
        int oCount = GetOCount(ticTacToe);
        assertTrue(xCount == 1);
        assertTrue(oCount == 1);
    }

    @Test
    public void ComputerMovesToEmptySpotAfterPlayerMovesTwoTimesTest() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.PlayerMove(0,0);
        if (ticTacToe.GetBoard().GetMidMid() == "") {
            ticTacToe.PlayerMove(1,1);
        }
        else {
            ticTacToe.PlayerMove(2, 2);
        }
        int xCount = GetXCount(ticTacToe);
        int oCount = GetOCount(ticTacToe);
        assertTrue(xCount == 2);
        assertTrue(oCount == 2);
    }
}
