package br.com.william.livros.repository

import br.com.william.livros.model.Livro
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface LivroRepository : MongoRepository<Livro, String> {
    fun findByNome(nome: String) : List<Livro>
}