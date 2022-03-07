package Logica;

import Entidad.ClienteEntidad;
import Entidad.ViandaEntidad;
import Hibernate.ClienteRepository;
import Hibernate.ViandasRepository;
import Interfaz.ViandasInterfaz;

import java.util.ArrayList;
import java.util.List;

public class ViandasLogica {
    public static boolean agregarVianda(ViandaEntidad vianda) {
        try{
            ViandasRepository viandasRepository = new ViandasRepository();
            viandasRepository.save(vianda);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean modificarVianda(ViandaEntidad vianda) {
        try{
            ViandasRepository viandasRepository = new ViandasRepository();
            viandasRepository.update(vianda);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<ViandaEntidad> getViandas() {
        ViandasRepository viandasRepository = new ViandasRepository();
        List<ViandaEntidad> viandasList = viandasRepository.findAll();
        ArrayList<ViandaEntidad> viandas = new ArrayList<>(viandasList);
        return viandas;
    }
}
