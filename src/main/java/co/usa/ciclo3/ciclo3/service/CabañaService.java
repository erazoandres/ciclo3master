package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.modelo.Cabaña;
import co.usa.ciclo3.ciclo3.repository.CabañaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabañaService {

    @Autowired
    private CabañaRepository cabañaRepository;

    public List<Cabaña> getAll(){
        return cabañaRepository.getAll();
    }

    public Optional<Cabaña> getCabaña(int id){
        return cabañaRepository.getCabaña(id);
    }

    public Cabaña save(Cabaña cab){
        if(cab.getID() == null){
            return cabañaRepository.save(cab);
        }else{
            Optional<Cabaña> cab_aux = cabañaRepository.getCabaña(cab.getID());
            if(cab_aux.isEmpty()){
                return cabañaRepository.save(cab);
            }else{
                return cab;
            }
        }
    }


}
