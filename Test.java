package paquete;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class Test {

	public static void main(String[] args) {
		EntityManager manager;
		EntityManagerFactory emf;
		
		emf=Persistence.createEntityManagerFactory("P");
		
		manager=emf.createEntityManager();
		
		Cliente cliente_1= new Cliente(1, "Juan", "juan@gmail.com", "1144556622", "quintana 4152",
			              "Tango,SAP", "12354", "1546543");
		
		Cliente cliente_2= new Cliente(2, "Mariana", "mariana@gmail.com", "141546323", "lisandro de la torre 4152",
	              "SAP", "15463", "178552");
		
		Cliente cliente_3= new Cliente(3, "Pedro", "pedro@gmail.com", "245654654", "roque saenz peña 4152",
	              "Tango,SAP,ETC", "53533", "895465");
		
		Operador operador_1=new Operador(1, "Ruben", new Tecnico(1, "German", "saenz", "1654654",5).getNombre());
		
		Tecnico tecnico_1=new Tecnico(2,"Alexis","Cufre","1564546546",3);
		
		manager.getTransaction().begin();
		manager.persist(operador_1);
		manager.persist(tecnico_1);
		manager.persist(cliente_1);
		manager.persist(cliente_2);
		manager.persist(cliente_3);
		manager.getTransaction().commit();
		
		/*List<Cliente> clientes= (List<Cliente>)manager.createQuery("FROM CLIENTE").getResultList(); 
		
		for(Cliente c:clientes) {
			
			System.out.println(c.toString());
		}*/
		
		manager.close();
	}
	
	
	
    public String t_Inc_Resueltos(List<Tecnico> tecnicos) {
    	String g="";
    	int n=0;
    	
    	for(Tecnico t:tecnicos) 
    	{
    		if(t.getIncidentesResueltos()>= n) {
    			g=t.getNombre();
    			n=t.getIncidentesResueltos();
    			
    		}
    	}
    	
    	return g;
    }
	
    
    public String t_Rapido(List<Incidente> tecnicos) {
    	String g="";
    	double n=0;
    	for(Incidente e:tecnicos) {
    		
    		if(e.getTiempo()>= n) {
    			g=e.getTecnicoAsignado();
    			n=e.getTiempo();
    			}
    	}
    	return g;
    }
}
