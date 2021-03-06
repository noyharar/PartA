package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

public class MazeState extends AState
{

    private int height;
    private Position positionState;

    public MazeState(Position positionState, Maze maze) {
        this.positionState = positionState;
        this.cost = 0D;
        this.state = positionState.toString();
        this.height = maze.getHeight();
    }




    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MazeState))
            return false;
        MazeState mzstate = (MazeState)obj;
        return this.positionState.equals(mzstate.positionState);
    }

    @Override
    public String toString() {
        return this.positionState.toString();
    }

    public Position getPosition()
    {
        return this.positionState;
    }

    @Override
    public int hashCode() {
        return positionState.getRowIndex() + positionState.getColumnIndex() * this.height;
    }
}
