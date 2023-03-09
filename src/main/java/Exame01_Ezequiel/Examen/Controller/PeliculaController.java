package Exame01_Ezequiel.Examen.Controller;


import Exame01_Ezequiel.Examen.Entity.Pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeliculaController {
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @Autowired
    private ISalaService salaService;
    
    @GetMapping("/pelicula")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("titulo","Tabla Peliculas");
        model.addAttribute("peliculas", listaPelicula);
        return "pelicula";
    }
    @GetMapping("/peliculaN")
    public String agregarPelicula(Model model) {
        List<Pelicula> listaPelicula = peliculaService.listPelicula();
        model.addAttribute("persona", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.savePersona(persona);
        return "redirect:/persona";
    }
    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long idPersona) {
        personaService.delete(idPersona);
        return "redirect:/persona";
    }
    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id") Long idPersona, Model model) {
        Persona persona = personaService.getPersonaById(idPersona);
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("persona", persona);
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
}
 