package CoreMod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    private List<Integer> intList;

    public StreamMain(List<Integer> intList){
        this.intList = new ArrayList<>(intList);
    }

    public void main(){
        Stream<Integer> myStream = intList.stream();
        List<Integer> myNewList = myStream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        myNewList.forEach(System.out::println);
    }
}
