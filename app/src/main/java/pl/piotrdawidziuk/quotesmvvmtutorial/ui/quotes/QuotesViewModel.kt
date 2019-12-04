package pl.piotrdawidziuk.quotesmvvmtutorial.ui.quotes

import androidx.lifecycle.ViewModel
import pl.piotrdawidziuk.quotesmvvmtutorial.data.Quote
import pl.piotrdawidziuk.quotesmvvmtutorial.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel(){

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}