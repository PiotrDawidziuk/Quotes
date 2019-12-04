package pl.piotrdawidziuk.quotesmvvmtutorial.utilities

import pl.piotrdawidziuk.quotesmvvmtutorial.data.FakeDatabase
import pl.piotrdawidziuk.quotesmvvmtutorial.data.QuoteRepository
import pl.piotrdawidziuk.quotesmvvmtutorial.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}