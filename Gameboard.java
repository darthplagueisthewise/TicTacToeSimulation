class Gameboard {
  
  private Space[][] Board;
  public boolean PlayerHasWon;
  public boolean CompHasWon;

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
   
  private static Boolean checkFarRight(int y){
    if (Board[0][y] == 2 && Board[1][y] == 2)
      return True;
  }
  
  private Boolean canWin(Space) {
    int x = Space.x_pos;
    int y = Space.y_pos;
    
    if (x == 2) {
      if (checkFarRight(y))
        return True;
      else if (
    }
  public Space bestMove(List<Space> someList) {
    for (Space spaces : someList) {
      
  
  
  
  
  
  
  
  
