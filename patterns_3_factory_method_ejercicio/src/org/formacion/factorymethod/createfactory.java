package org.formacion.factorymethod;

public class createfactory {
	public  Lavadora crearlavadora(String create) {
		 if(create == null){  
            return null;  
           }  
		 if(create.equals("frontal")) {  
            return new LavadoraCargaFrontal();  
          }   
      else if(create.equals("superior")){  
           return new LavadoraCargaSuperior();  
       }   
		
		
		
		return null;
	}

}
