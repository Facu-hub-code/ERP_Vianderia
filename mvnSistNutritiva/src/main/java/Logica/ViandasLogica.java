package Logica;

import Entidad.ViandaEntidad;
import Repository.ViandasRepository;

import java.util.ArrayList;
import java.util.List;

public class ViandasLogica {

    public static boolean addVianda(ViandaEntidad vianda) {
        try{
            ViandasRepository viandasRepository = new ViandasRepository();
            return viandasRepository.save(vianda);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateVianda(ViandaEntidad vianda) {
        try{
            ViandasRepository viandasRepository = new ViandasRepository();
            return viandasRepository.update(vianda);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static ArrayList<ViandaEntidad> getViandas() {
        ViandasRepository viandasRepository = new ViandasRepository();
        List<ViandaEntidad> viandasList = viandasRepository.findAll();
        return new ArrayList<>(viandasList);
    }

    public static ViandaEntidad getVianda(int id) {
        ViandasRepository viandasRepository = new ViandasRepository();
        return viandasRepository.findbyID(id);
    }

    public static boolean delete(ViandaEntidad vianda) {
        try{
            vianda.setAnulado(true);
            ViandasRepository viandasRepository = new ViandasRepository();
            return viandasRepository.update(vianda);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
