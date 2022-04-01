package Logica;

import Entidad.ViandaEntidad;
import Repository.ViandasRepository;

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

    public static ViandaEntidad getVianda(int id) {
        ViandasRepository viandasRepository = new ViandasRepository();
        ViandaEntidad vianda = viandasRepository.findbyID(id);
        return vianda;
    }

    public static boolean delete(ViandaEntidad vianda) {
        try{
            vianda.setAnulado(true);
            ViandasRepository viandasRepository = new ViandasRepository();
            viandasRepository.update(vianda);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
