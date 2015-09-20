package com.transmetro.manejador;

import java.util.ArrayList;

import com.transmetro.estructuras.*;


public class ManejadorClases {
	private static ManejadorClases instancia;
	public static ManejadorClases getInstancia(){
		if(instancia == null){
			instancia = new ManejadorClases();
		}
		return instancia;
	}
	
	private ArbolAVL arbolAdmin;
	private ArbolAVL arbolChofer;
	private ArbolAVL arbolEstacionC;
	private ArbolAVL arbolEstacionG;
	private ListaDoble listaBuses;
	private ListaDoble listaRutas;
	private String resChofer;
	public ManejadorClases(){
		arbolAdmin = new ArbolAVL();
		arbolChofer = new ArbolAVL();
		arbolEstacionC = new ArbolAVL();
		arbolEstacionG = new ArbolAVL();
		listaBuses = new ListaDoble();
		listaRutas = new ListaDoble();
		iniciarSistema();
	}
	public Informacion login(String id, String pass, int tipo){
		Informacion info = null;
		if(tipo == 1){
			info = arbolAdmin.buscar(id).raiz.dato;
			if(info!= null){
				if(info.getContrasena().equals(pass)){
					info.setMensaje("Usuario correcto.");
				}
			}
		}
		
		return info;
	}
	public String getInfoAdmin(){
		arbolAdmin.CodGraphviz();
	    return arbolAdmin.code;
	}
	public void crearAdmin(Informacion user){
		user.setComparable(user.getCorreo());
		arbolAdmin.insertar(user);
	}
	private void iniciarSistema(){
		Informacion inicial = new Informacion();
		inicial.setNombre("Anonimus");
		inicial.setApellido("Anoni");
		inicial.setCorreo("admin@transmetro.com");
		inicial.setComparable("admin@transmetro.com");
		inicial.setContrasena("123456");
		arbolAdmin.insertar(inicial);
	}
	public void crearChofer(Chofer chofer){
		Informacion info = new Informacion();
		info.setComparable(String.valueOf(chofer.getClave()));
		info.setContrasena(chofer.getContrasena());
		info.setChofer(chofer);
		arbolChofer.insertar(info);
	}
	public void crearBus(Bus bus){
		//Data datos = new Data();
		//datos.setBus(bus);
		System.out.println("Se ha creado un nuevo bus.");
		//datos.setIdBus(bus.getId());
		listaBuses.insertarNodo(bus);
	}
	public void crearRuta(Ruta ruta){
		Data datos = new Data();
		datos.setRuta(ruta);
		datos.setIdRuta(ruta.getNombre());
		//listaRutas.insertarNodo(datos);
	}
	public void crearEstacion(Estacion estacion){
		if(estacion.getTipo().equals("Clave")){
			Informacion info = new Informacion();
			info.setComparable(estacion.getId());
			info.setContrasena(estacion.getPass());
			info.setEstacion(estacion);
			arbolEstacionC.insertar(info);
		}else if(estacion.getTipo().equals("General")){
			Informacion info = new Informacion();
			info.setComparable(estacion.getId());
			info.setContrasena(estacion.getPass());
			info.setEstacion(estacion);
			arbolEstacionG.insertar(info);
		}
	}
	public ArrayList<Bus> getBuses(){
		NodoDoble aux = listaBuses.getPrimero();
		ArrayList<Bus> lBuses = new ArrayList<Bus>();
		while(aux != null){
			//System.out.println("Entro, " + aux.getDatos().getBus().getId());
			//lBuses.add(aux.getDatos().getBus());
			aux = aux.getSiguiente();
		}
		return lBuses;
	}
	public ListaDoble getLBuses(){
		return listaBuses;
	}
	public String[] getLtBuses(){
		String [] lBuses = new String[listaBuses.noNodos()];
		NodoDoble aux = listaBuses.getPrimero();
		int i = 0;
		while(aux != null){
			Bus b = aux.getDatos();
			String variable = b.getId() + "," + b.getRuta() + "," + b.getClaveChofer() + "," + b.getHorarioInicio() + "," + b.getHorarioFin() + "," + b.getFecha();
			lBuses[i] = variable;
			i++;
			aux = aux.getSiguiente();
		}
		return lBuses;
	}
	public String getGAVLAdmin(){
		arbolAdmin.CodGraphviz();
		return arbolAdmin.code;
	}
	public String[] getDatosChoferes(){
		//arbolChofer.noNodos();
		System.out.println("Numero de nodos:" + arbolChofer.cNodos + ", " + arbolChofer.cantidad());
		//arbolChofer.preOrden();
		//System.out.println("Numero de nodos2:" + arbolChofer.cNodos);
		String[] datos = new String[arbolChofer.cNodos];
		String lista = "";
		int i = 0;
		System.out.println("La salida es: " + arbolChofer.setDatos());
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		for(String e: arbolChofer.setDatos().split("\n")){
			datos[i] = e;
			i++;
		}
		return datos;
	}
	
	public String[] getLChoferes() {
		// TODO Auto-generated method stub
		return null;
	}
	public String[] getLEstaciones() {
		// TODO Auto-generated method stub
		return null;
	}
	public String[] getLRutas() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getGraphChofer() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getResChofer() {
		return resChofer;
	}
	public void setResChofer(String resChofer) {
		this.resChofer = resChofer;
	}
	
}
