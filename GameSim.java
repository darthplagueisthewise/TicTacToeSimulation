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
    
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (Game_board.getBoard().Value == 0) {
          ValidMoves.add(spot);
      }
  }
