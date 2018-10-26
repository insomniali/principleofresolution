package think;


public class manager {
	
	  String [] predicates= {
			  "(rx)(~poor(x)&smart(x))>happy(x)",
			  "(rx)(read(x)>smart(x)",
			  "read(li)&~poor(x)",
			  "(rx)happy(x)>exciting(x)"
			  };
	  
	  String [] skolems= {
			  "poor(x)|~smart(x)|happy(x)",
			  "~read(a)|smart(a)",
			  "read(li)&~poor(z)",
			  "~happy(t)|exciting(t)"
	  };
	  
	  public String []childrenClause= {
			  "poor(x)|~smart(x)|happy(x)",
			  "~read(a)|smart(a)",
			  "read(li)",
			  "~poor(z)",
			  "~happy(t)|exciting(t)",
			  "~exciting(li)"
	  };
	
	  public void run() {
		  showQuestion();
		  System.out.println();
		  showPredicate(predicates);
		  System.out.println();
		  showSkolem(skolems);
		  System.out.println();
		  showChildrenClause(childrenClause);
		  System.out.println();
		  if(new AI().resolution(childrenClause)==true) {
			  System.out.println("归结结束，证明完毕");
		  }
		  else {
			  System.out.println("归结结束，证明失败");
		  }
		  
	  }
	  
      public void showQuestion() {
    	  System.out.println("假设：所有不贫穷且聪明的人都快乐。那些看书的人都是聪明的。李明能看书且不贫穷。快乐的人过着激动人心的生活。");
    	  System.out.println("求证：李明过着快乐的生活");
      }
      
      public void showPredicate(String []arrays) {
    	  System.out.println("问题的谓词表示为：");
    	  for(String i:arrays)
    	  System.out.println(i);
      }
      
      public void showSkolem(String []arrays) {
    	  System.out.println("问题的skolem表达式表示为：");
    	  for(String i:arrays)
    	  System.out.println(i);
      }

      public void showChildrenClause(String []arrays) {
    	  System.out.println("子句集表示为：");
    	  for(String i:arrays)
    	  System.out.println(i);
      }
} 
