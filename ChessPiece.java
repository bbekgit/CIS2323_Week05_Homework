class ChessPiece{

int rank;

String suite;

public ChessPiece(int rank, String suite) {

this.rank = rank;

this.suite = suite;

}

@Override

public String toString() {

return rank+" "+suite;

}

}