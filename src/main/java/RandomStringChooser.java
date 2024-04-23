import java.util.*;
public class RandomStringChooser
{
private ArrayList<String> aden;
  public RandomStringChooser(String[] wordArray){
    aden=new ArrayList<String>();
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
