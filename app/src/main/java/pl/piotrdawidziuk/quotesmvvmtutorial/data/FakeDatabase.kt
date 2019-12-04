package pl.piotrdawidziuk.quotesmvvmtutorial.data

class FakeDatabase private constructor(){

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        var quoteDao = FakeQuoteDao()
            private set 

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also { instance = it }
            }
    }
}