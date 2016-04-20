package prueba;

import beans.InterpreteEspanol;
import beans.Traductor;

public class PruebaInterprete {
	public static void main(String[] args) {
		Traductor traductor = new Traductor();//se intancia dependencia traducor en Spring no se realiza esto
		InterpreteEspanol interprete = new InterpreteEspanol();//se instancia la dependencia interprete español 
		// El interprete se inyecta manualmente
		// Y solamente puede recibir un interprete en Español
		// No un interprete en Inglés u otros idiomas
		
		//se puede hacer utilizando interfaces mediante Spring
		traductor.setInterprete(interprete);//inyeccion de referencia
		//inyecta dependencia de interprete, se agrega a la clase traductor(inyeccion de dependencia)
		//se esta controlando manualmente
		//las ventajas de utilizar Spring es que en automatico estas dependencias van a ser resueltas por el framework
		
		
		traductor.setNombre("Carlos Esparza");//inyeccion de valores
		traductor.hablar();
	}
}
