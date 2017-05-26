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
   
  private static Boolean checkFarLeftUpper(int){
    
    if (Board[1][0] == int && Board[2][0] == int) 
      return True;   
    else if (Board[1][1] == int && Board[2][2] == int) 
      return True;   
    else if (Board[0][1] == int && Board[0][2] == int)  
      return True; 
    else  
      return False;
  }
  
   private static Boolean checkFarLeftMiddle(int){
      
     if (Board[0][0] == int && Board[0][2] == int)
       return True;    
     else if (Board[1][1] == int && Board[2][1] == int) 
       return True;   
     else     
       return False;
   }
  
  private static Boolean checkFarLeftLower(int){ 
    
    if (Board[0][1] == int && Board[0][0] == int)   
      return True;   
    else if (Board[1][1] == int && Board[2][0] == int)   
      return True;   
    else if (Board[1][2] == int && Board[2][2] == int) 
      return True;  
    else    
      return False; 
  }
  
  private static Boolean checkMiddleUpper(int) {
     if (Board[0][0] == int && Board[2][0] == int)
       return True;      
    else if (Board[1][1] == int && Board[1][2] == int)  
      return True;      
    else          
      return False; 
  }
  
  private static Boolean checkMiddleMiddle(int) {
    if (Board[0][0] == int && Board[2][2] == int) 
      return True;       
    else if (Board[1][0] == int && Board[1][2] == int)
      return True; 
    else if (Board[2][0] == int && Board[0][2] == int) 
      return True;    
    else if (Board[0][1] == int && Board[2][1] == int)
      return True; 
    else               
      return False;
  }
  
  private static Boolean checkMiddleLower(int) { 
    if (Board[0][2] == int && Board[2][2] == int)
      return True;      
    else if (Board[1][1] == int && Board[1][0] == int)  
      return True;      
    else              
      return False;  
  }
  
  private static Boolean checkFarRightUpper(int){
    if (Board[1][0] == int && Board[0][0] == int)
      return True;
    else if (Board[1][1] == int && Board[0][2] == int)
      return True;
    else if (Board[2][1] == int && Board[2][2] == int)
      return True;
    else
      return False;
  }
  
  private static Boolean checkFarRightMiddle(int){
    if (Board[2][0] == int && Board[2][2] == int)
      return True; 
    else if (Board[1][1] == int && Board[0][1] == int)  
      return True;    
    else  
      return False;
  }
  
  private static Boolean checkFarRightLower(int){
    if (Board[0][2] == int && Board[1][2] == int)  
      return True;   
    else if (Board[1][1] == int && Board[0][0] == int)  
        return True;    
    else if (Board[2][1] == int && Board[2][0] == int) 
      return True;   
    else     
      return False; 
  }
  
  private Boolean goodMove(Space,int) {
    int x = Space.x_pos;
    int y = Space.y_pos;
    
    if (x == 0 && y == 0) {
      return checkFarLeftUpper(int));
    }
    else if(x == 0 && y == 1) {
      return checkFarLeftMiddle(int));
    }
    else if(x == 0 && y == 2) {
      return checkFarLeftLower(int));
    }
    else if(x == 1 && y == 0) {
      return checkMiddleUpper(int));
    }
    else if(x == 1 && y == 1) {
      return checkMiddleMiddle(int));
    }
    else if(x == 1 && y == 2) {
      return checkMiddleLower(int));
    }
    else if (x == 2 && y == 0) {
      return checkFarRightUpper(int));
    }
    else if (x == 2 && y == 1) {
      return checkFarRightMiddle(int));
    }
    else if (x == 2 && y == 2) {
      return checkFarRightLower(int));
    }
  }
  
  public Space bestMove(List<Space> someList) {
    // Check if there are any empty spaces where cpu can win 
    for (Space spaces : someList) {
      if (goodMove(spaces,2))
        return spaces;
    }
    
    // CPU can't win so CPU checks if it needs to block player
    // Check if there are any empty spaces where cpu can stop player from winning
    for (Space spaces : someList) {
      if (goodMove(spaces,1))
        return spaces;
    }
  
  
  
  
  
  
  
  
