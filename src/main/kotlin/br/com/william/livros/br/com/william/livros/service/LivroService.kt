package br.com.william.livros.br.com.william.livros.service

import br.com.william.livros.model.Livro
import br.com.william.livros.repository.LivroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LivroService {

    @Autowired
    lateinit var livroRepository: LivroRepository

    fun buscarTodos() : List<Livro> {
        return livroRepository.findAll()
    }

    fun salvar(livro:Livro):Livro {
        livroRepository.save(livro)
        return livro
    }

    fun existeLivro(id: String) : Boolean {
        return livroRepository.existsById(id)
    }

    fun excluir(id: String)  {
        livroRepository.deleteById(id)
    }
}