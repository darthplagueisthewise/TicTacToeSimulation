class GameSim 
{
  private Gameboard Game_board;
  
  public GameSim()
  {
    this.Game_board = new Gameboard();
  }
  
  public GameSim(Gameboard g_param)
  {
    this.Game_board = g_param;
  }
  
  public void TakeMove()
  {
    List<Space> ValidMoves = new List<Space>;
    
    // Get Valid (empty) spaces on Board
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (Game_board.getBoard()[i][j].Value == 0) {
          ValidMoves.add(spot);
      }
    }
      
    if (ValidMoves.length == 0)
      System.out.println("It\'s a tie");
    else
      Space nextMove = bestMove(ValidMoves);
      
