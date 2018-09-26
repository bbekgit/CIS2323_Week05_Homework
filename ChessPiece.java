package Piece;

class ChessPiece
{
private int row,col;
private String colorChessPiece, nameChesspiece;

public int getPositionRow()          //getting position of row
{
  return row;
}
public int getPositionColumn()      //getting position of column
{
  return col;
}
public String getColor()           //getting color of a chess piece
{
  return colorChessPiece;
}
public String getPieceType()       //getting name of a chess piece
{
  return nameChesspiece;
}
public void setPosition(int x, int y)    //setting position of a chess piece
{
  row = x;
  col = y;
}
public void setColor(String color)       //setting color of a chess piece
{
  colorChessPiece = color;
}
public void setPieceType(String name)     //setting name of a chess piece
{
  nameChesspiece = name;
}
public void printInfo()                  //printing all the details of a chess piece
{
  System.out.println("Chess Piece Details-");
  System.out.println("---------------------");
  System.out.println("Position: " + getPositionRow() + "," + getPositionColumn());
  System.out.println("Color: " + getColor());
  System.out.println("Name: " + getPieceType() + "\n");
}
}