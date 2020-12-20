package com.realworld.io.api

import org.junit.Assert.assertNotNull
import org.junit.Test

class FormBookTest {

    private val formBook = FormBook()

    @Test
    fun getArticles() {
        val articles = formBook.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }

}