package buddy;



public abstract  class facebooka{
abstract void loginpage();
abstract void logoutpage();
}

 class Features extends facebook
{
	void loginpage()
	{
		System.out.println("LOGIN SUCESSFULLY");
	}
	 void logoutpage() {
		 System.out.println("not SUCESS`");
	 }
	 
	 void go()
	 {
		 System.out.println("hello");
	 }
	 public static void main(String[] args) {
		Features f =new Features();
		f.loginpage();
	}
}

