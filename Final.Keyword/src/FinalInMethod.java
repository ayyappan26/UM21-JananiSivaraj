class Grandfather1{
	public void overriddenmethod()
	{
		System.out.println("in grandfather over ridden method");
	}
}

class Father1 extends Grandfather1{
	final public void overriddenmethod()
{
	System.out.println("in father over ridden method");
}
	
}

class Son1 extends Father1{
	// we cant over ride the final method in parent.
	/*public void overriddenmethod()
	{
		System.out.println("in Son over ridden method");
	}*/
	
	
}

class daughter1 extends Father1{
	
	// we cant over ride the final method in parent.
	/*public void overriddenmethod()
	{
       System.out.println("in daughter over ridden method");
	}*/
	
}