package com.example.visualnovel

import java.util.*

 class QuestRepository {
     val allSlides =
         arrayOf(
             slideZero, slideOne, slideTwo, slideThree, slideFour, slideFive, slideSix,
             slideSeven, slideEight, slideNine, slideTen
         )
    fun getQuestionById(CurrentId: Int):Storyboard {
        val result = allSlides.filter{ it.id == CurrentId }
        return result[0]
    }
}