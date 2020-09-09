import java.util.HashSet;

class Main {
  static boolean hasUniqueChars(String str){
    HashSet <Character> strChars= new HashSet<Character>();
    for(int index=0; index < str.length(); index++){ //O(n)
      if(strChars.contains(str.charAt(index))){ //O(1)
        return false;
      }
      strChars.add(str.charAt(index)); //O(1)
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(hasUniqueChars("papa"));
  }
}