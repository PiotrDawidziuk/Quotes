package pl.piotrdawidziuk.quotesmvvmtutorial.data

import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes  = MutableLiveData<List<Quote>>()
    
}