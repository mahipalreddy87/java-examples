package com.StremAPI.interview;

public class RemoveDuplicateCharactesInString {
    public static void main(String[] args) {
        String str = "mahipal reddy";
        // Map<Character,Long> map =Arrays.asList(str).stream().flatMap(c->c.chars().mapToObj(cc->(char)cc)).collect(Collectors.groupingBy(i->i,Collectors.counting()));
        // System.out.println(map.entrySet());
        //remove duplicate
        String str1= str.chars().distinct().collect(
                StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append
        ).toString();

        System.out.println(str1);
    }
}
