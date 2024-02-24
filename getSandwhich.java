
  
  public class getSandwhich {
		
	  public String getSandwich(String str) {
		  // find whether there is at least one piece of bread

		  int wheresTheBread = -1;
		  for (int k = 0; k < str.length()-4; k++) {
		    if (str.substring(k, k+5).equals("bread")) {
		      wheresTheBread = k;
		    }
		  }
		  if(wheresTheBread == -1) {
			  return "";
		  }
		  int firstPlace = str.indexOf("bread");
	  }

	}

