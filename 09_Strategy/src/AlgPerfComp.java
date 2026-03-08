import Sorts.HeapSort;
import Sorts.QuickSort;
import Sorts.SelectionSort;

import java.util.*;

public class AlgPerfComp
{
    int[] smallDataSet;
    int[] largeDataSet;

    private int[] createDataSet(int size)
    {
        List<Integer> start = new ArrayList<>();
        int[] returned = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++)
        {
            start.add(i);
        }
        for (int i = 0; i < size; i++) {
            int v = rand.nextInt(size - i);
            returned[i] = start.remove(v);
        }
        return returned;
    }



    void main()
    {
        Scanner input = new Scanner(System.in);
        String inStr;

        smallDataSet = createDataSet(30);
        largeDataSet = createDataSet(100_000);

        AlgContext context = new AlgContext(new SelectionSort());

        long startTime;
        long endTime;

        int[] dataSet;

        while (true)
        {
            // ASK SWAP DATASET
            do
            {
                System.out.print("Swap dataset ? Y/N\n> ");
                inStr = input.nextLine();
            } while (!inStr.equals("Y") && !inStr.equals("N"));
            if (inStr.equals("Y"))
            {
                smallDataSet = createDataSet(30);
                largeDataSet = createDataSet(100_000);
            }

            // ASK USED DATASET
            do
            {
                System.out.print("[S]mall or [L]arge dataset ?\n> ");
                inStr = input.nextLine();
            } while (!inStr.equals("S") && !inStr.equals("L"));

            if(inStr.equals("S"))
            {
                dataSet = smallDataSet.clone();
            }
            else
            {
                dataSet = largeDataSet.clone();
            }

            // ASK SORTING ALGORITHM
            do
            {
                System.out.print("[H]eap sort, [Q]uick sort, [S]election sort ?\n> ");
                inStr = input.nextLine();
            } while (!inStr.equals("H") && !inStr.equals("Q") && !inStr.equals("S"));
            if(inStr.equals("H")) context.setChoosedAlg(new HeapSort());
            if(inStr.equals("Q")) context.setChoosedAlg(new QuickSort());
            if(inStr.equals("S")) context.setChoosedAlg(new SelectionSort());

            startTime = System.nanoTime();

            context.getSortingAlg().sort(dataSet);

            endTime = System.nanoTime();

            System.out.println("Time performance on chosen dataset :\n" + (endTime - startTime) + "ns");

            // ASK EXIT
            do
            {
                System.out.print("Exit ? Y/N\n> ");
                inStr = input.nextLine();
            } while (!inStr.equals("Y") && !inStr.equals("N"));
            if(inStr.equals("Y")) System.exit(0);
        }





    }
}
