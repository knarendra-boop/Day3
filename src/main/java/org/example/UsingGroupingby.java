package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsingGroupingby {
    public static void main(String[] args) {

//
//    List<String> list = Arrays.asList("suresh", "ramesh");
//    Map<Character,List<String>> result = list.stream()
//            .collect(Collectors.groupingBy(l->l.charAt(0)));
//    System.out.print(result);


    List<String> list1 = Arrays.asList("narendra", "naren", "sureesh");
    Map<String, List<String>> res  = list1.stream()
            .collect(Collectors.groupingBy( n -> n.substring(0, 1).toLowerCase()));
    System.out.print(res);

}}
