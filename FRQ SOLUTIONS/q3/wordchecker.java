import java.util.*;

public class WordChecker {
  private ArrayList<String> wordList;

  public WordChecker(ArrayList<String> words) {
    wordList = words;
  }

  public boolean isWordChain() {
    for(int i = 1; i < wordList.size(); i++){
      if(wordList.get(i).indexOf(wordList.get(i-1)) == -1){
        return false;
      }
    }

    return false;
  }
  public ArrayList<String> createList(String word){
    ArrayList<String> list = new ArrayList<String>();
    for(int i = 0; i < wordList.size(); i++){
      if(wordList.get(i).indexOf(word) == 0){
        list.add(wordList.get(i));
        word = wordList.get(i);
      }
    }
    return list;
  }

  public ArrayList<String> createList(String target) {
    ArrayList<String> result = new ArrayList<String>();

    return result;             
  }
}
