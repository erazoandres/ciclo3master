package co.usa.ciclo3.ciclo3.web;

import co.usa.ciclo3.ciclo3.modelo.Cabaña;
import co.usa.ciclo3.ciclo3.service.CabañaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cabaña")
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})


public class CabañaController {

    @Autowired
    private CabañaService cabañaService;

    @GetMapping("/all")
    public List<Cabaña> getCabañas(){
        return cabañaService.getAll() ;
    }

    @GetMapping("/{id}")
    public Optional<Cabaña> getCabaña(@PathVariable("id") int id){
        return  cabañaService.getCabaña(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabaña save(@RequestBody Cabaña cab){
        return cabañaService.save(cab);
    }


}
