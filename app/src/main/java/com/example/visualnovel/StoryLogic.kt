package com.example.visualnovel

import android.content.Context
import android.content.res.Resources
import android.provider.Settings.Global.getString

val slideZero = Storyboard(
    0, Resources.getSystem().getString(R.string.TitleZero), R.drawable.kirya,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideZeroRun1), 1),
        Answers(Resources.getSystem().getString(R.string.slideZeroCamp2), 2),
        Answers(Resources.getSystem().getString(R.string.slideZeroField3), 3)
    )
)
val slideOne = Storyboard(
    1, Resources.getSystem().getString(R.string.TitleOne), R.drawable.run,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideOneFilm1), 4),
        Answers(Resources.getSystem().getString(R.string.slideOneHW2), 5)
    )
)
val slideTwo = Storyboard(
    2, Resources.getSystem().getString(R.string.TitleTwo), R.drawable.camping,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideTwoFilm1), 4),
        Answers(Resources.getSystem().getString(R.string.slideTwoHW2), 5)
    )
)
val slideThree = Storyboard(
    3, Resources.getSystem().getString(R.string.TitleThree), R.drawable.sad,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideThreeFilm1), 4),
        Answers(Resources.getSystem().getString(R.string.slideThreeHW2), 5)
    )
)
val slideFour = Storyboard(
    4, Resources.getSystem().getString(R.string.TitleFour), R.drawable.film,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideFourLike1), 6),
        Answers(Resources.getSystem().getString(R.string.slideFourDislike2), 7)
    )
)
val slideFive = Storyboard(
    5, Resources.getSystem().getString(R.string.TitleFive), R.drawable.decor,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideFiveFilm1), 4),
        Answers(Resources.getSystem().getString(R.string.slideFiveDress2), 8)
    )
)
val slideSix = Storyboard(
    6, Resources.getSystem().getString(R.string.TitleSix), R.drawable.film,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideLate), -1)
    )
)
val slideSeven = Storyboard(
    7, Resources.getSystem().getString(R.string.TitleSeven), R.drawable.film, arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideLate), -1)
    )
)
val slideEight = Storyboard(
    8, Resources.getSystem().getString(R.string.TitleEight), R.drawable.holiday,
    arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideEightLike1), 9),
        Answers(Resources.getSystem().getString(R.string.slideEightDislike2), 10)
    )
)
val slideNine = Storyboard(
    9, Resources.getSystem().getString(R.string.TitleNine), R.drawable.holiday, arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideLate), -1)
    )
)
val slideTen = Storyboard(
    10, Resources.getSystem().getString(R.string.TitleTen), R.drawable.holiday, arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideLate), -1)
    )
)
val test = Storyboard(
    10, Resources.getSystem().getString(R.string.TitleTen), R.drawable.holiday, arrayOf(
        Answers(Resources.getSystem().getString(R.string.slideLate), -1)
    )
)
