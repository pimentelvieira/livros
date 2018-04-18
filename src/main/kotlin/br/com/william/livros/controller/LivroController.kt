package br.com.william.livros.controller

import br.com.william.livros.br.com.william.livros.service.LivroService
import br.com.william.livros.model.Livro
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("livro")
class LivroController {

    @Autowired
    lateinit var livroService: LivroService

    @GetMapping
    fun list(): List<Livro> {
        return livroService.buscarTodos()
    }

    @PostMapping
    fun add(@RequestBody livro:Livro): Livro {
        return livroService.salvar(livro)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: String, @RequestBody livro: Livro): Livro {
        if (livroService.existeLivro(id)) {
            return livroService.salvar(livro)
        }
        return Livro()
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: String) {
        livroService.excluir(id)
    }
}