package jp.rouh.minesweeper;

public enum BasicDifficulty implements Difficulty{
    BEGINNER(9, 9, 10),
    INTERMEDIATE(16, 16, 30),
    ADVANCED(30, 16, 99);
    private final int width;
    private final int height;
    private final int totalMineCount;
    BasicDifficulty(int width, int height, int totalMineCount){
        this.width = width;
        this.height = height;
        this.totalMineCount = totalMineCount;
    }
    @Override
    public int getWidth(){
        return width;
    }
    @Override
    public int getHeight(){
        return height;
    }
    @Override
    public int getTotalMineCount(){
        return totalMineCount;
    }
    @Override
    public String getName(){
        return toString();
    }

}
