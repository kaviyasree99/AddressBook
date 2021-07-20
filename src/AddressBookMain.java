
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book System");
		Contactdetails person = new Contactdetails();

        person.setFirstName("kaviya ");
        person.setLastName("");
        person.setAddress("Tnpl colony");
        person.setCity("karur");
        person.setState("TamilNadu");
        person.setZip(639136);
        person.setPhoneNumber("7894561230");
        person.setEmail("kaviyasree48@gmail.com");

        System.out.println(person);

	}
}
