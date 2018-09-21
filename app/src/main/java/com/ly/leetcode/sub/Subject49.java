package com.ly.leetcode.sub;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 字母异位词分组
 * <p>
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 示例:
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * 输出:
 * [
 * ["ate","eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 * 说明：
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */
public class Subject49 implements Subjcet {
    private static final String TAG = "Subject49";
    @Override
    public void run() {
        List<List<String>> n = groupAnagrams(new String[]{"chi", "nip", "lab", "mud", "fan", "yak", "kid", "lox", "joy", "rob", "cad", "hug", "ken", "oaf", "pus", "hos", "ton", "any", "sac", "mid", "nip", "ron", "tux", "set", "jug", "axe", "ago", "sob", "ode", "dot", "nit", "pug", "sue", "new", "rub", "sup", "ohs", "ski", "oaf", "don", "cob", "kin", "ark", "gay", "jay", "bur", "dot", "eat", "rca", "wad", "maj", "luz", "gad", "dam", "eon", "ark", "del", "sin", "tat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList();

        Map<String,List<String>> map =new HashMap();
        for(String s :strs){
            char [] c = s.toCharArray();
            Arrays.sort(c);
            String ns =String.valueOf(c);
            if(map.containsKey(ns)){
                map.get(ns).add(s);
            }else {
                List<String> l =new ArrayList<>();
                l.add(s);
                map.put(ns,l);
            }
        }
        return  new ArrayList<>(map.values());
    }

}
