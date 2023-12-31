package com.unsam.proyecto;


import java.time.LocalDate;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unsam.proyecto.dominio.Cabania;
import com.unsam.proyecto.dominio.Casa;
import com.unsam.proyecto.dominio.Departamento;
import com.unsam.proyecto.dominio.Hospedaje;
import com.unsam.proyecto.dominio.Reserva;
import com.unsam.proyecto.dominio.Usuario;
import com.unsam.proyecto.repositorios.RepositorioHospedaje;
import com.unsam.proyecto.repositorios.RepositorioUsuarios;

@Service
public class ProyectoBootstrap implements InitializingBean{

	Usuario usuario1;
	Usuario usuario2;
	
	Hospedaje casa1;
	Hospedaje casa2;
	Hospedaje depto1;
	Hospedaje depto2;
	Hospedaje cabana1;
	Hospedaje cabana2;
	
	 
	@Autowired
	RepositorioHospedaje repositorioHospedaje;
	@Autowired
	private RepositorioUsuarios repositorioUsuarios;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		this.inicializarUsuarios();
		this.inicializarHospedajes();
		
	}

	private void inicializarHospedajes() {
		casa1 = new Casa();
		casa2 = new Casa();
		depto1 = new Departamento();
		depto2 = new Departamento();
		cabana1 = new Cabania();
		cabana2 = new Cabania();
		
	    casa1.setNombre("Casa Quinta");
        casa1.setDescripcion("Amplia casa de campo con vista panorámica.");
        casa1.setDetalle("La casa es espaciosa y ofrece un ambiente acogedor y relajante para tus vacaciones. Cuenta con múltiples habitaciones, ideales para familias grandes o grupos de amigos. La habitación principal tiene una cómoda cama king-size y un baño en suite");
        casa1.setAspectos("Espacio, WIFI, Lavado, Comodidades");
        casa1.setBaños(2);
        casa1.setHabitaciones(2);
        casa1.setHuespedes(3);
        casa1.setUbicacion("123 Main Street, Ciudad Tranquila");
        casa1.setCostoPorNoche(2500.00);
        casa1.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/403858343.jpg?k=6487c5b8cfc0b350641a8cd8f437334d2cc4d228d681c41b4cf9b980abb987d9&o=&hp=1");
        casa1.setPaisDestino("Argentina");
        casa1.setHuespedes(6);
        casa1.setTieneServcLimpieza(true);

        casa2.setNombre("Casa de Playa de Lujo");
        casa2.setDescripcion("Casa de playa con piscina privada y acceso directo a la playa.");
        casa2.setUbicacion("456 Beachfront Avenue, Playa Soleada");
        casa2.setDetalle("La casa es espaciosa y ofrece un ambiente acogedor y relajante para tus vacaciones. Cuenta con múltiples habitaciones, ideales para familias grandes o grupos de amigos. La habitación principal tiene una cómoda cama king-size y un baño en suite");
        casa2.setAspectos("Espacio, WIFI, Lavado, Comodidades");
        casa2.setBaños(2);
        casa2.setHabitaciones(3);
        casa2.setHuespedes(4);
        casa2.setCostoPorNoche(3500.00);
        casa2.setImagen("https://images.sparairnos.com/property/95366/images/1213329/full/20733b56-9fa1-4b83-b99b-3f29e0e718e3");
        casa2.setPaisDestino("Brasil");
        casa2.setHuespedes(8);
        casa2.setTieneServcLimpieza(true);
        // Ejemplos de departamentos
        depto1.setNombre("Departamento en el Centro");
        depto1.setDescripcion("Amplio departamento en el corazón de la ciudad.");
        depto1.setDetalle("Nuestro departamento en el centro de la ciudad es perfecto para quienes desean estar cerca de la acción. Con dos habitaciones elegantes y una sala de estar espaciosa, este departamento es ideal para grupos pequeños y familias. La cocina moderna está equipada con electrodomésticos de alta gama y una barra de desayuno.");
        depto1.setAspectos("Conectados, Lavarropa, WIFI, Urbano.");
        depto1.setBaños(2);
        depto1.setHabitaciones(2);
        depto1.setHuespedes(3);
        depto1.setUbicacion("789 Downtown Street, Ciudad Metropolitana");
        depto1.setCostoPorNoche(2200.00);
        depto1.setImagen("https://www.hogares.cl/wp-content/uploads/2018/06/SLA_3734.jpg");
        depto1.setPaisDestino("Argentina");
        depto1.setHuespedes(4);
        depto1.setTieneServcLimpieza(false);
        
        depto2.setNombre("Suite Ejecutiva con Vista al Mar");
        depto2.setDescripcion("Lujosa suite ejecutiva con vistas panorámicas al océano.");
        depto2.setDetalle("Nuestro departamento en el centro de la ciudad es perfecto para quienes desean estar cerca de la acción. Con dos habitaciones elegantes y una sala de estar espaciosa, este departamento es ideal para grupos pequeños y familias. La cocina moderna está equipada con electrodomésticos de alta gama y una barra de desayuno.");
        depto2.setAspectos("Conectados, Lavarropa, WIFI, Urbano.");
        depto2.setBaños(1);
        depto2.setHabitaciones(2);
        depto2.setHuespedes(2);
        depto2.setUbicacion("101 Oceanview Drive, Ciudad Costera");
        depto2.setCostoPorNoche(4500.00);
        depto2.setImagen("https://imanquehue.com/content/uploads/departamento-piloto.png");
        depto2.setPaisDestino("Estados Unidos");
        depto2.setHuespedes(2);
        depto2.setTieneServcLimpieza(true);
        // Ejemplos de cabañas
        cabana1.setNombre("Cabaña en el Bosque");
        cabana1.setDescripcion("Cabaña rústica rodeada de naturaleza.");
        cabana1.setDetalle("Nuestra cabaña es una escapada perfecta para los amantes de la naturaleza y la tranquilidad. Rodeada de bosques exuberantes, esta cabaña rústica ofrece un ambiente acogedor con una estufa de leña para mantenerte caliente en las noches frescas. Las dos habitaciones son cómodas y cuentan con camas suaves.");
        cabana1.setAspectos("Naturaleza, WIFI, Limpieza, Encanto.");
        cabana1.setBaños(1);
        cabana1.setHabitaciones(2);
        cabana1.setHuespedes(2);
        cabana1.setUbicacion("543 Forest Retreat, Bosque Encantado");
        cabana1.setCostoPorNoche(1800.00);
        cabana1.setImagen("https://phantom-elmundo.unidadeditorial.es/8cd61b03c221b63f5380554538c9897f/resize/473/f/webp/assets/multimedia/imagenes/2021/05/10/16206360937901.jpg");
        cabana1.setPaisDestino("Uruguay");
        cabana1.setHuespedes(4);
        cabana1.setTieneServcLimpieza(false);
        
        cabana2.setNombre("Cabaña de Montaña");
        cabana2.setDescripcion("Cabaña acogedora en las montañas.");
        cabana2.setDetalle("Nuestra cabaña es una escapada perfecta para los amantes de la naturaleza y la tranquilidad. Rodeada de bosques exuberantes, esta cabaña rústica ofrece un ambiente acogedor con una estufa de leña para mantenerte caliente en las noches frescas. Las dos habitaciones son cómodas y cuentan con camas suaves.");
        cabana2.setAspectos("Naturaleza, WIFI, Limpieza, Encanto.");
        cabana2.setBaños(1);
        cabana2.setHabitaciones(2);
        cabana2.setHuespedes(2);
        cabana2.setUbicacion("321 Mountain View Road, Montaña Alta");
        cabana2.setCostoPorNoche(2800.00);
        cabana2.setImagen("https://cf.bstatic.com/xdata/images/hotel/max1024x768/440749717.jpg?k=83f268be156bdbded33925621e94b30433fe9b2ab892a8e8f1b0e9b010975549&o=&hp=1");
        cabana2.setPaisDestino("Suiza");
        cabana2.setHuespedes(6);
		cabana2.setTieneServcLimpieza(true);
        
		repositorioHospedaje.guardar(casa1);
		repositorioHospedaje.guardar(casa2);
		repositorioHospedaje.guardar(depto1);
		repositorioHospedaje.guardar(depto2);
		repositorioHospedaje.guardar(cabana1);
		repositorioHospedaje.guardar(cabana2);
	}

	private void inicializarUsuarios() {
		usuario1 = new Usuario();
		usuario1.setNombreUsuario("Rodri1996");
		usuario1.setContraseña("1234");
		
		usuario2 = new Usuario();
		usuario2.setNombreUsuario("LeoMessi");
		usuario2.setContraseña("Messi10");
		
		repositorioUsuarios.guardar(usuario1);
		repositorioUsuarios.guardar(usuario2);
	}

}
