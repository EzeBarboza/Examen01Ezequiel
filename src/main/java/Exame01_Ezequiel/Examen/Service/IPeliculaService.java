
package Exame01_Ezequiel.Examen.Service;

import Exame01_Ezequiel.Examen.Entity.Pelicula;
import java.util.List;


public interface IPeliculaService {

   
    public List<pelicula>getAllPelicula();
    public pelicula getPeliculaById (long id);
    public void savePelicula (Pelicula pelicula);
    public void delete (long id);
}
