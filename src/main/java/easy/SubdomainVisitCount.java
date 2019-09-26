package easy;

import java.util.*;

/**
 * @program: leetcode
 * @description:
 * @author: wangtengke
 * @create: 2019-05-30
 **/
public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map =  new HashMap<>();
        for(String s: cpdomains){
            String[] domain = s.split(" ");
            Integer num = Integer.valueOf(domain[0]);
            String[] d = domain[1].split("\\.");
            String cur = "";
            for(int i=d.length-1; i>=0; i--){
                if(cur==""){
                    cur += d[i];
                    map.put(cur, map.getOrDefault(cur, 0) + num);
                }
                else {
                    cur = d[i] + "." + cur;
                    map.put(cur, map.getOrDefault(cur, 0) + num);
                }
            }
        }
        List<String> list = new LinkedList<>();
       for(String d : map.keySet()){
           list.add(map.get(d) + " "+ d);
       }
        return list;
    }

    public static void main(String[] args) {
        SubdomainVisitCount subdomainVisitCount = new SubdomainVisitCount();
        subdomainVisitCount.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }

}
