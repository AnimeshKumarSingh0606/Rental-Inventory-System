package videorentalsystem;


	class Video{
	String title;
	boolean[]  flag=new boolean[10];
	int[] user_rating=new int[10];
        
	void being_checkedout(int i)
	{
		if(flag[i]==true)
			flag[i]=false;
	}
	void being_returned(int j)
	{
		if(flag[j]==false)
		  flag[j]=true;
	}
	void receive_a_rating(int n,int no)
	{
		user_rating[n]=no;
	}
}
