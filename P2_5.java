class P2_5_Prog
{
	public static void main(String args[])
	{
		Object o = "abc";					//Creates an 'Object' that stores the data "abc"
		boolean b = o.equals("a, b, c");	//Creates a 'boolean', stores assigns it the value of "true"
		char c = o.charAt(1);				//Compile error - 'charAt' doesn't exist as a method for 'Object', only 'String'.
		Object o2 = b;						//Create a new 'Object' using the data in 'b' (boolean)
		String s = o;						//Compile error - 'o' cannot be assigned to 's' because 's' is a 'String', while 'o' is an 'Object'
		String t = (String) o;				//Compile error - object cannot be converted to string
		c = t.charAt(1);					//Compile error - 't' doesn't exist because of error on line 10.  Assuming 'o' to be a string instead of an object, c would be set to "b"
		c = t.charAt(3);					//Compile error - 't' doesn't exist because of error on line 10.  Assuming 'o' to be a string instead of an object, this would cause a array index error (unless the string were to be extended)
	}
}