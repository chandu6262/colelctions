import java.util.ArrayList;
public class Collections {

	public static void main(String[] args) {
		ArrayList<Sample> list = new ArrayList<Sample>();
		list.add(new Sample("chandu", "IT", "TCS", 25000));
		list.add(new Sample("Harish", "CBO", "wipro", 30000));
		list.add(new Sample("Ravi", "electronics", "Infosys", 50000));
        for(Sample p : list)
        {
        	System.out.println(p.e_name +" " + p.e_id + " " + p.company + " " + p.salery);
        }
		

	}

}

