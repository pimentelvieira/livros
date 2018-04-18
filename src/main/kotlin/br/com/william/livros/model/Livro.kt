package br.com.william.livros.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document()
data class Livro (@Id var id: String?,
                  var nome: String,
                  var autor: String,
                  var editora: String,
                  var paginas: Int) {

    constructor() : this("", "", "", "", 0)
}