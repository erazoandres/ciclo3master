package co.usa.ciclo3.ciclo3.repository;

import co.usa.ciclo3.ciclo3.modelo.Cabaña;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import co.usa.ciclo3.ciclo3.repository.crud.CabañaCrudRepository;
import java.util.List;
import java.util.Optional;

@Repository
public class CabañaRepository {
    @Autowired
    private CabañaCrudRepository cabañaCrudRepository;

    public List<Cabaña> getAll(){
        return (List<Cabaña>) cabañaCrudRepository.findAll();
    }

    public Optional<Cabaña> getCabaña(int id){
        return cabañaCrudRepository.findById(id);
    }

    public Cabaña save(Cabaña cab){
        return cabañaCrudRepository.save(cab);
    }


}
