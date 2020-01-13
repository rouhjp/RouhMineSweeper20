package jp.rouh.minesweeper;

public interface MineSweeper{
    void setObserver(MineSweeperObserver observer);
    int getHeight();
    int getWidth();
    int getTotalMineCount();
    int getRemainingMineCount();
    int getTimeCount();
    boolean isFinished();
    boolean isSecured();
    boolean isExploded();
    void open(int x, int y);
    void stamp(int x, int y);
    void toggleFlag(int x, int y);
    MineCellView getView(int x, int y);
}