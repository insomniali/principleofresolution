package think;



public class AI {
	
       Boolean resolution(String []arrays) {
       String temp="";
       int time=1;
       
 	   for(String i:arrays) {
 		   if(time==1)temp+=i;
 		   else temp+="|"+i;
 		   System.out.println("µÚ"+time+"´Î¹é½á£º");
 		   temp=operate(temp);
 		   temp=eliminate(temp);
 		   System.out.println(temp);
 		   time++;
 	   }
 	   
 	   if(temp.equals(" "))return false;
 	   return true ;
       }
    	
       int calculatorLength(String str) {
    	   int i=0,j=0;
    	   i=str.indexOf("~");
    	   j=str.indexOf("(");
    	   if(i==-1) {
    		   return j;
    	   }
    	   else {
    		   return j-1;
    	   }
       }
       
       String operate(String str) {
    	   String []temps=str.split("\\|");
    	   for(int i=0;i<temps.length;i++) {
    		   int j=temps.length-1;
    		   int iLength=calculatorLength(temps[i]);
    		   while(j!=i) { 
    			   int jLength=calculatorLength(temps[j]);
    			   if(iLength==jLength) {
    				     if(temps[i].contains("~")) {
    				    	 if(temps[j].contains("~")) {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[j].length()];
    				    		 temps[i].getChars(1, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(1, temps[j].indexOf("("), c2, 0);
    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }
    				    		 if(i1==temps[i].length()) {
    				    			 char []c3=new char [temps[i].length()];
    				    			 char []c4=new char [temps[j].length()];
    				    			 char []c5=new char [temps[j].length()];
    				    			 temps[i].getChars(temps[i].indexOf("(")+1, temps[i].indexOf(")"), c3, 0);
    				    			 temps[j].getChars(0, temps[j].indexOf("(")+1, c4, 0);
    				    			 temps[j].getChars(temps[j].indexOf(")"), temps[j].length(), c5, 0);
    				    			 String strtemp="";
    				    			 for(int f=0;f<c4.length;f++) {
    				    				if(c4[f]=='('||c4[f]==')'||c4[f]=='~')strtemp+=c4[f];
    				    			    if(c4[f]<'a'||c4[f]>'z')continue;
    				    			    strtemp+=c4[f];
    				    			 }
    				    			 for(int f=0;f<c3.length;f++) {
    				    				 if(c3[f]=='('||c3[f]==')'||c3[f]=='~')strtemp+=c3[f];
    				    				 if(c3[f]<'a'||c3[f]>'z')continue;
    				    			     strtemp+=c3[f];
    				    			 }
    				    			 for(int f=0;f<c5.length;f++) {
    				    				 if(c5[f]=='('||c5[f]==')'||c5[f]=='~')strtemp+=c5[f];
    				    				 if(c5[f]<'a'||c5[f]>'z')continue;
    				    			     strtemp+=c5[f];
    				    			 }
    				    			 temps[j]=strtemp;
    				    		 }
    				    		 else {
    				    			 j--;
    				    			 continue;
    				    		 }
    				    	 }
    				    	 else {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[i].length()];
    				    		 temps[i].getChars(1, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(0, temps[j].indexOf("("), c2, 0);

    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }

    				    		 if(i1==temps[i].length()) {
    				    			 char []c3=new char [temps[i].length()];
    				    			 char []c4=new char [temps[j].length()];
    				    			 char []c5=new char [temps[j].length()];
    				    			 temps[i].getChars(temps[i].indexOf("(")+1, temps[i].indexOf(")"), c3, 0);
    				    			 temps[j].getChars(0, temps[j].indexOf("(")+1, c4, 0);
    				    			 temps[j].getChars(temps[j].indexOf(")"), temps[j].length(), c5, 0);
    				    			 String strtemp="";
    				    			 for(int f=0;f<c4.length;f++) {
    				    				if(c4[f]=='('||c4[f]==')'||c4[f]=='~')strtemp+=c4[f];
    				    			    if(c4[f]<'a'||c4[f]>'z')continue;
    				    			    strtemp+=c4[f];
    				    			 }
    				    			 for(int f=0;f<c3.length;f++) {
    				    				 if(c3[f]=='('||c3[f]==')'||c3[f]=='~')strtemp+=c3[f];
    				    				 if(c3[f]<'a'||c3[f]>'z')continue;
    				    			     strtemp+=c3[f];
    				    			 }
    				    			 for(int f=0;f<c5.length;f++) {
    				    				 if(c5[f]=='('||c5[f]==')'||c5[f]=='~')strtemp+=c5[f];
    				    				 if(c5[f]<'a'||c5[f]>'z')continue;
    				    			     strtemp+=c5[f];
    				    			 }
    				    			 temps[j]=strtemp;
    				    		 }
    				    	 }
    				     }
    				     else {
    				    	 if(temps[j].contains("~")) {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[j].length()];
    				    		 temps[i].getChars(0, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(1, temps[j].indexOf("("), c2, 0);
    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }
    				    		 if(i1==temps[i].length()) {
    				    			 char []c3=new char [temps[i].length()];
    				    			 char []c4=new char [temps[j].length()];
    				    			 char []c5=new char [temps[j].length()];
    				    			 temps[i].getChars(temps[i].indexOf("(")+1, temps[i].indexOf(")"), c3, 0);
    				    			 temps[j].getChars(0, temps[j].indexOf("(")+1, c4, 0);
    				    			 temps[j].getChars(temps[j].indexOf(")"), temps[j].length(), c5, 0);
    				    			 String strtemp="";
    				    			 for(int f=0;f<c4.length;f++) {
    				    				if(c4[f]=='('||c4[f]==')'||c4[f]=='~')strtemp+=c4[f];
    				    			    if(c4[f]<'a'||c4[f]>'z')continue;
    				    			    strtemp+=c4[f];
    				    			 }
    				    			 for(int f=0;f<c3.length;f++) {
    				    				 if(c3[f]=='('||c3[f]==')'||c3[f]=='~')strtemp+=c3[f];
    				    				 if(c3[f]<'a'||c3[f]>'z')continue;
    				    			     strtemp+=c3[f];
    				    			 }
    				    			 for(int f=0;f<c5.length;f++) {
    				    				 if(c5[f]=='('||c5[f]==')'||c5[f]=='~')strtemp+=c5[f];
    				    				 if(c5[f]<'a'||c5[f]>'z')continue;
    				    			     strtemp+=c5[f];
    				    			 }
    				    			 temps[j]=strtemp;
    				    		 }
    				    		 else {
    				    			 j--;
    				    			 continue;
    				    		 }
    				    	 }
    				    	 else {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[i].length()];
    				    		 temps[i].getChars(0, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(0, temps[j].indexOf("("), c2, 0);

    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }

    				    		 if(i1==temps[i].length()) {
    				    			 char []c3=new char [temps[i].length()];
    				    			 char []c4=new char [temps[j].length()];
    				    			 char []c5=new char [temps[j].length()];
    				    			 temps[i].getChars(temps[i].indexOf("(")+1, temps[i].indexOf(")"), c3, 0);
    				    			 temps[j].getChars(0, temps[j].indexOf("(")+1, c4, 0);
    				    			 temps[j].getChars(temps[j].indexOf(")"), temps[j].length(), c5, 0);
    				    			 String strtemp="";
    				    			 for(int f=0;f<c4.length;f++) {
    				    				if(c4[f]=='('||c4[f]==')'||c4[f]=='~')strtemp+=c4[f];
    				    			    if(c4[f]<'a'||c4[f]>'z')continue;
    				    			    strtemp+=c4[f];
    				    			 }
    				    			 for(int f=0;f<c3.length;f++) {
    				    				 if(c3[f]=='('||c3[f]==')'||c3[f]=='~')strtemp+=c3[f];
    				    				 if(c3[f]<'a'||c3[f]>'z')continue;
    				    			     strtemp+=c3[f];
    				    			 }
    				    			 for(int f=0;f<c5.length;f++) {
    				    				 if(c5[f]=='('||c5[f]==')'||c5[f]=='~')strtemp+=c5[f];
    				    				 if(c5[f]<'a'||c5[f]>'z')continue;
    				    			     strtemp+=c5[f];
    				    			 }
    				    			 temps[j]=strtemp;
    				    		 }
    				    	 }
    				     }
    			   }
    		   j--;
    		   }
    	   }
    	   String result="";
    	   int flag=0;
    	   for(String i:temps) {
    		   if(flag==0)result+=i;
    		   else result+="|"+i;
    		   flag++;
    	   }
    	   
    	   return result;
       }

       String eliminate(String str) {
    	   String []temps=str.split("\\|");
    	   for(int i=0;i<temps.length;i++) {
    		   int j=temps.length-1;
    		   int iLength=calculatorLength(temps[i]);
    		   while(j!=i) { 
    			   int jLength=calculatorLength(temps[j]);
    			   if(iLength==jLength) {
    				     if(temps[i].contains("~")) {
    				    	 if(temps[j].contains("~")) {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[j].length()];
    				    		 temps[i].getChars(1, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(1, temps[j].indexOf("("), c2, 0);
    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }
    				    		 if(i1==temps[i].length()) {
    				    			 temps[i]=" ";
    				    			 temps[j]=" ";
    				    		 }
    				    		 else {
    				    			 j--;
    				    			 continue;
    				    		 }
    				    	 }
    				    	 else {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[i].length()];
    				    		 temps[i].getChars(1, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(0, temps[j].indexOf("("), c2, 0);

    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }
    				    		 if(i1==temps[i].length()) { 
    				    			 temps[i]=" ";
				    			     temps[j]=" ";
				    			     break;
				    			 }
    				    	 }
    				     }
    				     else {
    				    	 if(temps[j].contains("~")) {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[j].length()];
    				    		 temps[i].getChars(0, temps[i].indexOf("("), c1, 0);
    				    		 temps[j].getChars(1, temps[j].indexOf("("), c2, 0);
    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }
    				    		 if(i1==temps[i].length()) { 
    				    			temps[i]=" ";
				    			    temps[j]=" ";
				    			    }
    				    		 else {
    				    			 j--;
    				    			 continue;
    				    		 }
    				    	 }
    				    	 else {
    				    		 char []c1=new char [temps[i].length()];
    				    		 char []c2=new char [temps[i].length()];
  
    				    		 temps[j].getChars(0, temps[j].indexOf("("), c2, 0);

    				    		 int i1=0;
                                 for(;i1<c1.length&&i1<c2.length;i1++) {
                                	 if(c1[i1]==c2[i1]) {
                                		 continue;
                                	 }
                                	 else break;
                                 }

    				    		 if(i1==temps[i].length()) { 
    				    			 temps[i]=" ";
				    			     temps[j]=" ";}
    				    	 }
    				     }
    			   }
    		   j--;
    		   }
    	   }
    	   String result="";
    	   int flag=0;
    	   for(String i:temps) {
    		   if(i.equals(" "))continue;
    		   if(flag==0)result+=i;
    		   else result+="|"+i;
    		   flag++;
    	   }
    	   
    	   return result;
       }

}
