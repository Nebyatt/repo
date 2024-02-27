
public class Patient 
{
	// private fields
	private String first;
	private String middle;
	private String last;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNum;
	private String emergencyContactName;
	private String emergencyContactNum;
	
	public Patient()
	{
		first="null";
		middle="null";
		last="null";
		address="null";
		city="null";
		state="null";
		zipCode="null";
		phoneNum="null";
		emergencyContactName="null";
		emergencyContactNum="null";
	}
	public Patient(String first, String middle, String last)
	{
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	
	public Patient(String first, String middle, String last, String address, String city, String state, String zipCode, String emergencyContactName, String emergencyContactNum)
	{
		this.first = first;
		this.middle = middle;
		this.last = last;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zipCode=zipCode;
		this.emergencyContactName=emergencyContactName;
		this.emergencyContactNum=emergencyContactNum;
	}
	
	// accessor methods
	public String getFirst()
	{
		return first;
	}
	public String getMiddle()
	{
		return middle;
	}
	public String getLast()
	{
		return last;
	}
	public String getAddress()
	{
		return address;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getZipCode()
	{
		return zipCode;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public String getEmergencyContactName()
	{
		return emergencyContactName;
	}
	public String getEmergencyContactNum()
	{
		return emergencyContactNum;
	}
	
	// mutators method
	public void setFirst(String firstName)
	{
		first = firstName; 
	}
	public void setLast(String lastName)
	{
		last = lastName; 
	}
	public void setMiddle(String middleName)
	{
		middle = middleName; 
	}
	public void setAddress(String addy)
	{
		address=addy; 
	}
	public void setCity(String cityN)
	{
		city=cityN; 
	}
	public void setState(String stateN)
	{
		state=stateN; 
	}
	public void setzipCode(String ZIPCode)
	{
		zipCode=ZIPCode; 
	}
	public void setPhoneNum(String phoneNumber)
	{
		phoneNum=phoneNumber; 
	}
	public void setEContactName(String EContactName)
	{
		 emergencyContactName=EContactName; 
	}
	public void setEContactNum(String EContactNum)
	{
		 emergencyContactNum=EContactNum; 
	}

	// Method for Full Name
	public String buildFullName()
	{
		return (getFirst()+ " " +getMiddle()+ " " +getLast());
	}
	// Method for Address
	public String buildAddress()
	{
		return (getAddress()+ " " +getCity()+ " " +getState()+ " " +getZipCode());
	}
	// Method for Emergency Contact
	public String buildEmergencyContact()
	{
		return (getEmergencyContactName()+ " " +getEmergencyContactNum());
	}
	
	// toString method
    public String toString() 
    {
        return "Patient Information:\n" +
                "  Name: " + buildFullName() + "\n" +
                "  Address: " + buildAddress() + "\n" +
                "  Emergency Contact: " + buildEmergencyContact();
    }

}
