import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
		int[] aliceSeq = {1, 3, 5};
		int[] bobSeq = {2, 4, 6};
        DancingBug alice = new DancingBug(aliceSeq);
        alice.setColor(Color.ORANGE);
        DancingBug bob = new DancingBug(bobSeq);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}