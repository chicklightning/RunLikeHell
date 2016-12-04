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

        /** I look at chunks of 3 blocks, because of the following example:
         *  [7] [8] [7] [1]
         *
         *  You can choose between 2 beginning paths - start at 7 or 8.
         *  This then updates to the following afterward based on which number
         *  results in the largest path based on previous numbers:
         *
         *  [7] [8] [14] [9]
         *
         *  Where you aren't allowed to take the sum of the number directly
         *  before it, but you can take the sum of the number 2 before it or the number
         *  3 before it.
        */

        blocks[2] += blocks[0];
        int max = Math.max(blocks[2], blocks[1]); // keeps track of max value

        // start at fourth block, index 3
        for (int index = 3; index < blocks.length; index++) {

            // take the max of the sums described above for sets of three blocks,
            // including the current block
            blocks[index] += Math.max(blocks[index - 3], blocks[index - 2]);
            if (blocks[index] > max)
                max = blocks[index];
        }

        return max;
    }

    public static double difficultyRating() {
        return 3.5;
    }

    public static double hoursSpent() {
        return 7.0;
    }

}
