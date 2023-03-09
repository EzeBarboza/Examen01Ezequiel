package Exame01_Ezequiel.Examen.Service;

import Exame01_Ezequiel.Examen.Entity.Pelicula;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
class PeliculaService implements IPeliculaService {

    @Override
    public List<pelicula> getAllPeliculas() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public pelicula getPeliculaById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void savePelicula(Pelicula pelicula) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
