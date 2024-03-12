import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> listArr = new ArrayList<String>();
        List<String> listArr1 = new ArrayList<String>();
        List<String> listArr2 = new ArrayList<String>();
        
        for(int i = 0; i<picture.length; i++) {
            String[] arr = picture[i].split("");
            for(int j=0; j<arr.length; j++) {
                for(int y = 0; y<k; y++){
                    listArr.add(arr[j]);
                }
            }
            String str = String.join("", listArr);
            listArr.clear();
            listArr1.add(str);
            
        }
        for(int i = 0; i<listArr1.size(); i++){
            for(int j = 0; j<k; j++) {
                listArr2.add(listArr1.get(i));
            }
        }
        answer = listArr2.toArray(new String[0]);
        
        return answer;
    }
}