package Entidad.Persistencia;

import Entidad.Mascota;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {

    MascotaJpaController mascotaPers = new MascotaJpaController();
    PersonaJpaController personaPers = new PersonaJpaController();

    public void crearMascota(Mascota mascota) {
        mascotaPers.create(mascota);
    }

    public void crearPersona(Persona persona) throws Exception {
        personaPers.create(persona);
    }

    public void modificarPersona(Persona persona) throws Exception {
        personaPers.edit(persona);
    }

    public void modificarMascota(Mascota mascota) throws Exception {
        mascotaPers.edit(mascota);
    }

    public ArrayList<Mascota> cargarMascotaDB() {
        List<Mascota> mascotasList = mascotaPers.findMascotaEntities();
        ArrayList<Mascota> mascotasArrayList = new ArrayList<>(mascotasList);
        return mascotasArrayList;
    }
    
    public ArrayList<Persona> cargarPersonaDB() {
        List<Persona> personasList = personaPers.findPersonaEntities();
        ArrayList<Persona> personasArrayList = new ArrayList<>(personasList);
        return personasArrayList;
    }
    
    public void eliminarPersona(Integer dni)throws Exception{
        personaPers.destroy(dni);
    }

}
