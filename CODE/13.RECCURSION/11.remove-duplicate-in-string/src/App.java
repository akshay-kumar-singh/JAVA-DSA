public class App {

    public static void removeduplicate(String str, int idx, StringBuilder newstr, boolean map[] ){
            if(idx == str.length()){
                System.out.println(newstr);
                return;
            }

            //kaam
            char currChar = str.charAt(idx);
            if(map[currChar-'a'] == true){
                //duplicate
                removeduplicate(str, idx+1, newstr, map);
            } else{
                map[currChar-'a'] = true;
                removeduplicate(str, idx+1, newstr.append(currChar), map);
            }

    }
    public static void main(String[] args) throws Exception {
        String str = "appnnnacollege";
        removeduplicate(str, 0,new StringBuilder(""),new boolean[26]);
    }
}
