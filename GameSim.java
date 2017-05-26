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
    
    foreach (Space spot in Game_board.Board)
      if (spot.Value == 0) {
        ValidMoves.add(spot);
      }
  }
