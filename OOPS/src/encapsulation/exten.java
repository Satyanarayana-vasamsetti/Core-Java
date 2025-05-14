package encapsulation;

public class exten extends encap{
	public static void main(String[] args) {
		exten exten = new exten();
		exten.setEmpid(1);
		exten.setEmpname("Satyanarayana");
		exten.setEmail("satyabanni11851@gmail.com");
		exten.setSalary(10000000d);
		System.out.println(exten.getEmpid());
		System.out.println(exten.getEmpname());
		System.out.println(exten.getEmail());
		System.out.println(exten.getSalary());
	}
}
