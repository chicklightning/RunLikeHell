/**
 * Created by Gabrielle Michaels on 12/3/2016.
 */
public class RunLikeHell {

    public static int maxGain(int [] blocks) {

        // array is empty or has no blocks, so the max gain is 0
        if (blocks == null || blocks.length == 0) {
            return 0;
        }
        // if there's only one block, just return that block's value
        if (blocks.length == 1) {
            return blocks[0];
        }

        /** I look at chunks of 4 blocks, because of the following example:
         *  [7] [8] [7] [1]
         *
         *  If you choose to jump from block 1 to block 5, you might as well
         *  stop at block 3 along the way just to add more
         *
         *  I look at combinations of blocks 1 and 3, 2 and 4, and 1 and 4 to see
         *  which has the largest sum, then add it to the total in that spot
        */

        int index = 0;
        int sum = 0;

        do {
            // take the max of the sums described above for sets of four blocks,
            // including the current block
            int sum1 =

        } while (index < blocks.length);

        return sum;
    }

    public static double difficultyRating() {
        return 3.5;
    }

    public static double hoursSpent() {
        return 7.0;
    }

}
