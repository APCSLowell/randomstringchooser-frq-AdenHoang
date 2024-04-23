import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> aden;
  public RandomStringChooser(String[] wordArray){
   for (int i =0; i<wordArray.length;i++){
     aden.add(wordArray[i]);
   }
  }
  public String getNext(){
  if(aden.size()>0)
  {
    return aden.remove((int)(Math.random()*aden.size()));
  }
    return "NONE";
  }
}
