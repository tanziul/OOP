import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
        }catch(Exception e){
            return;
        }
        int T = Integer.parseInt(scanner.next());

        //remove as i add to list
        for(int i = 0; i < T; i++){
            int friendsStart = Integer.parseInt(scanner.next());
            int friendsDelete = Integer.parseInt(scanner.next());
            ArrayList<Integer> inputList = new ArrayList<Integer>();
            int currentPos = 0;
            for(int j = 0; j < friendsStart ; j++){
                inputList.add(Integer.parseInt(scanner.next()));
                if(friendsDelete > 0 && currentPos > 0 && inputList.get(currentPos) > inputList.get(currentPos-1)){
                    inputList.remove(currentPos-1);
                    friendsDelete--;
                    currentPos--;
                }else{
                    currentPos++;
                }
            }

            //remove remainder required to remove
            while(friendsDelete > 0 && currentPos < inputList.size()){
                if(currentPos > 0 && inputList.get(currentPos) > inputList.get(currentPos -1)){
                    inputList.remove(currentPos-1);
                    friendsDelete--;
                    currentPos--;
                }else{
                    currentPos++;
                }
            }

            //print
            for(int j = 0; j < inputList.size(); j++){
                System.out.print(inputList.get(j) + " ");
            }
            System.out.println();
        }
    }
}