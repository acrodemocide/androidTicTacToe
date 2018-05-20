package com.example.daniel.tictactoe.unittest;

/**
 * Created by Daniel on 5/21/2017.
 */

import com.example.daniel.tictactoe.Board;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BoardTester {

    @Test
    public void GetDefaultTopLeftTest() {
        Board board = new Board();
        assertTrue(board.GetTopLeft() == "");
    }

    @Test
    public void SetTopLeftXTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        assertTrue(board.GetTopLeft() == "X");
    }

    @Test
    public void SetTopLeftOTest() {
        Board board = new Board();
        board.SetTopLeft("O");
        assertTrue(board.GetTopLeft() == "O");
    }

    @Test
    public void GetDefaultTopMidTest() {
        Board board = new Board();
        assertTrue(board.GetTopMid() == "");
    }

    @Test
    public void SetTopMidXTest() {
        Board board = new Board();
        board.SetTopMid("X");
        assertTrue(board.GetTopMid() == "X");
    }

    @Test
    public void SetTopMidOTest() {
        Board board = new Board();
        board.SetTopMid("O");
        assertTrue(board.GetTopMid() == "O");
    }

    @Test
    public void GetDefaultTopRightTest() {
        Board board = new Board();
        assertTrue(board.GetTopRight() == "");
    }

    @Test
    public void SetTopRightXTest() {
        Board board = new Board();
        board.SetTopRight("X");
        assertTrue(board.GetTopRight() == "X");
    }

    @Test
    public void SetTopRightOTest() {
        Board board = new Board();
        board.SetTopRight("O");
        assertTrue(board.GetTopRight() == "O");
    }

    @Test
    public void GetDefaultMidLeftTest() {
        Board board = new Board();
        assertTrue(board.GetMidLeft() == "");
    }

    @Test
    public void SetMidLeftXTest() {
        Board board = new Board();
        board.SetMidLeft("X");
        assertTrue(board.GetMidLeft() == "X");
    }

    @Test
    public void SetMidLeftOTest() {
        Board board = new Board();
        board.SetMidLeft("O");
        assertTrue(board.GetMidLeft() == "O");
    }

    @Test
    public void GetDefaultMidMidTest() {
        Board board = new Board();
        assertTrue(board.GetMidMid() == "");
    }

    @Test
    public void SetMidMidXTest() {
        Board board = new Board();
        board.SetMidMid("X");
        assertTrue(board.GetMidMid() == "X");
    }

    @Test
    public void SetMidMidOTest() {
        Board board = new Board();
        board.SetMidMid("O");
        assertTrue(board.GetMidMid() == "O");
    }

    @Test
    public void GetDefaultMidRightTest() {
        Board board = new Board();
        assertTrue(board.GetMidRight() == "");
    }

    @Test
    public void SetMidRightXTest() {
        Board board = new Board();
        board.SetMidRight("X");
        assertTrue(board.GetMidRight() == "X");
    }

    @Test
    public void SetMidRightOTest() {
        Board board = new Board();
        board.SetMidRight("O");
        assertTrue(board.GetMidRight() == "O");
    }

    @Test
    public void GetDefaultBottomLeftTest() {
        Board board = new Board();
        assertTrue(board.GetBottomLeft() == "");
    }

    @Test
    public void SetBottomLeftXTest() {
        Board board = new Board();
        board.SetBottomLeft("X");
        assertTrue(board.GetBottomLeft() == "X");
    }

    @Test
    public void SetBottomLeftOTest() {
        Board board = new Board();
        board.SetBottomLeft("X");
        assertTrue(board.GetBottomLeft() == "X");
    }

    @Test
    public void GetDefaultBottomMidTest() {
        Board board = new Board();
        assertTrue(board.GetBottomMid() == "");
    }

    @Test
    public void SetBottomMidXTest() {
        Board board = new Board();
        board.SetBottomMid("X");
        assertTrue(board.GetBottomMid() == "X");
    }

    @Test
    public void SetBottomMidOTest() {
        Board board = new Board();
        board.SetBottomMid("O");
        assertTrue(board.GetBottomMid() == "O");
    }

    @Test
    public void GetDefaultBottomRightTest() {
        Board board = new Board();
        assertTrue(board.GetBottomRight() == "");
    }

    @Test
    public void SetBottomRightXTest() {
        Board board = new Board();
        board.SetBottomRight("X");
        assertTrue(board.GetBottomRight() == "X");
    }

    @Test
    public void SetBottomRightOTest() {
        Board board = new Board();
        board.SetBottomRight("O");
        assertTrue(board.GetBottomRight() == "O");
    }

    @Test
    public void CheckXWinFirstColumnTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetMidLeft("X");
        board.SetBottomLeft("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinSecondColumnTest() {
        Board board = new Board();
        board.SetTopMid("X");
        board.SetMidMid("X");
        board.SetBottomMid("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinThirdColumnTest() {
        Board board = new Board();
        board.SetTopRight("X");
        board.SetMidRight("X");
        board.SetBottomRight("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinFirstRowTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetTopMid("X");
        board.SetTopRight("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinSecondRowTest() {
        Board board = new Board();
        board.SetMidLeft("X");
        board.SetMidMid("X");
        board.SetMidRight("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinThirdRowTest() {
        Board board = new Board();
        board.SetBottomLeft("X");
        board.SetBottomMid("X");
        board.SetBottomRight("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinDiagTopLeftToBottomRightTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetMidMid("X");
        board.SetBottomRight("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckXWinDiagBottomLeftToTopRightTest() {
        Board board = new Board();
        board.SetBottomLeft("X");
        board.SetMidMid("X");
        board.SetTopRight("X");
        assertTrue(board.DidXWin());
    }

    @Test
    public void CheckOWinFirstColumnTest() {
        Board board = new Board();
        board.SetTopLeft("O");
        board.SetMidLeft("O");
        board.SetBottomLeft("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinSecondColumnTest() {
        Board board = new Board();
        board.SetTopMid("O");
        board.SetMidMid("O");
        board.SetBottomMid("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinThirdColumnTest() {
        Board board = new Board();
        board.SetTopRight("O");
        board.SetMidRight("O");
        board.SetBottomRight("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinFirstRowTest() {
        Board board = new Board();
        board.SetTopLeft("O");
        board.SetTopMid("O");
        board.SetTopRight("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinSecondRowTest() {
        Board board = new Board();
        board.SetMidLeft("O");
        board.SetMidMid("O");
        board.SetMidRight("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinThirdRowTest() {
        Board board = new Board();
        board.SetBottomLeft("O");
        board.SetBottomMid("O");
        board.SetBottomRight("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinDiagTopLeftToBottomRightTest() {
        Board board = new Board();
        board.SetTopLeft("O");
        board.SetMidMid("O");
        board.SetBottomRight("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckOWinDiagBottomLeftToTopRightTest() {
        Board board = new Board();
        board.SetBottomLeft("O");
        board.SetMidMid("O");
        board.SetTopRight("O");
        assertTrue(board.DidOWin());
    }

    @Test
    public void CheckDrawConditionTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetTopMid("X");
        board.SetTopRight("O");
        board.SetMidLeft("O");
        board.SetMidMid("O");
        board.SetMidRight("X");
        board.SetBottomLeft("X");
        board.SetBottomMid("X");
        board.SetBottomRight("O");
        assertTrue(board.IsDraw());
    }

    @Test
    public void DrawDoesNotOccurIfEmptySpaceOnBoardTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetTopMid("X");
        board.SetTopRight("O");
        board.SetMidLeft("O");
        board.SetMidMid("O");
        board.SetMidRight("");
        board.SetBottomLeft("X");
        board.SetBottomMid("X");
        board.SetBottomRight("O");
        assertTrue(!board.IsDraw());
    }

    @Test
    public void IsBoardFullReturnsTrueIfBoardIsFullTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetTopMid("X");
        board.SetTopRight("O");
        board.SetMidLeft("O");
        board.SetMidMid("O");
        board.SetMidRight("X");
        board.SetBottomLeft("X");
        board.SetBottomMid("X");
        board.SetBottomRight("O");
        assertTrue(board.IsBoardFull() == true);
    }

    @Test
    public void IsBoardFullReturnsFalseIfBoardIsNotFullTest() {
        Board board = new Board();
        board.SetTopLeft("X");
        board.SetTopMid("X");
        board.SetTopRight("O");
        board.SetMidLeft("O");
        board.SetMidMid("O");
        board.SetMidRight("");
        board.SetBottomLeft("X");
        board.SetBottomMid("X");
        assertTrue(board.IsBoardFull() == false);
    }
}
