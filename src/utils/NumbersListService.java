package utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NumbersListService {

    private List<Integer> inputNumbersList;

    public NumbersListService(List<Integer> inputNumbersList){

        this.inputNumbersList = inputNumbersList;
    }

    //sort list to natural order
    public List<Integer> SortListAscending(ArrayList<Integer> inputNumbersList) {
        return inputNumbersList.stream()
                .sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());
    }
    //find minimum
    public Optional<Integer> findMinimumNumber(ArrayList<Integer> inputNumbersList) {
        return inputNumbersList.stream()
                .min(Comparator.comparing(Integer::valueOf));
    }

}
