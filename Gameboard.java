class Gameboard {
  
  private Space[][] Board;
  public bool PlayerHasWon;
  public bool CompHasWon;

  // Constructors
  public Gameboard()
  {
    Board = new Space[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        Board[i][j] = new Space(i, j);
      }
    }
    
    PlayerHasWon = false;
    CompHasWon = false;
  }

  // Getters & Setters
  public Space[][] getBoard() {
    return Board;
  }
  
  public void setBoard(char, int x, int y) {
    int NewValue; 
    if (char == 'P') {
      NewValue = 1;
    }
    else {
      NewValue = 2;
    }
    
    Board[x][y].Value = NewValue;
  }
    
