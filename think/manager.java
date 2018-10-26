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
			  System.out.println("��������֤�����");
		  }
		  else {
			  System.out.println("��������֤��ʧ��");
		  }
		  
	  }
	  
      public void showQuestion() {
    	  System.out.println("���裺���в�ƶ���Ҵ������˶����֡���Щ������˶��Ǵ����ġ������ܿ����Ҳ�ƶ����ֵ��˹��ż������ĵ����");
    	  System.out.println("��֤���������ſ��ֵ�����");
      }
      
      public void showPredicate(String []arrays) {
    	  System.out.println("�����ν�ʱ�ʾΪ��");
    	  for(String i:arrays)
    	  System.out.println(i);
      }
      
      public void showSkolem(String []arrays) {
    	  System.out.println("�����skolem���ʽ��ʾΪ��");
    	  for(String i:arrays)
    	  System.out.println(i);
      }

      public void showChildrenClause(String []arrays) {
    	  System.out.println("�Ӿ伯��ʾΪ��");
    	  for(String i:arrays)
    	  System.out.println(i);
      }
} 
