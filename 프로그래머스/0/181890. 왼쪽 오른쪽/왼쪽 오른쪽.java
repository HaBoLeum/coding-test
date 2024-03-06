import java.util.ArrayList;
import java.util.List;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int count=0;
        List<String> le = new ArrayList<String>();
            
        for(int i=0; i<str_list.length; i++) {
            le.add(str_list[i]);
            if(str_list[i].equals("l")&&count==0) {
                le.remove(le.size()-1);
                return answer = le.toArray(new String[0]);
            }
            if(str_list[i].equals("r")&& count==0) {
                count++;
                le.clear();
            }
        }
        if (count==0) {
            return answer;
        }
        
        return answer = le.toArray(new String[0]);
    }
}