package dataStructuresAndAlgorithim.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LearnSet {
    //set is an interface which extends collection it is an order collection
    // of objects in which duplicate value can be
    //set is implemented by Hashset, LinkedHashSet, useTreeSet
// A set is a set of value which values is not allowed  duplicate element. its a prent interface of all set of all classes like TreeSet, HashSet
    //HashSet is a set where element are not sorted or ordered it is faster than a TreeSet.

    // a set is a set of values which not allowed duplicate elements
    // a HashSet is a set where elements are not sorted or ordered .it is faster than TreeSet
    // a Set is a parents Interface for all set Classes like TreeSet, HashSet
    public static void main(String[] args) {

        Set<String>name=new HashSet<>() ;
        name.add("Ba");
        name.add("Ali");
        name.add("Ali");
        name.add("Souad");
        name.add("Rachida");
        System.out.println(name.remove("Rachida"));
        System.out.println(name);

        System.out.print(name);




        }

}
