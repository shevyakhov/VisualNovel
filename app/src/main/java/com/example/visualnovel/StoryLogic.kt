package com.example.visualnovel

import android.content.Context
import android.content.res.Resources
import android.provider.Settings.Global.getString

val slideZero = Storyboard(
    0, R.string.TitleZero, R.drawable.kirya,
    arrayOf(
        Answers(R.string.slideZeroRun1, 1),
        Answers(R.string.slideZeroCamp2, 2),
        Answers(R.string.slideZeroField3, 3)
    )
)
val slideOne = Storyboard(
    1, R.string.TitleOne, R.drawable.run,
    arrayOf(
        Answers(R.string.slideOneFilm1, 4),
        Answers(R.string.slideOneHW2, 5)
    )
)
val slideTwo = Storyboard(
    2, R.string.TitleTwo, R.drawable.camping,
    arrayOf(
        Answers(R.string.slideTwoFilm1, 4),
        Answers(R.string.slideTwoHW2, 5)
    )
)
val slideThree = Storyboard(
    3, R.string.TitleThree, R.drawable.sad,
    arrayOf(
        Answers(R.string.slideThreeFilm1, 4),
        Answers(R.string.slideThreeHW2, 5)
    )
)
val slideFour = Storyboard(
    4, R.string.TitleFour, R.drawable.film,
    arrayOf(
        Answers(R.string.slideFourLike1, 6),
        Answers(R.string.slideFourDislike2, 7)
    )
)
val slideFive = Storyboard(
    5, R.string.TitleFive, R.drawable.decor,
    arrayOf(
        Answers(R.string.slideFiveFilm1, 4),
        Answers(R.string.slideFiveDress2, 8)
    )
)
val slideSix = Storyboard(
    6, R.string.TitleSix, R.drawable.film,
    arrayOf(
        Answers(R.string.slideLate, -1)
    )
)
val slideSeven = Storyboard(
    7, R.string.TitleSeven, R.drawable.film, arrayOf(
        Answers(R.string.slideLate, -1)
    )
)
val slideEight = Storyboard(
    8, R.string.TitleEight, R.drawable.holiday,
    arrayOf(
        Answers(R.string.slideEightLike1, 9),
        Answers(R.string.slideEightDislike2, 10)
    )
)
val slideNine = Storyboard(
    9, R.string.TitleNine, R.drawable.holiday, arrayOf(
        Answers(R.string.slideLate, -1)
    )
)
val slideTen = Storyboard(
    10, R.string.TitleTen, R.drawable.holiday, arrayOf(
        Answers(R.string.slideLate, -1)
    )
)

