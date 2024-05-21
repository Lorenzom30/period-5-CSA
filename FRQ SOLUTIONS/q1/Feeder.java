public class Feeder{
  private int currentfood;

  public Feeder(int f){
    currentfood=f;
  }

  public void simulateoneday(int numbirds){
    boolean normal = (int)(Math.random()*100+1) <= 95;
    if(normal){
      int gramsate = (int)(Math.random()*(50-10+1)+10);
      int totalate = gramsate * numbirds;

      if (totalate > currentfood){
        currentfood = 0;
      }else{
        currentfood -= totalate;
      }
    }else{
      currentfood=0;
    }
  }
  public int simulatemanydays(int numbirds, int numdays){
    int day = 0;
    while(currentfood > 0 && day < numdays){
      day++;
      simulateoneday(numbirds);
      System.out.println("food left:" + getcurrentfood());
      System.out.println();
      
    }
    return day;
    
  }

  public int getcurrentfood(){
    return currentfood;
    
  }
  
}
