import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	

		public static void main(String[] args)
		{
			Employee hourlyEmp1=new Hourly("emp-H-101",150.0,20.0);
			hourlyEmp1.print();
			Employee hourlyEmp2=new Hourly("emp-H-102",120.0,20.0);
			hourlyEmp2.print();
			
			Employee salariedEmp1=new Salaried("emp-S-201",7800);
			salariedEmp1.print();
			Employee salariedEmp2=new Salaried("emp-S-202",6500);
			salariedEmp2.print();
			
			Order order1=new Order(1,LocalDate.of(2017, 1, 11),100.0);
			Order order2=new Order(1,LocalDate.of(2017, 1, 21),100.0);
			Order order3=new Order(1,LocalDate.of(2017, 1, 22),100.0);
			Order order4=new Order(1,LocalDate.of(2016, 12, 15),100.0);
			
			Employee commissionedEmp1=new Commissioned("emp-C-301",100.0,5);
			//Here we add orders for commissioned employee 1
			((Commissioned) commissionedEmp1).addOrder(order1);
			((Commissioned) commissionedEmp1).addOrder(order2);
			((Commissioned) commissionedEmp1).addOrder(order3);
			((Commissioned) commissionedEmp1).addOrder(order4);
			commissionedEmp1.print(3, 2017); 
			
			Employee commissionedEmp2=new Commissioned("emp-C-302",100.0,10);
			// Here we add orders for commissioned employee 2
			((Commissioned) commissionedEmp2).addOrder(order2);
			((Commissioned) commissionedEmp2).addOrder(order3);
			((Commissioned) commissionedEmp2).addOrder(order4);
			
			commissionedEmp2.print(2, 2017);  
			
			
		}

	}
