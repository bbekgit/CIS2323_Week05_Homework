import java.util.Scanner;

public class setupChessBoard {

ChessBoard board=new ChessBoard();

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

setupChessBoard chessBoard=new setupChessBoard();

for(int i=0; i<64;i++) {

System.out.println("Enter x position of chess piece: ");

int x=sc.nextInt();

System.out.println("Enter x position of chess piece: ");

int y=sc.nextInt();

System.out.println("Enter rank of chess piece: ");

int rank=sc.nextInt();

sc.nextLine();

System.out.println("Enter suite of chess piece: ");

String suite=sc.nextLine();

chessBoard.board.set(x, y, new ChessPiece(rank, suite));

}

for(int i=0; i<8; i++) {

for(int j=0; j<8; j++) {

System.out.println(chessBoard.board.get(i, j));

}

}

}

}