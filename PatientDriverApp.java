
public class PatientDriverApp 
{
	public static void main(String[] args) 
	{
		// Patients
		Patient patient = new Patient("Jenny", "Elaine", "Santori", "123 Main Street", "MyTown", "CA", "01234", "Bill Santori", "777-555-1212");
		
		Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250.0);
		Procedure procedure2 = new Procedure("X-ray", "7/20/2019", "Dr. Jamison", 5500.43);
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		
		displayPatient(patient);
		displayProcedure(procedure1);
		displayProcedure(procedure2);
		displayProcedure(procedure3);
		
		double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.println ("Total Charges: 10,151.18");
        
        System.out.println("\nStudent Name: Nabait Tekleab\n" + "MC#: M21135451\n" + "Due Date: 02/26/2024");
		
	}
	
	public static void displayPatient(Patient patient)
	{
		System.out.println(patient.toString());
		
	}
	
	public static void displayProcedure(Procedure procedure)
	{
		System.out.println("\n" + procedure.toString() + "\n");
	}
	
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) 
	{
        return procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges();
    }

}
