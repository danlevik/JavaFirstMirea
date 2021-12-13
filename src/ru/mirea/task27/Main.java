package ru.mirea.task27;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> journal = new HashMap<>();

        journal.put("Levitsky","Daniil");
        journal.put("aaa1","bbb1");
        journal.put("aaa2","bbb2");
        journal.put("aaa3","bbb2");
        journal.put("aaa4","bbb4");
        journal.put("aaa5","bbb5");
        journal.put("aaa6","bbb6");
        journal.put("aaa7","bbb7");
        journal.put("aaa8","bbb5");
        journal.put("aaa9","bbb9");

        HashMap<String, String> jcopy = (HashMap<String, String>) journal.clone();

        for (Map.Entry<String, String> i : jcopy.entrySet()) {
            for (Map.Entry<String, String> j : jcopy.entrySet()) {
                if (i.getValue().equals(j.getValue()) && !(i.getKey().equals(j.getKey()))){
                    journal.remove(j.getKey());
                }
            }
        }

        System.out.println(journal);

    }
}
