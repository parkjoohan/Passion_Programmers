class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int i=0; i<signs.length; i++){
            if(signs[i]==false)
                answer -= absolutes[i];
            else
                answer += absolutes[i];
        }
        
        return answer;
    }
}

//// javascript
//function solution(absolutes, signs) {
//    var answer = 0;
//    
//    for(let i=0; i<absolutes.length; i++){
//        if(signs[i] == true)
//            answer += absolutes[i];
//        else
//            answer -= absolutes[i];
//    }
//    
//    return answer;
//}