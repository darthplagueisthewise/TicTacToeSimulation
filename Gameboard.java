class Gameboard {
  
  private Space[][] Board;
  private bool PlayerHasWon;
  private bool CompHasWon;

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
