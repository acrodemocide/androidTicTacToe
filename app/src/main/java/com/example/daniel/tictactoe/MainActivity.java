package com.example.daniel.tictactoe;

import android.content.ClipData;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    private TicTacToe ticTacToe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ticTacToe = new TicTacToe();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        //inflater.inflate(R.menu.file_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        // Starts a new game - the user is x by default
        //  Once this menu item is selected, the current game is thrown out
        //  and a new one is started in which the user is set to x
        else if(id == R.id.switch_to_x) {
            ClearAllButtons();
            ticTacToe.ResetGameAsX();
            return true;
        }
        // Restarts the game in which the user is now o. Once this functionality is completed,
        //  we should have the game set in the initial state for the user to start playing.
        //  This means that all the spaces are cleared aside from the first move that the computer
        //  has made
        else if(id == R.id.switch_to_o) {
            ClearAllButtons();
            ticTacToe.ResetGameAsO();
            DisplayComputerMove();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Update the buttons with the move the computer made
    private void DisplayComputerMove() {
        Team playerTeam = ticTacToe.GetTeam();
        String computerChoice = playerTeam == Team.X ? "O" : "X";
        if (ticTacToe.GetBoard().GetTopLeft() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.top_left);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetTopMid() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.top_center);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetTopRight() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.top_right);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetMidLeft() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.left);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetMidMid() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.center);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetMidRight() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.right);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetBottomLeft() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.bottom_left);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetBottomMid() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.bottom_center);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
        if (ticTacToe.GetBoard().GetBottomRight() == computerChoice) {
            Button computerButton = (Button) findViewById(R.id.bottom_right);
            computerButton.setText(playerTeam == Team.X ? "O" : "X");
        }
    }

    // This function needs to be removed, and we want to replace it with a function
    //  that updates the view with the new information. When the user clicks a surface,
    //  we want ticTacToe to do all of the logic and update the board that describes
    //  the data that we need. When we get the filled in spaces back from ticTacToe,
    //  we use that information to fill in the squares with all the latest information
    private void toggleButton(Button b) {
        Team playerTeam = ticTacToe.GetTeam();
        b.setText(playerTeam == Team.X ? "X" : "O");
        if (b.getId() == R.id.top_left) {
            ticTacToe.PlayerMove(0, 0);
        }
        else if (b.getId() == R.id.top_center) {
            ticTacToe.PlayerMove(0, 1);
        }
        else if (b.getId() == R.id.top_right) {
            ticTacToe.PlayerMove(0, 2);
        }
        else if (b.getId() == R.id.left) {
            ticTacToe.PlayerMove(1, 0);
        }
        else if (b.getId() == R.id.center) {
            ticTacToe.PlayerMove(1, 1);
        }
        else if (b.getId() == R.id.right) {
            ticTacToe.PlayerMove(1, 2);
        }
        else if (b.getId() == R.id.bottom_left) {
            ticTacToe.PlayerMove(2, 0);
        }
        else if (b.getId() == R.id.bottom_center) {
            ticTacToe.PlayerMove(2, 1);
        }
        else if (b.getId() == R.id.bottom_right) {
            ticTacToe.PlayerMove(2, 2);
        }

        DisplayComputerMove();

        if (ticTacToe.DidXWin() || ticTacToe.DidOWin() || ticTacToe.IsDraw()) {
            DisplayGameResults();
        }
    }

    private void ClearAllButtons() {
        Button topLeftButton = (Button) findViewById(R.id.top_left);
        topLeftButton.setText("");
        Button topMiddleButton = (Button) findViewById(R.id.top_center);
        topMiddleButton.setText("");
        Button topRightButton = (Button) findViewById(R.id.top_right);
        topRightButton.setText("");
        Button leftButton = (Button) findViewById(R.id.left);
        leftButton.setText("");
        Button middleButton = (Button) findViewById(R.id.center);
        middleButton.setText("");
        Button rightButton = (Button) findViewById(R.id.right);
        rightButton.setText("");
        Button bottomLeftButton = (Button) findViewById(R.id.bottom_left);
        bottomLeftButton.setText("");
        Button bottomMiddleButton = (Button) findViewById(R.id.bottom_center);
        bottomMiddleButton.setText("");
        Button bottomRightButton = (Button) findViewById(R.id.bottom_right);
        bottomRightButton.setText("");
    }

    private void DisplayXInButtons() {
        Button topLeftButton = (Button) findViewById(R.id.top_left);
        topLeftButton.setText("*");
        Button topRightButton = (Button) findViewById(R.id.top_right);
        topRightButton.setText("*");
        Button middleButton = (Button) findViewById(R.id.center);
        middleButton.setText("*");
        Button bottomLeftButton = (Button) findViewById(R.id.bottom_left);
        bottomLeftButton.setText("*");
        Button bottomRightButton = (Button) findViewById(R.id.bottom_right);
        bottomRightButton.setText("*");
    }

    private void DisplayOInButtons() {
        Button topMiddleButton = (Button) findViewById(R.id.top_center);
        topMiddleButton.setText("*");
        Button leftButton = (Button) findViewById(R.id.left);
        leftButton.setText("*");
        Button rightButton = (Button) findViewById(R.id.right);
        rightButton.setText("*");
        Button bottomMiddleButton = (Button) findViewById(R.id.bottom_center);
        bottomMiddleButton.setText("*");
    }

    private void DisplayDrawSignalInButtons() {
        Button topLeftButton = (Button) findViewById(R.id.top_left);
        topLeftButton.setText("*");
        Button topMiddleButton = (Button) findViewById(R.id.top_center);
        topMiddleButton.setText("*");
        Button topRightButton = (Button) findViewById(R.id.top_right);
        topRightButton.setText("*");
        Button leftButton = (Button) findViewById(R.id.left);
        leftButton.setText("*");
        Button bottomLeftButton = (Button) findViewById(R.id.bottom_left);
        bottomLeftButton.setText("*");
        Button bottomMiddleButton = (Button) findViewById(R.id.bottom_center);
        bottomMiddleButton.setText("*");
        Button bottomRightButton = (Button) findViewById(R.id.bottom_right);
        bottomRightButton.setText("*");
    }

    private void DisplayGameResults() {
        ClearAllButtons();
        if (ticTacToe.DidXWin()) {
            DisplayXInButtons();
        }
        else if (ticTacToe.DidOWin()) {
            DisplayOInButtons();
        }
        else if (ticTacToe.IsDraw()) {
            DisplayDrawSignalInButtons();
        }
    }

    // These all should only be called after all initialization is done for the game
    //  If player is x (default):
    //      The initial state has all spaces empty
    //      The computer has not made a move
    //      The computer will make a move after the user has toggled a button
    //  If the player is o:
    //      The initial state will have the first move already done by the computer
    //      The user can select any button (except for the initial move the computer made)
    //      The computer will move immediately after the user selects the next open spot
    public void onTopLeftClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.top_left);
            toggleButton(b);
        }
    }

    public void onTopCenterClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.top_center);
            toggleButton(b);
        }
    }

    public void onTopRightClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.top_right);
            toggleButton(b);
        }
    }

    public void onLeftClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.left);
            toggleButton(b);
        }
    }

    public void onCenterClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.center);
            toggleButton(b);
        }
    }

    public void onRightClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.right);
            toggleButton(b);
        }
    }

    public void onBottomLeftClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.bottom_left);
            toggleButton(b);
        }
    }

    public void onBottomCenterClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.bottom_center);
            toggleButton(b);
        }
    }

    public void onBottomRightClick(View view) {
        if (!ticTacToe.DidXWin() && !ticTacToe.DidOWin() && !ticTacToe.IsDraw()) {
            Button b = (Button) findViewById(R.id.bottom_right);
            toggleButton(b);
        }
    }
}
