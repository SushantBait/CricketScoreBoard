package Task;

public class CricketScore {
	 private static int totalOvers=5;
    
   static int  totalRuns(){
    	 int runs=0;
    	 int overCount=0;
    	int[] arr = new int[totalOvers*6];
        for( int x = 0; x <arr.length; x++) {
        	arr[x] = (int) (Math.random() * 6);
            	runs = runs + arr[x];   
            	System.out.println((x+1)+" Ball "+arr[x]+" runs");
            	if((x+1)%6==0){
            		overCount++;
	            	   System.out.println(overCount+" over completed \n");
            	}
        }
      	return runs;
    }
    
    static int totalWicket(){
        int  wicket= (int) (Math.random() * 11);
    	return wicket;
    }
    
    static void scoreBoard(){
    	int runOfTeam1,runOfTeam2;
    	int Wicket1,Wicket2;
    	float runrate1, runrate2;
    	System.out.println("Team 1: Runs as per ball");
    	runOfTeam1=totalRuns();
    	
    	System.out.println("Team 2: Runs as per ball ");
    	runOfTeam2=totalRuns();
    	System.out.println("************* CRICKET  SCOREBOARD *************\n");
    	System.out.println("**************** Team 1 ***********************");
    	System.out.println("Total Score:"+runOfTeam1);
    	Wicket1=totalWicket();
    	System.out.println("Team 1 Total Wickets:"+Wicket1);
    	runrate1=runOfTeam1/totalOvers;
    	System.out.println("Run Rate :"+runrate1);
    	System.out.println("**************** Team 2 ***********************");    	
    	System.out.println("Total Score:"+runOfTeam2);
    	Wicket2=totalWicket();
    	System.out.println("Team 2 Total Wickets:"+Wicket2);
    	runrate2=runOfTeam2/totalOvers;
    	System.out.println("Run Rate :"+runrate2);
    	System.out.println("****** Winner of this Match is  ***************");
    	if (runOfTeam1>runOfTeam2){
    		System.out.println("Team 1 is Win by "+(runOfTeam1-runOfTeam2)+" runs");
    	}
    	else if(runOfTeam1<runOfTeam2){
    		System.out.println("Team 2 is Win by "+(runOfTeam2-runOfTeam1)+" runs");     	
    	}
    	else{
    		System.out.println("Draw Or Tie Match with "+runOfTeam2+" runs");     	
        	
    	}
    }
	public static void main(String[] args)throws Exception {
		scoreBoard();
     } 
}

