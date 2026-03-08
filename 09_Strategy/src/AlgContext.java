import Sorts.SortingAlg;

public class AlgContext
{
    private SortingAlg choosedAlg;

    public AlgContext(SortingAlg sortingAlg)
    {
        choosedAlg = sortingAlg;
    }

    public SortingAlg getSortingAlg()
    {
        return choosedAlg;
    }

    public void setChoosedAlg(SortingAlg sortingAlg)
    {
        choosedAlg = sortingAlg;
    }
}
