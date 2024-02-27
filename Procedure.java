
public class Procedure 
{
	// private fields
	private String name;
	private String date;
	private String practitionerName;
	private double charges;
	
	public Procedure(String name, String date)
	{
		this.name = name;
		this.date = date;
	}
	
	public Procedure(String name, String date, String practitionerName, double charges)
	{
		this.name = name;
		this.date = date;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	// accessor methods
	public String getName()
	{
		return name;
	}
	public String getDate()
	{
		return date;
	}
	public String getPractitionerName()
	{
		return practitionerName;
	}
	public double getCharges()
	{
		return charges;
	}
	
	// mutator methods
	public void setName(String N)
	{
		name = N;
	}
	public void setDate(String D)
	{
		date = D;
	}
	public void setPractitionerName(String P)
	{
		practitionerName = P;
	}
	public void setCharges(double C)
	{
		charges = C;
	}
	
	public String toString()
	{
		return "\tProcedure:\n" +
				"\tName: " + name + "\n" +
				"\tDate: " + date + "\n" +
				"\tPractitioner: " + practitionerName + "\n" +
				"\tCharges: " + charges;
		
	}
}
