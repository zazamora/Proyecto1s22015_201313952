package com.transmetro.ws;

/*import java.util.ArrayList;
*/
import com.transmetro.estructuras.Bus;
import com.transmetro.estructuras.Chofer;
import com.transmetro.estructuras.Estacion;
import com.transmetro.estructuras.Informacion;
import com.transmetro.estructuras.ListaDoble;
import com.transmetro.estructuras.Ruta;
import com.transmetro.manejador.ManejadorClases;

public class ImplService implements IfaceServicios{

	@Override
	public Informacion validaLogin(String id, String pass, int tipo) {
		Informacion info = ManejadorClases.getInstancia().login(id, pass, tipo);
		if(info !=  null){
			System.out.println(info.getMensaje());
		}else{
			System.out.println("El usuario ingresado no ha sido encontrado.");
		}
		return info;
	}

	@Override
	public void crearAdmin(Informacion admin) {
		ManejadorClases.getInstancia().crearAdmin(admin);
	}

	@Override
	public String verAdmins() {
		return ManejadorClases.getInstancia().getInfoAdmin();
	}

	@Override
	public void crearChofer(Chofer chofer) {
		ManejadorClases.getInstancia().crearChofer(chofer);
	}

	@Override
	public void crearBus(Bus bus) {
		ManejadorClases.getInstancia().crearBus(bus);
	}

	@Override
	public void crearEstacion(Estacion estacion) {
		ManejadorClases.getInstancia().crearEstacion(estacion);
	}

	@Override
	public void crearRuta(Ruta ruta) {
		ManejadorClases.getInstancia().crearRuta(ruta);
	}

	/*@Override
	public ArrayList<Bus> getListaBuses() {
		return ManejadorClases.getInstancia().getBuses();
	}*/
	
	@Override
	public String getGraphAVLAdmin() {
		return ManejadorClases.getInstancia().getGAVLAdmin();
	}
	public ImplService(){
		
	}

	@Override
	public ListaDoble getListaBuses() {
		return ManejadorClases.getInstancia().getLBuses();
	}

	@Override
	public String[] getBuses() {
		return ManejadorClases.getInstancia().getLtBuses();
	}

	@Override
	public String[] getChoferes() {
		// TODO Auto-generated method stub
		return ManejadorClases.getInstancia().getDatosChoferes();
	}

	@Override
	public String[] getEstaciones() {
		// TODO Auto-generated method stub
		return ManejadorClases.getInstancia().getLEstaciones();
	}

	@Override
	public String[] getRutas() {
		return ManejadorClases.getInstancia().getLRutas();
	}

	@Override
	public String getGraphAVLChofer() {
		return ManejadorClases.getInstancia().getGraphChofer();
	}
}
