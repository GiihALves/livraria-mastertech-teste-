package CadastroLivro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class AppController {
    @GetMapping
    public String mostrarHome(){
        return "index";
    }
    @GetMapping("form")
    public String mostrarFormulario(){
        return "form";
    }
    @PostMapping("resposta")
    public String msotrarResultado(@ModelAttribute Livro livro, Model model){
        model.addAttribute("livro", livro.getNome());
        model.addAttribute("autor", livro.getAutor());
        model.addAttribute("descricao", livro.getDescricao());

        return "resposta";
    }

}
